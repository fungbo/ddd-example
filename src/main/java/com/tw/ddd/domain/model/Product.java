package com.tw.ddd.domain.model;

public class Product {

    public Product() {
        DomainEventPublisher.instance().publish(new DomainEvent());
    }
}
