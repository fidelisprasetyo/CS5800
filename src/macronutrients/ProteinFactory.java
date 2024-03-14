package macronutrients;

import java.util.Random;

public class ProteinFactory extends MacrosAbstractFactory {

    @Override
    public Protein getProtein(Diet diet) {
        Protein protein;
        switch (diet) {
            case NO_RESTRICTION:
            case NUT_ALLERGY:
                protein = returnRandomProtein();
                break;
            case PALEO:
                protein = returnPaleoProtein();
                break;
            case VEGAN:
                protein = returnVeganProtein();
                break;
            default:
                return null;
        }
        assert protein != null;
        return protein.createProtein();
    }

    @Override
    public Carbs getCarbs(Diet diet) {
        return null;
    }

    @Override
    public Fats getFats(Diet diet) {
        return null;
    }

    private static Protein returnRandomProtein() {
        Random random = new Random();
        int randomInt = random.nextInt(4);
        switch (randomInt) {
            case 0:
                return new Fish();
            case 1:
                return new Chicken();
            case 2:
                return new Beef();
            case 3:
                return new Tofu();
            default:
                return null;
        }
    }

    private static Protein returnPaleoProtein() {
        Random random = new Random();
        int randomInt = random.nextInt(3);
        switch (randomInt) {
            case 0:
                return new Fish();
            case 1:
                return new Chicken();
            case 2:
                return new Beef();
            default:
                return null;
        }
    }

    private static Protein returnVeganProtein() {
        return new Tofu();
    }
}
