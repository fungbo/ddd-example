package com.tw.ddd.application;

import com.tw.ddd.domain.model.DomainEvent;
import com.tw.ddd.domain.model.DomainEventPublisher;
import com.tw.ddd.domain.model.DomainEventSubscriber;
import com.tw.ddd.domain.model.Product;

public class ApplicationService {

    //@Transactional
    public Product newProduct() {
        DomainEventPublisher.instance().subscribe(new DomainEventSubscriber<DomainEvent>() {
            @Override
            public Class<DomainEvent> subscribedToEventType() {
                return DomainEvent.class;
            }

            @Override
            public void handleEvent(DomainEvent aDomainEvent) {
                System.out.println("Process the domain event here");
            }
        });

        return new Product();
    }
}
