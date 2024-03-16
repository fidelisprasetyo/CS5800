package macronutrients;

public class CarbsFactory {

    private static CarbsFactory carbsFactory = null;

    private CarbsFactory(){}

    public static CarbsFactory getInstance() {
        if (carbsFactory == null) {
            carbsFactory = new CarbsFactory();
        }
        return carbsFactory;
    }

    public Carbs createCarbs(String type) {
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
