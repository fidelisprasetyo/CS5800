package macronutrients;

public class Tofu extends Protein {
    @Override
    Protein createProtein() {
        Tofu tofu = new Tofu();
        tofu.setName("Tofu");
        return tofu;
    }
}
