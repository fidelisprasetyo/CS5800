package macronutrients;

public class Cheese extends Carbs {
    @Override
    Carbs createCarbs() {
        Pistachio pistachio = new Pistachio();
        pistachio.setName("Cheese");
        return pistachio;
    }
}
