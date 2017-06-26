package com.tw.ddd.domain.model;

public abstract class DomainEventSubscriber<T> {

    public abstract Class<T> subscribedToEventType();


    public abstract void handleEvent(T aDomainEvent);
}
