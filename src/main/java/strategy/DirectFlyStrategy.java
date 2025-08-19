package strategy;

public class DirectFlyStrategy implements FlyStrategy {
    @Override
    public void fly(String droneName, String destination) {
        System.out.println(droneName + " direk olarak " +  destination + " hedefine uçuyor");
    }
}
