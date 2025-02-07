package kz.kbtu.task1.publisher;

import kz.kbtu.task1.event.CustomSpringEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class CustomSpringEventPublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publishCustomEvent(final String message) {
        System.out.println("Publishing custom event. ");
        CustomSpringEvent customSpringEvent = new CustomSpringEvent(this, message);
        applicationEventPublisher.publishEvent(customSpringEvent);
    }

    public void publishMultipleEvents() {
        for (int i = 1; i <= 3; i++) {
            String message = "Event " + i;
            System.out.println(Thread.currentThread().getName() + " - Publishing: " + message);
            applicationEventPublisher.publishEvent(new CustomSpringEvent(this, message));
        }
    }

}
