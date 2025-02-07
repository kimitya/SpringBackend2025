package kz.kbtu.task2.event;


public class UserRemovedEvent {
    private String name;

    public UserRemovedEvent(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
