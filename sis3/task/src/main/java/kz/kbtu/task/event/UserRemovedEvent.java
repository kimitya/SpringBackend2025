package kz.kbtu.task.event;


public class UserRemovedEvent {
    private String name;

    UserRemovedEvent(String name) {
        this.name = name;
    }
}
