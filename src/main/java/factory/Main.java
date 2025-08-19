package factory;

public class Main {
    public static void main(String[] args) {
        // Factory ile drone oluşturma
        Drone drone1 = DroneFactory.createDrone("SAVUNMA DRONU", "Drone-A");
        Drone drone2 = DroneFactory.createDrone("SALDIRI DRONU", "Drone-B");
        Drone drone3 = DroneFactory.createDrone("KEŞİF DRONU", "Drone-C");

        System.out.println("=== Başlangıç Stratejileri ===");
        drone1.flyTo("Hedef-1");
        drone2.flyTo("Hedef-1");
        drone3.flyTo("Hedef-1");

        System.out.println("\n=== Strateji Değişimi ===");
        drone1.setStrategy(new ObstacleAvoidanceStrategy());
        drone1.flyTo("Hedef-2");
    }
}
