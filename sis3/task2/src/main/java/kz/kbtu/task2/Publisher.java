package kz.kbtu.task2;

import kz.kbtu.task2.event.UserCreatedEvent;
import kz.kbtu.task2.event.UserRemovedEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class Publisher {
    private final ApplicationEventPublisher publisher;

    Publisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    void publishEvent(final String name) {
        publisher.publishEvent(new UserCreatedEvent(this, name));
        publisher.publishEvent(new UserRemovedEvent(name));
    }

}
