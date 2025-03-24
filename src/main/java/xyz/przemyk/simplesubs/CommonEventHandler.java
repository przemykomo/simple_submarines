package xyz.przemyk.simplesubs;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingBreatheEvent;

@EventBusSubscriber
public class CommonEventHandler {

    @SubscribeEvent
    public static void breatheEvent(LivingBreatheEvent event) {
        if (event.getEntity().getRootVehicle() instanceof SubmarineEntity) {
            event.setCanBreathe(true);
        }
    }
}
