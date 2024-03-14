package macronutrients;

public class Lentils extends Carbs {
    @Override
    Carbs createCarbs() {
        Lentils lentils = new Lentils();
        lentils.setName("Lentils");
        return lentils;
    }
}