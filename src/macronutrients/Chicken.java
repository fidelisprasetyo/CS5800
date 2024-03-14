package macronutrients;

public class Chicken extends Protein {
    @Override
    Protein createProtein() {
        Chicken chicken = new Chicken();
        chicken.setName("Chicken");
        return chicken;
    }
}
