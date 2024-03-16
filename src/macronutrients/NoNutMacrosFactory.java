package macronutrients;

public class NoNutMacrosFactory extends MacrosFactory {

    @Override
    public Carbs createCarbs() {
        int carbsCount = 3;
        switch (randomInt(carbsCount)) {
            case 0:
                return CarbsFactory.createCarbs("cheese");
            case 1:
                return CarbsFactory.createCarbs("bread");
            case 2:
                return CarbsFactory.createCarbs("lentils");
            default:
                return null;
        }
    }

    @Override
    public Protein createProtein() {
        int proteinCount = 4;
        switch (randomInt(proteinCount)) {
            case 0:
                return ProteinFactory.createProtein("fish");
            case 1:
                return ProteinFactory.createProtein("chicken");
            case 2:
                return ProteinFactory.createProtein("beef");
            case 3:
                return ProteinFactory.createProtein("tofu");
            default:
                return null;
        }
    }

    @Override
    public Fats createFats() {
        int fatsCount = 3;
        switch (randomInt(fatsCount)) {
            case 0:
                return FatsFactory.createFats("avocado");
            case 1:
                return FatsFactory.createFats("sour cream");
            case 2:
                return FatsFactory.createFats("tuna");
            default:
                return null;
        }
    }
}
