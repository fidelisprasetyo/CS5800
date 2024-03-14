package macronutrients;

public abstract class MacrosAbstractFactory {
    abstract Carbs getCarbs(Diet diet);
    abstract Protein getProtein(Diet diet);
    abstract Fats getFats(Diet diet);
}
