package lab;

import request.ResourceRequest;

/**
 * Abstract representation of a Lab Session.
 * 
 * Design Role:
 * - Defines common behavior for all lab types
 * - Enables polymorphic handling of different labs
 */
public abstract class LabSession {

    protected String name;

    public LabSession(String name) {
        this.name = name;
    }

    /**
     * Each lab type processes resource requests differently.
     */
    public abstract void processRequest(ResourceRequest request);

    public String getName() {
        return name;
    }
}
