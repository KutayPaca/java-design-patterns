package strategy;

public class Drone {
    private String name;
    private FlyStrategy strategy;

    public Drone(String name, FlyStrategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public void setStrategy(FlyStrategy strategy) {
        this.strategy = strategy;
    }

    public void flyTo(String destination) {
        strategy.fly(name, destination);
    }

    /* strategy alanı private, kullanıcı direkt erişemiyor.
    flyTo Strategy’yi kapsüller , Kullanıcı sadece hedefi belirtecek
    algoritmanın nasıl uçtuğunu bilmesine gerek yok.
     */

}
