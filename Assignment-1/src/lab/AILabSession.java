package lab;

import request.ResourceRequest;

/**
 * Concrete Lab implementation for AI labs.
 */
public class AILabSession extends LabSession {

    public AILabSession() {
        super("AI Lab");
    }

    @Override
    public void processRequest(ResourceRequest request) {
        System.out.println("[AI LAB] Processing request: " + request);
    }
}
