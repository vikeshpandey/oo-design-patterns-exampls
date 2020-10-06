package main.java.io.github.vikeshpandey;

import main.java.io.github.vikeshpandey.listener.ClickEventListener;
import main.java.io.github.vikeshpandey.publisher.FooEventPublisher;

public class Main {

    public static void main(String[] args) {
        FooEventPublisher publisher = new FooEventPublisher();
        ClickEventListener clickEventListener = new ClickEventListener();

        publisher.registerListener(EventType.CLICK, clickEventListener);
        publisher.notify(EventType.CLICK);

        publisher.deregisterListener(EventType.CLICK, clickEventListener);
        publisher.notify(EventType.CLICK);

        publisher.registerListener(EventType.CLICK, clickEventListener);
        publisher.notify(EventType.CLICK);
    }
}
