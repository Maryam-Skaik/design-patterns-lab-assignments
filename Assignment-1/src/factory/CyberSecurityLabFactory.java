package factory;

import lab.CyberSecurityLabSession;
import lab.LabSession;

/**
 * Factory for Cyber Security Lab creation.
 */
public class CyberSecurityLabFactory extends LabFactory {

    @Override
    public LabSession createLab() {
        return new CyberSecurityLabSession();
    }
}
