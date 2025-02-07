//package kz.kbtu.task1.listener;
//
//import kz.kbtu.task1.event.CustomSpringEvent;
//import org.springframework.transaction.event.TransactionPhase;
//import org.springframework.transaction.event.TransactionalEventListener;
//import org.springframework.stereotype.Component;
//
//@Component
//
//public class TransactionEventListener {
//    @TransactionalEventListener(phase = TransactionPhase.BEFORE_COMMIT)
//    public void handleCustom(CustomSpringEvent event) {
//        System.out.println("Handling event inside a transaction BEFORE COMMIT.");
//    }
//}
