package builder;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder()
                .dough("thin")
                .sauce("tomato")
                .topping("mozzarella")
                .size("large")
                .crustType("thick")
                .spicy(true)
                .extraCheese(true)
                .bakeTime(12)
                .build();
        System.out.println("Pizza ready: " + pizza.getDough() + ", " +
                pizza.getTopping() + ", " + pizza.getSize() + " size.");
    }
}
