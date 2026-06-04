package lab;

import request.ResourceRequest;

/**
 * Concrete Lab implementation for Cyber Security labs.
 */
public class CyberSecurityLabSession extends LabSession {

    public CyberSecurityLabSession() {
        super("Cyber Security Lab");
    }

    @Override
    public void processRequest(ResourceRequest request) {
        System.out.println("[CYBER LAB] Processing request: " + request);
    }
}
