package macronutrients;

import java.util.Random;

public abstract class MacrosFactory {
    abstract Carbs pickCarbs();
    abstract String pickProtein();
    abstract String pickFats();
}
