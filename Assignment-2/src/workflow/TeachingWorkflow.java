package workflow;

/**
 * Abstract Template Method class defining the fixed workflow structure.
 */
public abstract class TeachingWorkflow {

    // Template method
    public final void executeWorkflow() {
        prepareMaterials();
        deliverContent();
        evaluateStudents();
        postProcess();
    }

    protected abstract void prepareMaterials(); // Step to be implemented per workflow
    protected abstract void deliverContent();    // Step to be implemented per workflow
    protected abstract void evaluateStudents();  // Step to be implemented per workflow

    // Optional hook method
    protected void postProcess() {
        System.out.println("Post-processing workflow (optional).");
    }
}
