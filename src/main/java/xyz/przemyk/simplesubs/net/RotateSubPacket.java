package xyz.przemyk.simplesubs.net;

import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.neoforged.neoforge.network.handling.IPayloadContext;
import xyz.przemyk.simplesubs.SimpleSubmarines;
import xyz.przemyk.simplesubs.SubmarineEntity;

public record RotateSubPacket(byte right) implements CustomPacketPayload {

    public static final Type<RotateSubPacket> TYPE =
        new Type<>(ResourceLocation.fromNamespaceAndPath(SimpleSubmarines.MODID, "sub_right"));

    public static final StreamCodec<ByteBuf, RotateSubPacket> STREAM_CODEC = StreamCodec.composite(
        ByteBufCodecs.BYTE,
        RotateSubPacket::right,
        RotateSubPacket::new
    );

    @Override
    public Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }

    public void handle(IPayloadContext context) {
        context.enqueueWork(() -> {
            Player player = context.player();
            if (player.getVehicle() instanceof SubmarineEntity submarineEntity && submarineEntity.getControllingPassenger() == player) {
                submarineEntity.setRotate(right);
            }
        });
    }
}
