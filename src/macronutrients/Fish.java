package macronutrients;

public class Fish extends Protein {
    @Override
    Protein createProtein() {
        Fish fish = new Fish();
        fish.setName("Fish");
        return fish;
    }
}
