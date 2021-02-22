package org.lzz.event.service;

import org.lzz.event.event.TestEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EventService {
    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    @Transactional
    public void eventService(){
        System.out.println("start");
        applicationEventPublisher.publishEvent(new TestEvent(1,"1"));
        System.out.println("end");
    }
}
