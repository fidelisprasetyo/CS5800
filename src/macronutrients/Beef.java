package macronutrients;

public class Beef extends Protein {
    @Override
    Protein createProtein() {
        Beef beef = new Beef();
        beef.setName("Beef");
        return beef;
    }
}
