package notification.subject;

import notification.observer.Observer;
import java.util.ArrayList;
import java.util.List;

/**
 * Event manager acts as the Subject in the Observer pattern.
 */
public class EventManager {

    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notify(String event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }
}
