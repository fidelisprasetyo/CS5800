package pizza;

public class Pizza {
    public enum Size {
        SMALL,
        MEDIUM,
        LARGE
    }
    private final boolean withPepperoni;
    private final boolean withSausage;
    private final boolean withMushrooms;
    private final boolean withBacon;
    private final boolean withOnions;
    private final boolean withExtraCheese;
    private final boolean withPeppers;
    private final boolean withChicken;
    private final boolean withOlives;
    private final boolean withSpinach;
    private final boolean withTomatoAndBasil;
    private final boolean withBeef;
    private final boolean withHam;
    private final boolean withPesto;
    private final boolean withSpicyPork;
    private final boolean withHamAndPineapple;
    private final Size size;
    private final String chainName;

    public Pizza(Size size, String chainName,
                 boolean withPepperoni, boolean withSausage, boolean withMushrooms, boolean withBacon,
                 boolean withOnions, boolean withExtraCheese, boolean withPeppers, boolean withChicken,
                 boolean withOlives, boolean withSpinach, boolean withTomatoAndBasil, boolean withBeef,
                 boolean withHam, boolean withPesto, boolean withSpicyPork, boolean withHamAndPineapple) {
        this.size = size;
        this.chainName = chainName;

        this.withPepperoni = withPepperoni;
        this.withSausage = withSausage;
        this.withMushrooms = withMushrooms;
        this.withBacon = withBacon;
        this.withOnions = withOnions;
        this.withExtraCheese = withExtraCheese;
        this.withPeppers = withPeppers;
        this.withChicken = withChicken;
        this.withOlives = withOlives;
        this.withSpinach = withSpinach;
        this.withTomatoAndBasil = withTomatoAndBasil;
        this.withBeef = withBeef;
        this.withHam = withHam;
        this.withPesto = withPesto;
        this.withSpicyPork = withSpicyPork;
        this.withHamAndPineapple = withHamAndPineapple;
    }

    public void eat() {
        System.out.println("Pizza chain: " + chainName);
        System.out.println("Size: " + size.name());
        System.out.println("Toppings: " + toppingStringHelper() + "\n");
    }

    private String toppingStringHelper() {
        String toppings = "";
        toppings += withPepperoni ? "Pepperoni, " : "";
        toppings += withSausage ? "Sausage, " : "";
        toppings += withMushrooms ? "Mushrooms, " : "";
        toppings += withBacon ? "Bacon, " : "";
        toppings += withOnions ? "Onions, " : "";
        toppings += withExtraCheese ? "Extra Cheese, " : "";
        toppings += withPeppers ? "Peppers, " : "";
        toppings += withChicken ? "Chicken, " : "";
        toppings += withOlives ? "Olives, " : "";
        toppings += withSpinach ? "Spinach, " : "";
        toppings += withTomatoAndBasil ? "Tomato and Basil, " : "";
        toppings += withBeef ? "Beef, " : "";
        toppings += withHam ? "Ham, " : "";
        toppings += withPesto ? "Pesto, " : "";
        toppings += withSpicyPork ? "Spicy Pork, " : "";
        toppings += withHamAndPineapple ? "Ham and Pineapple, " : "";

        return toppings;
    }


}
