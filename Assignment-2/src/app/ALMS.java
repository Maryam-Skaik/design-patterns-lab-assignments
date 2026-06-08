package app;

import workflow.*;
import strategy.*;
import notification.subject.EventManager;
import notification.observer.*;

public class ALMS {

    public static void main(String[] args) {

        // Setup notification system
        EventManager eventManager = new EventManager();
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        Instructor instructor = new Instructor("Dr. Smith");

        eventManager.subscribe(student1);
        eventManager.subscribe(student2);
        eventManager.subscribe(instructor);

        // Select teaching workflow (Template Method)
        TeachingWorkflow workflow = new LabWorkflow();

        // Select learning strategy (Strategy Pattern)
        LearningStrategy strategy = new InteractiveStrategy();

        System.out.println("--- Starting Adaptive Learning Session ---");
        workflow.executeWorkflow();          // Execute workflow
        strategy.deliverContent();           // Deliver content dynamically
        eventManager.notify("Lab session started");  // Notify observers
    }
}
