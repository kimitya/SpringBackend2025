package kz.kbtu.task.event;

import org.springframework.context.ApplicationEvent;

public class UserCreatedEvent extends ApplicationEvent {
    private String name;

    UserCreatedEvent(Object source, String name){
        super(source);
        this.name = name;
    }
}
