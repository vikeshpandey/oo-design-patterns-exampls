package main.java.io.github.vikeshpandey.publisher;

import main.java.io.github.vikeshpandey.EventType;
import main.java.io.github.vikeshpandey.listener.EventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FooEventPublisher implements EventPublisher {
    private Map<EventType, List<EventListener>> listenerMap = new HashMap<>();

    public void registerListener(EventType eventType, EventListener eventListener) {
        listenerMap.computeIfAbsent(eventType, (key) -> addListenerToList(eventListener));
    }

    private List<EventListener> addListenerToList(EventListener eventListener) {
        List<EventListener> list = new ArrayList<>();
        list.add(eventListener);
        return list;
    }

    public void notify(EventType eventType) {
        List<EventListener> listeners = listenerMap.get(eventType);
        listeners.forEach(eventListener -> eventListener.executeAction(eventType));
    }

    public void deregisterListener(EventType eventType, EventListener eventListener) {
        listenerMap.computeIfPresent(eventType, (key, value) -> removeListener(eventType, eventListener));
    }

    private List<EventListener> removeListener(EventType eventType, EventListener eventListener) {
        List<EventListener> listeners = listenerMap.get(eventType);
        listeners.remove(eventListener);
        return listeners;
    }

}
