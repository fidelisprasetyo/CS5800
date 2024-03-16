package macronutrients;

public class FatsFactory {

    public static Fats createFats(String type) {
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
