package macronutrients;

public class NoRestrictionMacrosFactory extends MacrosFactory {

    private static NoRestrictionMacrosFactory instance = null;

    private NoRestrictionMacrosFactory() {
        this.carbsFactory = CarbsFactory.getInstance();
        this.proteinFactory = ProteinFactory.getInstance();
        this.fatsFactory = FatsFactory.getInstance();
    }

    public static NoRestrictionMacrosFactory getInstance() {
        if (instance == null) {
            instance = new NoRestrictionMacrosFactory();
        }
        return instance;
    }

    @Override
    public Carbs createCarbs() {
        int carbsCount = 4;
        switch (randomInt(carbsCount)) {
            case 0:
                return carbsFactory.createCarbs("cheese");
            case 1:
                return carbsFactory.createCarbs("bread");
            case 2:
                return carbsFactory.createCarbs("lentils");
            case 3:
                return carbsFactory.createCarbs("pistachio");
            default:
                return null;
        }
    }

    @Override
    public Protein createProtein() {
        int proteinCount = 4;
        ProteinFactory proteinFactory = ProteinFactory.getInstance();
        switch (randomInt(proteinCount)) {
            case 0:
                return proteinFactory.createProtein("fish");
            case 1:
                return proteinFactory.createProtein("chicken");
            case 2:
                return proteinFactory.createProtein("beef");
            case 3:
                return proteinFactory.createProtein("tofu");
            default:
                return null;
        }
    }

    @Override
    public Fats createFats() {
        int fatsCount = 4;
        FatsFactory fatsFactory = FatsFactory.getInstance();
        switch (randomInt(fatsCount)) {
            case 0:
                return fatsFactory.createFats("avocado");
            case 1:
                return fatsFactory.createFats("sour cream");
            case 2:
                return fatsFactory.createFats("tuna");
            case 3:
                return fatsFactory.createFats("peanuts");
            default:
                return null;
        }
    }
}
