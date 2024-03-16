package macronutrients;

public class NoNutMacrosFactory extends MacrosFactory {

    private static NoNutMacrosFactory instance = null;

    private NoNutMacrosFactory() {
        this.carbsFactory = CarbsFactory.getInstance();
        this.proteinFactory = ProteinFactory.getInstance();
        this.fatsFactory = FatsFactory.getInstance();
    }

    public static NoNutMacrosFactory getInstance() {
        if (instance == null) {
            instance = new NoNutMacrosFactory();
        }
        return instance;
    }

    @Override
    public Carbs createCarbs() {
        int carbsCount = 3;
        switch (randomInt(carbsCount)) {
            case 0:
                return carbsFactory.createCarbs("cheese");
            case 1:
                return carbsFactory.createCarbs("bread");
            case 2:
                return carbsFactory.createCarbs("lentils");
            default:
                return null;
        }
    }

    @Override
    public Protein createProtein() {
        int proteinCount = 4;
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
        int fatsCount = 3;
        switch (randomInt(fatsCount)) {
            case 0:
                return fatsFactory.createFats("avocado");
            case 1:
                return fatsFactory.createFats("sour cream");
            case 2:
                return fatsFactory.createFats("tuna");
            default:
                return null;
        }
    }
}
