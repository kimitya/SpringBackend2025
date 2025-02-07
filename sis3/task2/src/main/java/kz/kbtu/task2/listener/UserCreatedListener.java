package kz.kbtu.task2.listener;

import kz.kbtu.task2.event.UserCreatedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
class UserCreatedListener implements ApplicationListener<UserCreatedEvent> {

    @Override
    public void onApplicationEvent(UserCreatedEvent event) {
        System.out.println(String.format("User created: %s", event.getName()));
    }
}
