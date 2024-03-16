package macronutrients;

public class VeganMacrosFactory extends MacrosFactory {

    private static VeganMacrosFactory instance = null;

    private VeganMacrosFactory() {
        this.carbsFactory = CarbsFactory.getInstance();
        this.proteinFactory = ProteinFactory.getInstance();
        this.fatsFactory = FatsFactory.getInstance();
    }

    public static VeganMacrosFactory getInstance() {
        if (instance == null) {
            instance = new VeganMacrosFactory();
        }
        return instance;
    }

    @Override
    public Carbs createCarbs() {
        int carbsCount = 3;
        switch (randomInt(carbsCount)) {
            case 0:
                return carbsFactory.createCarbs("bread");
            case 1:
                return carbsFactory.createCarbs("lentils");
            case 2:
                return carbsFactory.createCarbs("pistachio");
            default:
                return null;
        }
    }

    @Override
    public Protein createProtein() {
        return proteinFactory.createProtein("tofu");
    }

    @Override
    public Fats createFats() {
        int fatsCount = 2;
        switch (randomInt(fatsCount)) {
            case 0:
                return fatsFactory.createFats("avocado");
            case 1:
                return fatsFactory.createFats("peanuts");
            default:
                return null;
        }
    }
}
