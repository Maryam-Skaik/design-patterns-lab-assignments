package strategy;

/**
 * Concrete Strategy for advanced mode.
 */
public class AdvancedStrategy implements LearningStrategy {

    @Override
    public void deliverContent() {
        System.out.println("Delivering detailed technical content.");
    }
}
