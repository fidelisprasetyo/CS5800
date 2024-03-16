package macronutrients;

import java.util.ArrayList;

public class NoNutCarbs extends Carbs {
    @Override
    public ArrayList<String> createCarbsList() {
        ArrayList<String> carbsList = new ArrayList<>();
        carbsList.add("Cheese");
        carbsList.add("Bread");
        carbsList.add("Lentils");
        return carbsList;
    }
}
