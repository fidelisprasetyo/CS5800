package macronutrients;

public class Pistachio extends Carbs {
    @Override
    Carbs createCarbs() {
        Pistachio pistachio = new Pistachio();
        pistachio.setName("Pistachio");
        return pistachio;
    }
}
