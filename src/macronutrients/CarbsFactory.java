package macronutrients;

import java.util.ArrayList;

public class CarbsFactory {

    public static Carbs getCarbs(Diet diet) {
        switch (diet) {
            case NO_RESTRICTION:
                return new RandomCarbs();
            case PALEO:
                return new PaleoCarbs();
            case VEGAN:
                return new VeganCarbs();
            case NUT_ALLERGY:
                return new NoNutCarbs();
            default:
                return null;
        }
    }

    public static ArrayList getCarbsList(Diet diet) {
        Carbs carbs = getCarbs(diet);
        return carbs.createCarbsList();
    }
}
