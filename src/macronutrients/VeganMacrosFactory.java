package macronutrients;

public class VeganMacrosFactory extends MacrosFactory {

    @Override
    public Carbs createCarbs() {
        int carbsCount = 3;
        switch (randomInt(carbsCount)) {
            case 0:
                return CarbsFactory.createCarbs("bread");
            case 1:
                return CarbsFactory.createCarbs("lentils");
            case 2:
                return CarbsFactory.createCarbs("pistachio");
            default:
                return null;
        }
    }

    @Override
    public Protein createProtein() {
        return ProteinFactory.createProtein("tofu");
    }

    @Override
    public Fats createFats() {
        int fatsCount = 2;
        switch (randomInt(fatsCount)) {
            case 0:
                return FatsFactory.createFats("avocado");
            case 1:
                return FatsFactory.createFats("peanuts");
            default:
                return null;
        }
    }
}
