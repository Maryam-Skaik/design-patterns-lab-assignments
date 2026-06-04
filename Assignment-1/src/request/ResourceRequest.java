package request;

/**
 * Represents a student resource request in a lab session.
 * 
 * Design Role:
 * - Immutable-like object built via Builder
 * - Supports optional parameters cleanly
 */
public class ResourceRequest {

    private String studentName;
    private String resourceType;
    private int duration;
    private String priority;

    public ResourceRequest(String studentName, String resourceType, int duration, String priority) {
        this.studentName = studentName;
        this.resourceType = resourceType;
        this.duration = duration;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Student=" + studentName +
                ", Resource=" + resourceType +
                ", Duration=" + duration +
                ", Priority=" + priority;
    }
}
