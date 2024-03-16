package macronutrients;

import java.util.ArrayList;

public class FatsFactory {

    public static Fats getFats(Diet diet) {
        switch (diet) {
            case NO_RESTRICTION:
                return new RandomFats();
            case PALEO:
                return new PaleoFats();
            case VEGAN:
                return new VeganFats();
            case NUT_ALLERGY:
                return new NoNutFats();
            default:
                return null;
        }
    }

    public static ArrayList getFatsList(Diet diet) {
        Fats fats = getFats(diet);
        return fats.createFatsList();
    }
}
