package macronutrients;

import java.util.Random;

public class FatsFactory extends MacrosAbstractFactory {

    @Override
    public Fats getFats(Diet diet) {
        Fats fats;
        switch (diet) {
            case NO_RESTRICTION:
                fats = returnRandomFats();
                break;
            case PALEO:
            case VEGAN:
                fats = returnPaleoFats();
                break;
            case NUT_ALLERGY:
                fats = returnNoNutFats();
                break;
            default:
                return null;
        }
        assert fats != null;
        return fats.createFats();
    }

    @Override
    public Carbs getCarbs(Diet diet) {
        return null;
    }

    @Override
    public Protein getProtein(Diet diet) {
        return null;
    }

    private static Fats returnRandomFats() {
        Random random = new Random();
        int randomInt = random.nextInt(4);
        switch (randomInt) {
            case 0:
                return new Avocado();
            case 1:
                return new SourCream();
            case 2:
                return new Tuna();
            case 3:
                return new Peanuts();
            default:
                return null;
        }
    }

    private static Fats returnPaleoFats() {
        Random random = new Random();
        int randomInt = random.nextInt(3);
        switch (randomInt) {
            case 0:
                return new Avocado();
            case 1:
                return new Tuna();
            case 2:
                return new Peanuts();
            default:
                return null;
        }
    }

    private static Fats returnNoNutFats() {
        Random random = new Random();
        int randomInt = random.nextInt(3);
        switch (randomInt) {
            case 0:
                return new Avocado();
            case 1:
                return new SourCream();
            case 2:
                return new Tuna();
            default:
                return null;
        }
    }
}
