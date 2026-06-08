package notification.observer;

/**
 * Concrete Observer: Instructor
 */
public class Instructor implements Observer {

    private String name;

    public Instructor(String name) {
        this.name = name;
    }

    @Override
    public void update(String event) {
        System.out.println("Instructor " + name + " received notification: " + event);
    }
}
