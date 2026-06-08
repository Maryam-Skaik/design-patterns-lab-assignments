package workflow;

/**
 * Concrete Template Method for lecture-based teaching.
 */
public class LectureWorkflow extends TeachingWorkflow {

    @Override
    protected void prepareMaterials() {
        System.out.println("Preparing slides and lecture notes.");
    }

    @Override
    protected void deliverContent() {
        System.out.println("Delivering lecture content to students.");
    }

    @Override
    protected void evaluateStudents() {
        System.out.println("Conducting quizzes after lecture.");
    }
}
