package kz.kbtu.task1.listener;

import kz.kbtu.task1.event.CustomSpringEvent;
import kz.kbtu.task1.event.GenericSpringEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CustomSpringEventListener implements ApplicationListener <CustomSpringEvent> {
    @Override
    public void onApplicationEvent(CustomSpringEvent event) {
        System.out.println(Thread.currentThread().getName() + " - Received event: " + event.getMessage());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(Thread.currentThread().getName() + " - Finished processing: " + event.getMessage());
    }
}
