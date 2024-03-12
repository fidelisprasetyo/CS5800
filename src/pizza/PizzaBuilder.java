package pizza;

public class PizzaBuilder {

    private boolean withPepperoni = false;
    private boolean withSausage = false;
    private boolean withMushrooms = false;
    private boolean withBacon = false;
    private boolean withOnions = false;
    private boolean withExtraCheese = false;
    private boolean withPeppers = false;
    private boolean withChicken = false;
    private boolean withOlives = false;
    private boolean withSpinach = false;
    private boolean withTomatoAndBasil = false;
    private boolean withBeef = false;
    private boolean withHam = false;
    private boolean withPesto = false;
    private boolean withSpicyPork = false;
    private boolean withHamAndPineapple = false;

    private Pizza.Size size;
    private String chainName = "";

    public PizzaBuilder(Pizza.Size size) {
        this.size = size;
    }

    public PizzaBuilder setSize(Pizza.Size size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder setPepperoni(boolean withPepperoni) {
        this.withPepperoni = withPepperoni;
        return this;
    }

    public PizzaBuilder setSausage(boolean withSausage) {
        this.withSausage = withSausage;
        return this;
    }

    public PizzaBuilder setMushrooms(boolean withMushrooms) {
        this.withMushrooms = withMushrooms;
        return this;
    }

    public PizzaBuilder setBacon(boolean withBacon) {
        this.withBacon = withBacon;
        return this;
    }

    public PizzaBuilder setOnions(boolean withOnions) {
        this.withOnions = withOnions;
        return this;
    }

    public PizzaBuilder setExtraCheese(boolean withExtraCheese) {
        this.withExtraCheese = withExtraCheese;
        return this;
    }

    public PizzaBuilder setPeppers(boolean withPeppers) {
        this.withPeppers = withPeppers;
        return this;
    }

    public PizzaBuilder setChicken(boolean withChicken) {
        this.withChicken = withChicken;
        return this;
    }

    public PizzaBuilder setOlives(boolean withOlives) {
        this.withOlives = withOlives;
        return this;
    }

    public PizzaBuilder setSpinach(boolean withSpinach) {
        this.withSpinach = withSpinach;
        return this;
    }

    public PizzaBuilder setTomatoAndBasil(boolean withTomatoAndBasil) {
        this.withTomatoAndBasil = withTomatoAndBasil;
        return this;
    }

    public PizzaBuilder setBeef(boolean withBeef) {
        this.withBeef = withBeef;
        return this;
    }

    public PizzaBuilder setHam(boolean withHam) {
        this.withHam = withHam;
        return this;
    }

    public PizzaBuilder setPesto(boolean withPesto) {
        this.withPesto = withPesto;
        return this;
    }

    public PizzaBuilder setSpicyPork(boolean withSpicyPork) {
        this.withSpicyPork = withSpicyPork;
        return this;
    }

    public PizzaBuilder setHamAndPineapple(boolean withHamAndPineapple) {
        this.withHamAndPineapple = withHamAndPineapple;
        return this;
    }

    public PizzaBuilder setChainName(String chainName) {
        this.chainName = chainName;
        return this;
    }

    public Pizza build() {
        return new Pizza(size, chainName,
                withPepperoni, withSausage, withMushrooms, withBacon,
                withOnions, withExtraCheese, withPeppers, withChicken,
                withOlives, withSpinach, withTomatoAndBasil, withBeef,
                withHam, withPesto, withSpicyPork, withHamAndPineapple);
    }

}
