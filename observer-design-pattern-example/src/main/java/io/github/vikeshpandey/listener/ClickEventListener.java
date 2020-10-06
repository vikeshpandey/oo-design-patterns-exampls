package main.java.io.github.vikeshpandey.listener;

import main.java.io.github.vikeshpandey.EventType;

public class ClickEventListener implements EventListener {

    @Override
    public void executeAction(EventType eventType) {
        System.out.println("Received the click !!");
    }
}
