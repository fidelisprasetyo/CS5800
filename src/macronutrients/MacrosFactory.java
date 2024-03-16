package macronutrients;

import java.util.Random;

public abstract class MacrosFactory {

    protected CarbsFactory carbsFactory;
    protected ProteinFactory proteinFactory;
    protected FatsFactory fatsFactory;

    abstract Carbs createCarbs();
    abstract Protein createProtein();
    abstract Fats createFats();

    protected int randomInt(int caseCount) {
        Random random = new Random();
        return random.nextInt(caseCount);
    }
}
