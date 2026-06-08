package workflow;

/**
 * Concrete Template Method for lab-based teaching.
 */
public class LabWorkflow extends TeachingWorkflow {

    @Override
    protected void prepareMaterials() {
        System.out.println("Preparing lab equipment and virtual lab environment.");
    }

    @Override
    protected void deliverContent() {
        System.out.println("Students perform lab tasks under supervision.");
    }

    @Override
    protected void evaluateStudents() {
        System.out.println("Evaluating lab reports and exercises.");
    }
}
