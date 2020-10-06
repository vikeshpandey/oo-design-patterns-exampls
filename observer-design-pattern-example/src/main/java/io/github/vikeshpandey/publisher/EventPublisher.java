package main.java.io.github.vikeshpandey.publisher;

import main.java.io.github.vikeshpandey.EventType;
import main.java.io.github.vikeshpandey.listener.EventListener;

public interface EventPublisher {

    void registerListener(EventType eventType, EventListener eventListener);
    void notify(EventType eventType);
    void deregisterListener(EventType eventType, EventListener eventListener);
}
