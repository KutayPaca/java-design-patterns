package strategy;

public class Main {
    public static void main(String[] args) {
        Drone drone1 = new Drone("Drone-A", new DirectFlyStrategy());
        Drone drone2 = new Drone("Drone-B", new ObstacleAvoidanceStrategy());
        Drone drone3 = new Drone("Drone-C", new ExplorationStrategy());
        /* new deme sebebi: FlyStrategy bir interface içinde metodun imzası var ama
        gerçek davranışı yok. Interface tek başına bir nesne olamaz.*/

        System.out.println("=== Başlangıç Stratejileri ===");
        drone1.flyTo("Hedef-1");
        drone2.flyTo("Hedef-1");
        drone3.flyTo("Hedef-1");
        /* flyTo metodu strategy’yi kapsüllüyor.
        kullanıcı sadece hedefi veriyor, algoritmanın detayını bilmiyor.
        Burada Strategy Pattern’in faydası ortaya çıkıyor:
        -Aynı flyTo çağrısı farklı davranışlar üretiyor
        -Kodda if-else yok, algoritmalar birbirinden bağımsız*/

        System.out.println("\n=== Strateji Değişimi ===");
        drone1.setStrategy(new ObstacleAvoidanceStrategy());
        drone1.flyTo("Hedef-2");
    }
}
