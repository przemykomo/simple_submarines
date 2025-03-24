package xyz.przemyk.simplesubs;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.*;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.phys.Vec3;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import xyz.przemyk.simplesubs.client.SubEntityRenderer;
import xyz.przemyk.simplesubs.client.SubmarineModel;
import xyz.przemyk.simplesubs.client.UBoatModel;
import xyz.przemyk.simplesubs.net.MoveSubForwardPacket;
import xyz.przemyk.simplesubs.net.MoveSubUpPacket;
import xyz.przemyk.simplesubs.net.RotateSubPacket;

import java.util.function.Supplier;

@SuppressWarnings("unused")
@Mod(SimpleSubmarines.MODID)
public class SimpleSubmarines {
    public static final String MODID = "simplesubs";
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);
    public static final DeferredRegister.Entities ENTITY_TYPES = DeferredRegister.createEntities(MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SUBS_TAB = CREATIVE_MODE_TABS.register("example_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.simplesubs"))
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(Items.ACACIA_BOAT::getDefaultInstance)
            .displayItems((parameters, output) -> output.accept(Items.ACACIA_BOAT)).build());

    public static final Supplier<EntityType<SubmarineEntity>> SUBMARINE = ENTITY_TYPES.registerEntityType(
        "submarine", SubmarineEntity::new, MobCategory.MISC,
        builder -> builder.sized(3.0f, 3.0f).fireImmune().clientTrackingRange(8).eyeHeight(2.5f)
            .setShouldReceiveVelocityUpdates(true).passengerAttachments(
                new Vec3(12 / 16.0, 10 / 16.0, -24 / 16.0), new Vec3(12 / 16.0, 10 / 16.0, -6 / 16.0),
                new Vec3(-13.5 / 16.0, 41 / 16.0, -17 / 16.0), new Vec3(-13.5 / 16.0, -4 / 16.0, 7 / 16.0)));

    public static final Supplier<EntityType<UBoatEntity>> UBOAT = ENTITY_TYPES.registerEntityType(
        "uboat", UBoatEntity::new, MobCategory.MISC,
        builder -> builder.sized(4.0f, 4.0f).fireImmune().clientTrackingRange(8).eyeHeight(2.5f)
            .setShouldReceiveVelocityUpdates(true).passengerAttachments(
                new Vec3(-1 / 16.0, 32 / 16.0, -30 / 16.0), new Vec3(-1 / 16.0, 42 / 16.0, 6 / 16.0),
                new Vec3(-1 / 16.0, 42 / 16.0, 32 / 16.0), new Vec3(-1 / 16.0, 49 / 16.0, 57 / 16.0),
                new Vec3(-10 / 16.0, 10 / 16.0, 30 / 16.0), new Vec3(8 / 16.0, 10 / 16.0, 30 / 16.0),
                new Vec3(-10 / 16.0, 10 / 16.0, 108 / 16.0), new Vec3(8 / 16.0, 10 / 16.0, 108 / 16.0)));

    public static final ModelLayerLocation SUB_LAYER = new ModelLayerLocation(
        ResourceLocation.fromNamespaceAndPath(MODID, "submarine"),
        "main"
    );

    public static final ModelLayerLocation UBOAT_LAYER = new ModelLayerLocation(
        ResourceLocation.fromNamespaceAndPath(MODID, "uboat"),
        "main"
    );

    public SimpleSubmarines(IEventBus modEventBus, ModContainer modContainer) {
        CREATIVE_MODE_TABS.register(modEventBus);
        ENTITY_TYPES.register(modEventBus);
        modEventBus.addListener(SimpleSubmarines::registerEntityRenderers);
        modEventBus.addListener(SimpleSubmarines::registerLayerDefinitions);
        modEventBus.addListener(SimpleSubmarines::registerPayloads);
    }

    public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(SUBMARINE.get(), (EntityRendererProvider.Context context) ->
            new SubEntityRenderer(context, new SubmarineModel(context.bakeLayer(SimpleSubmarines.SUB_LAYER))));
        event.registerEntityRenderer(UBOAT.get(), (EntityRendererProvider.Context context) ->
            new SubEntityRenderer(context, new UBoatModel(context.bakeLayer(SimpleSubmarines.UBOAT_LAYER))));
    }

    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(SUB_LAYER, SubmarineModel::createBodyLayer);
        event.registerLayerDefinition(UBOAT_LAYER, UBoatModel::createBodyLayer);
    }

    public static void registerPayloads(RegisterPayloadHandlersEvent event) {
        PayloadRegistrar registrar = event.registrar("1");

        registrar.playToServer(
            MoveSubUpPacket.TYPE,
            MoveSubUpPacket.STREAM_CODEC,
            MoveSubUpPacket::handle
        );

        registrar.playToServer(
            MoveSubForwardPacket.TYPE,
            MoveSubForwardPacket.STREAM_CODEC,
            MoveSubForwardPacket::handle
        );

        registrar.playToServer(
            RotateSubPacket.TYPE,
            RotateSubPacket.STREAM_CODEC,
            RotateSubPacket::handle
        );
    }
}
