package macronutrients;

public class ProteinFactory {

    private static ProteinFactory proteinFactory = null;

    private ProteinFactory(){}

    public static ProteinFactory getInstance() {
        if (proteinFactory == null) {
            proteinFactory = new ProteinFactory();
        }
        return proteinFactory;
    }

    public Protein createProtein(String type) {
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
