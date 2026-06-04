package lab;

import request.ResourceRequest;

/**
 * Concrete Lab implementation for Robotics labs.
 */
public class RoboticsLabSession extends LabSession {

    public RoboticsLabSession() {
        super("Robotics Lab");
    }

    @Override
    public void processRequest(ResourceRequest request) {
        System.out.println("[ROBOTICS LAB] Processing request: " + request);
    }
}
