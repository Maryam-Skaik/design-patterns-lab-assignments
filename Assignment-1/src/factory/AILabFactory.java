package factory;

import lab.AILabSession;
import lab.LabSession;

/**
 * Factory for AI Lab creation.
 */
public class AILabFactory extends LabFactory {

    @Override
    public LabSession createLab() {
        return new AILabSession();
    }
}
