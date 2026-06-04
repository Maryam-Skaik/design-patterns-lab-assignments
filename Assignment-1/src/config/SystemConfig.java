package config;

/**
 * Singleton class responsible for holding global system-wide configuration.
 * 
 * Design Role:
 * - Ensures a single shared configuration across all labs
 * - Prevents inconsistent system rules
 * - Centralizes constraints like capacity and allowed resources
 */
public class SystemConfig {

    private static SystemConfig instance;

    private int labCapacity;
    private String[] allowedResources;

    /**
     * Private constructor to prevent external instantiation.
     */
    private SystemConfig() {
        this.labCapacity = 30;
        this.allowedResources = new String[]{"PC", "GPU", "Sensor Kit"};
    }

    /**
     * Global access point for the singleton instance.
     */
    public static synchronized SystemConfig getInstance() {
        if (instance == null) {
            instance = new SystemConfig();
        }
        return instance;
    }

    public int getLabCapacity() {
        return labCapacity;
    }

    public String[] getAllowedResources() {
        return allowedResources;
    }
}
