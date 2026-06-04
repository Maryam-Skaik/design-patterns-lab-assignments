package factory;

import lab.LabSession;
import lab.RoboticsLabSession;

/**
 * Factory for Robotics Lab creation.
 */
public class RoboticsLabFactory extends LabFactory {

    @Override
    public LabSession createLab() {
        return new RoboticsLabSession();
    }
}
