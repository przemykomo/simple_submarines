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

public record MoveSubUpPacket(byte up) implements CustomPacketPayload {

    public static final CustomPacketPayload.Type<MoveSubUpPacket> TYPE =
        new CustomPacketPayload.Type<>(ResourceLocation.fromNamespaceAndPath(SimpleSubmarines.MODID, "sub_up"));

    public static final StreamCodec<ByteBuf, MoveSubUpPacket> STREAM_CODEC = StreamCodec.composite(
        ByteBufCodecs.BYTE,
        MoveSubUpPacket::up,
        MoveSubUpPacket::new
    );

    @Override
    public Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }

    public void handle(IPayloadContext context) {
        context.enqueueWork(() -> {
            Player player = context.player();
            if (player.getVehicle() instanceof SubmarineEntity submarineEntity && submarineEntity.getControllingPassenger() == player) {
                submarineEntity.setMoveUp(up);
            }
        });
    }
}
