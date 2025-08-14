package singleton;

public class ConfigManager {

    private static ConfigManager instance;

    private String environment;
    private String apiUrl;

    private ConfigManager(String environment, String apiUrl) {
        this.environment = environment;
        this.apiUrl = apiUrl;
    }

    public static synchronized ConfigManager getInstance(String environment, String apiUrl) {
        if (instance == null) {
            instance = new ConfigManager(environment, apiUrl);
        }
        return instance;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }
}
