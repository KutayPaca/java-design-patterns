package singleton;

public class Main {
    public static void main(String[] args) {
        ConfigManager config = ConfigManager.getInstance("DEV", "https://dev.api.com");

        System.out.println("Env: " + config.getEnvironment() + ", API: " + config.getApiUrl());

        config.setEnvironment("PROD");
        config.setApiUrl("https://prod.api.com");

        ConfigManager anotherConfig = ConfigManager.getInstance("TEST", "https://test.api.com");

        System.out.println("Env: " + anotherConfig.getEnvironment() + ", API: " + anotherConfig.getApiUrl());
    }
}
