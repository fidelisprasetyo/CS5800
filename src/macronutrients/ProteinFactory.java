package macronutrients;

public class ProteinFactory {

    public static Protein createProtein(String type) {
        switch (type) {
            case "fish":
                return new Fish();
            case "chicken":
                return new Chicken();
            case "beef":
                return new Beef();
            case "tofu":
                return new Tofu();
            default:
                return null;
        }
    }

}
