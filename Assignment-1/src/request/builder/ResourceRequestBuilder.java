package request.builder;

import request.ResourceRequest;

/**
 * Builder Pattern for constructing ResourceRequest objects.
 * 
 * Design Role:
 * - Handles optional parameters cleanly
 * - Avoids telescoping constructors
 * - Improves readability and maintainability
 */
public class ResourceRequestBuilder {

    private String studentName;
    private String resourceType;
    private int duration;
    private String priority = "NORMAL";

    public ResourceRequestBuilder setStudentName(String studentName) {
        this.studentName = studentName;
        return this;
    }

    public ResourceRequestBuilder setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public ResourceRequestBuilder setDuration(int duration) {
        this.duration = duration;
        return this;
    }

    public ResourceRequestBuilder setPriority(String priority) {
        this.priority = priority;
        return this;
    }

    public ResourceRequest build() {
        return new ResourceRequest(studentName, resourceType, duration, priority);
    }
}
