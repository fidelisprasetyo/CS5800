package macronutrients;

import java.util.ArrayList;

public class ProteinFactory {

    public static Protein getProtein(Diet diet) {
        switch (diet) {
            case NO_RESTRICTION:
                return new RandomProtein();
            case PALEO:
                return new PaleoProtein();
            case VEGAN:
                return new VeganProtein();
            case NUT_ALLERGY:
                return new NoNutProtein();
            default:
                return null;
        }
    }

    public static ArrayList getProteinList(Diet diet) {
        Protein protein = getProtein(diet);
        return protein.createProteinList();
    }

}
