package kz.kbtu.task.listener;

import kz.kbtu.task2.event.UserRemovedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
class UserRemovedListener {

    @EventListener
    ReturnedEvent handleUserRemovedEvent(UserRemovedEvent event) {
        // handle UserRemovedEvent ...
        return new ReturnedEvent();
    }

    @EventListener
    void handleReturnedEvent(ReturnedEvent event) {
        // handle ReturnedEvent ...
    }

    @EventListener(condition = "#event.name eq 'reflectoring'")
    void handleConditionalListener(UserRemovedEvent event) {
        // handle UserRemovedEvent
    }

    @TransactionalEventListener(phase=TransactionPhase.AFTER_COMPLETION)
    void handleAfterUserRemoved(UserRemovedEvent event) {
        // handle UserRemovedEvent
    }
}