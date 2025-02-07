package kz.kbtu.task1.listener;

import kz.kbtu.task1.event.GenericSpringEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class GenericEventListener {
    @EventListener(condition = "#event.success")
    public void handleSuccessful(GenericSpringEvent <String> event) {
        System.out.println("Handling generic event (conditional).");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Finished handling generic event (conditional): " + event.getWhat());
    }
}
