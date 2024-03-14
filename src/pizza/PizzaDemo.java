package pizza;

public class PizzaDemo {
    public static void main(String[] args) {
        // Create a driver program to create three pizzas one of each size with 3, 6, and 9 toppings

        Pizza pizza1 = new PizzaBuilder(Pizza.Size.SMALL).setChainName("Pizza Hut")
                .setBacon(true)
                .setBeef(true)
                .setPepperoni(true)
                .build();

        Pizza pizza2 = new PizzaBuilder(Pizza.Size.MEDIUM).setChainName("Pizza Hut")
                .setChicken(true)
                .setMushrooms(true)
                .setOlives(true)
                .setTomatoAndBasil(true)
                .setExtraCheese(true)
                .setSpicyPork(true)
                .build();

        Pizza pizza3 = new PizzaBuilder(Pizza.Size.LARGE).setChainName("Pizza Hut")
                .setTomatoAndBasil(true)
                .setOnions(true)
                .setSausage(true)
                .setExtraCheese(true)
                .setSpicyPork(true)
                .setHamAndPineapple(true)
                .setPeppers(true)
                .setBeef(true)
                .setPesto(true)
                .build();
        pizza1.eat();
        pizza2.eat();
        pizza3.eat();

        // Assume you purchased another two pizza chains, Little Caesars, and Dominos.

        Pizza hutPizzaLarge = new PizzaBuilder(Pizza.Size.LARGE).setChainName("Pizza Hut")
                .setBacon(true)
                .setMushrooms(true)
                .setSausage(true)
                .build();

        Pizza hutPizzaSmall = new PizzaBuilder(Pizza.Size.SMALL).setChainName("Pizza Hut")
                .setExtraCheese(true)
                .setSpinach(true)
                .build();

        Pizza caesarsPizzaMed = new PizzaBuilder(Pizza.Size.MEDIUM).setChainName("Little Caesars")
                .setPepperoni(true)
                .setBeef(true)
                .setBacon(true)
                .setChicken(true)
                .setHam(true)
                .setMushrooms(true)
                .setExtraCheese(true)
                .setSausage(true)
                .build();

        Pizza caesarsPizzaSmall = new PizzaBuilder(Pizza.Size.SMALL).setChainName("Little Caesars")
                .setMushrooms(true)
                .setSpicyPork(true)
                .setSpinach(true)
                .setOlives(true)
                .setOnions(true)
                .setTomatoAndBasil(true)
                .build();

        Pizza dominosPizzaSmall = new PizzaBuilder(Pizza.Size.SMALL).setChainName("Dominos")
                .setExtraCheese(true)
                .build();

        Pizza dominosPizzaLarge = new PizzaBuilder(Pizza.Size.LARGE).setChainName("Dominos")
                .setChicken(true)
                .setPepperoni(true)
                .setExtraCheese(true)
                .build();

        hutPizzaLarge.eat();
        hutPizzaSmall.eat();
        caesarsPizzaMed.eat();
        caesarsPizzaSmall.eat();
        dominosPizzaSmall.eat();
        dominosPizzaLarge.eat();
    }
}
