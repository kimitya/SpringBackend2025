package kz.kbtu.task2.listener;

import kz.kbtu.task2.event.UserRemovedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
//import org.springframework.transaction.event.TransactionPhase;
//import org.springframework.transaction.event.TransactionalEventListener;

@Component
class UserRemovedListener {

    @EventListener
    ReturnedEvent handleUserRemovedEvent(UserRemovedEvent event) {
        // handle UserRemovedEvent ...
        return new ReturnedEvent();
    }

    @EventListener
    void handleReturnedEvent(ReturnedEvent event) {
        System.out.println("ReturnedEvent received.");
    }

    @EventListener(condition = "#event.name eq 'reflectoring'")
    void handleConditionalListener(UserRemovedEvent event) {
        System.out.println(String.format("User removed (Conditional): %s", event.getName()));
    }

//    @TransactionalEventListener(phase=TransactionPhase.AFTER_COMPLETION)
//    void handleAfterUserRemoved(UserRemovedEvent event) {
//        // handle UserRemovedEvent
//    }
}