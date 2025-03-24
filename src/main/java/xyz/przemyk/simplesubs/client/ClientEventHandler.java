package xyz.przemyk.simplesubs.client;

import net.minecraft.client.KeyMapping;
import net.minecraft.client.player.LocalPlayer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.CalculateDetachedCameraDistanceEvent;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.neoforge.network.PacketDistributor;
import xyz.przemyk.simplesubs.SubmarineEntity;
import xyz.przemyk.simplesubs.net.MoveSubForwardPacket;
import xyz.przemyk.simplesubs.net.MoveSubUpPacket;
import xyz.przemyk.simplesubs.net.RotateSubPacket;

@EventBusSubscriber(Dist.CLIENT)
public class ClientEventHandler {

    public static KeyMapping upKey;
    public static KeyMapping downKey;
    public static KeyMapping forwardKey;
    public static KeyMapping backKey;
    public static KeyMapping rightKey;
    public static KeyMapping leftKey;

    private static boolean oldUpState = false;
    private static boolean oldDownState = false;
    private static boolean oldForwardState = false;
    private static boolean oldBackState = false;
    private static boolean oldRightState = false;
    private static boolean oldLeftState = false;

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void onClientPlayerTick(PlayerTickEvent.Post event) {
        if (event.getEntity() instanceof LocalPlayer player) {
            if (player.getVehicle() instanceof SubmarineEntity) {
                boolean newUpState = upKey.isDown();
                boolean newDownState = downKey.isDown();
                boolean newForwardState = forwardKey.isDown();
                boolean newBackState = backKey.isDown();
                boolean newRightState = rightKey.isDown();
                boolean newLeftState = leftKey.isDown();

                if (newUpState != oldUpState || newDownState != oldDownState) {
                    PacketDistributor.sendToServer(new MoveSubUpPacket((byte) Boolean.compare(newUpState, newDownState)));
                }

                if (newForwardState != oldForwardState || newBackState != oldBackState) {
                    PacketDistributor.sendToServer(new MoveSubForwardPacket((byte) Boolean.compare(newForwardState, newBackState)));
                }

                if (newRightState != oldRightState || newLeftState != oldLeftState) {
                    PacketDistributor.sendToServer(new RotateSubPacket((byte) Boolean.compare(newRightState, newLeftState)));
                }

                oldUpState = newUpState;
                oldDownState = newDownState;
                oldForwardState = newForwardState;
                oldBackState = newBackState;
                oldRightState = newRightState;
                oldLeftState = newLeftState;
            } else {
                oldUpState = false;
                oldDownState = false;
                oldForwardState = false;
                oldBackState = false;
                oldRightState = false;
                oldLeftState = false;
            }
        }
    }

    @SubscribeEvent
    public static void onCalculateDetachedCameraDistance(CalculateDetachedCameraDistanceEvent event) {
        if (event.getCamera().getEntity().getVehicle() instanceof SubmarineEntity) {
            event.setDistance(8.0f);
        }
    }
}
