package macronutrients;

import java.util.Random;

public class CarbsFactory extends MacrosAbstractFactory {

    @Override
    public Carbs getCarbs(Diet diet) {
        Carbs carbs;
        switch (diet) {
            case NO_RESTRICTION:
                carbs = returnRandomCarbs();
                break;
            case PALEO:
                carbs = returnPaleoCarbs();
                break;
            case VEGAN:
                carbs = returnVeganCarbs();
                break;
            case NUT_ALLERGY:
                carbs = returnNoNutsCarbs();
                break;
            default:
                return null;
        }
        assert carbs != null;
        return carbs.createCarbs();
    }

    @Override
    public Protein getProtein(Diet diet) {
        return null;
    }

    @Override
    public Fats getFats(Diet diet) {
        return null;
    }

    private static Carbs returnRandomCarbs() {
        Random random = new Random();
        int randomInt = random.nextInt(4);
        switch (randomInt) {
            case 0:
                return new Cheese();
            case 1:
                return new Bread();
            case 2:
                return new Lentils();
            case 3:
                return new Pistachio();
            default:
                return null;
        }
    }

    private static Carbs returnPaleoCarbs() {
        return new Pistachio();
    }

    private static Carbs returnVeganCarbs() {
        Random random = new Random();
        int randomInt = random.nextInt(3);
        switch (randomInt) {
            case 0:
                return new Bread();
            case 1:
                return new Lentils();
            case 2:
                return new Pistachio();
            default:
                return null;
        }
    }

    private static Carbs returnNoNutsCarbs() {
        Random random = new Random();
        int randomInt = random.nextInt(3);
        switch (randomInt) {
            case 0:
                return new Cheese();
            case 1:
                return new Bread();
            case 2:
                return new Lentils();
            default:
                return null;
        }
    }


}
