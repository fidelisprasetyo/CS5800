package macronutrients;

public class MacrosFactoryCreator {

    public static MacrosFactory createFactory(Diet diet) {
        switch (diet) {
            case NO_RESTRICTION:
                return NoRestrictionMacrosFactory.getInstance();
            case PALEO:
                return PaleoMacrosFactory.getInstance();
            case VEGAN:
                return VeganMacrosFactory.getInstance();
            case NUT_ALLERGY:
                return NoNutMacrosFactory.getInstance();
            default:
                System.out.println("Specify a valid diet plan");
                return null;
        }
    }
}
