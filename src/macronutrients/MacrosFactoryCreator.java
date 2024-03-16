package macronutrients;

public class MacrosFactoryCreator {

    public static MacrosFactory createFactory(Diet diet) {
        switch (diet) {
            case NO_RESTRICTION:
                return new NoRestrictionMacrosFactory();
            case PALEO:
                return new PaleoMacrosFactory();
            case VEGAN:
                return new VeganMacrosFactory();
            case NUT_ALLERGY:
                return new NoNutMacrosFactory();
            default:
                System.out.println("Specify a valid diet plan");
                return null;
        }
    }
}
