package macronutrients;

public class Bread extends Carbs {
    @Override
    Carbs createCarbs() {
        Bread bread = new Bread();
        bread.setName("Bread");
        return bread;
    }
}
