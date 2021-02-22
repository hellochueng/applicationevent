package org.lzz.event.listener;

import org.lzz.event.event.TestEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
public class ApplicationListener {

    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public void doEventListener(TestEvent testEvent) {
        System.out.println(testEvent);
    }
}
