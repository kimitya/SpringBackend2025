package kz.kbtu.task1.event;

import org.springframework.context.ApplicationEvent;

public class GenericSpringEvent <T> {
    private T what;
    protected boolean success;

    public GenericSpringEvent(T what, boolean success) {
        this.what = what;
        this.success = success;
    }

    public T getWhat() {
        return what;
    }

    public boolean getSuccess() {
        return success;
    }
}
