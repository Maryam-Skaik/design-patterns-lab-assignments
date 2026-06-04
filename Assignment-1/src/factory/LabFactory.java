package factory;

import lab.LabSession;

/**
 * Factory Method abstraction for creating Lab Sessions.
 * 
 * Design Role:
 * - Decouples object creation from usage
 * - Enables extensibility without modifying client code
 */
public abstract class LabFactory {

    public abstract LabSession createLab();
}
