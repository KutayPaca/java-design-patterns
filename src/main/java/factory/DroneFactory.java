package factory;

public class DroneFactory {
    public static Drone createDrone(String type, String name) {
        switch (type) {
            case "SAVUNMA DRONU":
                return new Drone(name, type, new DirectFlyStrategy());
            case "SALDIRI DRONU":
                return new Drone(name, type, new ObstacleAvoidanceStrategy());
            case "KEŞİF DRONU":
                return new Drone(name, type, new ExplorationStrategy());
            default:
                throw new IllegalArgumentException("Bilinmeyen drone tipi: " + type);
        }
    }
}

