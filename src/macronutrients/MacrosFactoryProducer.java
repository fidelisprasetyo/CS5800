package macronutrients;

public class MacrosFactoryProducer {

    public enum MacrosType {
        CARBS,
        PROTEIN,
        FATS
    }

    public static MacrosAbstractFactory getFactory(MacrosType type) {
        switch (type) {
            case CARBS:
                return new CarbsFactory();
            case PROTEIN:
                return new ProteinFactory();
            case FATS:
                return new FatsFactory();
            default:
                return null;
        }
    }

}
