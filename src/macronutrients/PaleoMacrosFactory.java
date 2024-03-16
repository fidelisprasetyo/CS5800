package macronutrients;

public class PaleoMacrosFactory extends MacrosFactory {

    private static PaleoMacrosFactory instance = null;

    private PaleoMacrosFactory() {
        this.carbsFactory = CarbsFactory.getInstance();
        this.proteinFactory = ProteinFactory.getInstance();
        this.fatsFactory = FatsFactory.getInstance();
    }

    public static PaleoMacrosFactory getInstance() {
        if (instance == null) {
            instance = new PaleoMacrosFactory();
        }
        return instance;
    }

    @Override
    public Carbs createCarbs() {
        return carbsFactory.createCarbs("pistachio");
    }

    @Override
    public Protein createProtein() {
        int PROTEIN_COUNT = 3;
        switch (randomInt(PROTEIN_COUNT)) {
            case 0:
                return proteinFactory.createProtein("fish");
            case 1:
                return proteinFactory.createProtein("chicken");
            case 2:
                return proteinFactory.createProtein("beef");
            default:
                return null;
        }
    }

    @Override
    public Fats createFats() {
        int FATS_COUNT = 3;
        switch (randomInt(FATS_COUNT)) {
            case 0:
                return fatsFactory.createFats("avocado");
            case 1:
                return fatsFactory.createFats("tuna");
            case 2:
                return fatsFactory.createFats("peanuts");
            default:
                return null;
        }
    }
}
