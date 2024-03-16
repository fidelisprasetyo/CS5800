package macronutrients;

public class PaleoMacrosFactory extends MacrosFactory {

    @Override
    public Carbs createCarbs() {
        return CarbsFactory.createCarbs("pistachio");
    }

    @Override
    public Protein createProtein() {
        int PROTEIN_COUNT = 3;
        switch (randomInt(PROTEIN_COUNT)) {
            case 0:
                return ProteinFactory.createProtein("fish");
            case 1:
                return ProteinFactory.createProtein("chicken");
            case 2:
                return ProteinFactory.createProtein("beef");
            default:
                return null;
        }
    }

    @Override
    public Fats createFats() {
        int FATS_COUNT = 3;
        switch (randomInt(FATS_COUNT)) {
            case 0:
                return FatsFactory.createFats("avocado");
            case 1:
                return FatsFactory.createFats("tuna");
            case 2:
                return FatsFactory.createFats("peanuts");
            default:
                return null;
        }
    }
}
