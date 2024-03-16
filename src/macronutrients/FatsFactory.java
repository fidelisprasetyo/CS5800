package macronutrients;

public class FatsFactory {

    private static FatsFactory fatsFactory = null;

    private FatsFactory(){}

    public static FatsFactory getInstance() {
        if (fatsFactory == null) {
            fatsFactory = new FatsFactory();
        }
        return fatsFactory;
    }

    public Fats createFats(String type) {
        switch (type) {
            case "avocado":
                return new Avocado();
            case "sour cream":
                return new SourCream();
            case "tuna":
                return new Tuna();
            case "peanuts":
                return new Peanuts();
            default:
                return null;
        }
    }
}
