package factory;

public class Drone {
    private String name;
    private String type;
    private FlyStrategy strategy;

    public Drone(String name, String type, FlyStrategy strategy) {
        this.name = name;
        this.type = type;
        this.strategy = strategy;
    }

    public void setStrategy(FlyStrategy strategy) {
        this.strategy = strategy;
    }

    public void flyTo(String destination) {
        System.out.print("[" + type + "] ");
        strategy.fly(name, destination);
    }

}

