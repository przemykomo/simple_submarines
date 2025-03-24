package xyz.przemyk.simplesubs.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import xyz.przemyk.simplesubs.SimpleSubmarines;
import xyz.przemyk.simplesubs.SubmarineEntity;

public class SubEntityRenderer extends EntityRenderer<SubmarineEntity, SubmarineRenderState> {
    private static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(SimpleSubmarines.MODID, "textures/entity/submarine.png");

    private final EntityModel<EntityRenderState> model;

    public SubEntityRenderer(EntityRendererProvider.Context context, EntityModel<EntityRenderState> model) {
        super(context);
        this.model = model;
    }

    @Override
    public void render(SubmarineRenderState renderState, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight) {
        poseStack.pushPose();

        poseStack.mulPose(Axis.YP.rotationDegrees(-renderState.yRot));
        poseStack.scale(-1.0F, -1.0F, 1.0F);
        poseStack.translate(0.0F, -1F, 0.0F);

        this.model.setupAnim(renderState);
        RenderType rendertype = model.renderType(TEXTURE);
        VertexConsumer vertexconsumer = bufferSource.getBuffer(rendertype);
        this.model.renderToBuffer(poseStack, vertexconsumer, packedLight, OverlayTexture.NO_OVERLAY);

        poseStack.popPose();
        super.render(renderState, poseStack, bufferSource, packedLight);
    }

    @Override
    public SubmarineRenderState createRenderState() {
        return new SubmarineRenderState();
    }

    @Override
    public void extractRenderState(SubmarineEntity entity, SubmarineRenderState reusedState, float partialTick) {
        super.extractRenderState(entity, reusedState, partialTick);
        reusedState.yRot = Mth.lerp(partialTick, entity.yRotO, entity.getYRot());
    }
}
