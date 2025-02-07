package kz.kbtu.task2.event;

import org.springframework.context.ApplicationEvent;

public class UserCreatedEvent extends ApplicationEvent {
    private String name;

    public UserCreatedEvent(Object source, String name){
        super(source);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
