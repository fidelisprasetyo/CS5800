package macronutrients;

import java.util.ArrayList;

public class VeganCarbs extends Carbs {

    @Override
    public ArrayList<String> createCarbsList() {
        ArrayList<String> carbsList = new ArrayList<>();
        carbsList.add("Bread");
        carbsList.add("Lentils");
        carbsList.add("Pistachio");
        return carbsList;
    }

}
