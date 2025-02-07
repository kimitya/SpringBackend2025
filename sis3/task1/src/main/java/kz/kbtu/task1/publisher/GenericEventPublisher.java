package kz.kbtu.task1.publisher;

import kz.kbtu.task1.event.GenericSpringEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class GenericEventPublisher <T> {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public <T> void publishEvent(T eventData, boolean success) {
        System.out.println("Publishing event in thread: " + Thread.currentThread().getName());
        GenericSpringEvent<T> event = new GenericSpringEvent<>( eventData, success);
        applicationEventPublisher.publishEvent(event);
    }

}
