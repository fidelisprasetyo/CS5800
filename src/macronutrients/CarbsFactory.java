package macronutrients;

public class CarbsFactory {

    public static Carbs createCarbs(String type) {
        switch (type) {
            case "cheese":
                return new Cheese();
            case "bread":
                return new Bread();
            case "lentils":
                return new Lentils();
            case "pistachio":
                return new Pistachio();
            default:
                return null;
        }
    }
}
