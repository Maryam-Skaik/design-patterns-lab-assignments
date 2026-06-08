package strategy;

/**
 * Concrete Strategy for beginner mode.
 */
public class BeginnerStrategy implements LearningStrategy {

    @Override
    public void deliverContent() {
        System.out.println("Delivering simplified beginner-friendly content.");
    }
}
