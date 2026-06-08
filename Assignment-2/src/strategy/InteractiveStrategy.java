package strategy;

/**
 * Concrete Strategy for interactive mode.
 */
public class InteractiveStrategy implements LearningStrategy {

    @Override
    public void deliverContent() {
        System.out.println("Delivering step-by-step interactive content.");
    }
}
