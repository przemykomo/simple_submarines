package xyz.przemyk.simplesubs.client;

import net.minecraft.client.KeyMapping;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import org.lwjgl.glfw.GLFW;

@EventBusSubscriber(value = Dist.CLIENT, bus = EventBusSubscriber.Bus.MOD)
public class ClientSetup {

    @SubscribeEvent
    public static void registerKeyBindings(RegisterKeyMappingsEvent event) {
        ClientEventHandler.upKey = new KeyMapping("key.move_sub_up.desc", GLFW.GLFW_KEY_SPACE, "key.simplesubs.category");
        ClientEventHandler.downKey = new KeyMapping("key.move_sub_down.desc", GLFW.GLFW_KEY_X, "key.simplesubs.category");
        ClientEventHandler.forwardKey = new KeyMapping("key.move_sub_forward.desc", GLFW.GLFW_KEY_W, "key.simplesubs.category");
        ClientEventHandler.backKey = new KeyMapping("key.move_sub_back.desc", GLFW.GLFW_KEY_S, "key.simplesubs.category");
        ClientEventHandler.rightKey = new KeyMapping("key.move_sub_right.desc", GLFW.GLFW_KEY_D, "key.simplesubs.category");
        ClientEventHandler.leftKey = new KeyMapping("key.move_sub_left.desc", GLFW.GLFW_KEY_A, "key.simplesubs.category");
        event.register(ClientEventHandler.upKey);
        event.register(ClientEventHandler.downKey);
        event.register(ClientEventHandler.forwardKey);
        event.register(ClientEventHandler.backKey);
        event.register(ClientEventHandler.rightKey);
        event.register(ClientEventHandler.leftKey);
    }
}
