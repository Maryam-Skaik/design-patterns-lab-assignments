package notification.observer;

/**
 * Concrete Observer: Student
 */
public class Student implements Observer {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String event) {
        System.out.println("Student " + name + " received notification: " + event);
    }
}
