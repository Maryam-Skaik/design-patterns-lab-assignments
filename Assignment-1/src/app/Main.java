package app;

import factory.AILabFactory;
import factory.LabFactory;
import lab.LabSession;
import request.ResourceRequest;
import request.builder.ResourceRequestBuilder;

/**
 * Demonstrates full system flow:
 * - Factory Method (Lab creation)
 * - Builder Pattern (Request creation)
 * - Singleton (global configuration)
 */
public class Main {

    public static void main(String[] args) {

        // 1. Create Lab using Factory Method
        LabFactory factory = new AILabFactory();
        LabSession lab = factory.createLab();

        // 2. Build Resource Request using Builder
        ResourceRequest request = new ResourceRequestBuilder()
                .setStudentName("Maryam")
                .setResourceType("GPU")
                .setDuration(2)
                .setPriority("HIGH")
                .build();

        // 3. Process request
        lab.processRequest(request);
    }
}
