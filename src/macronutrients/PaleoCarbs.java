package macronutrients;

import java.util.ArrayList;

public class PaleoCarbs extends Carbs {

    @Override
    public ArrayList<String> createCarbsList() {
        ArrayList<String> carbsList = new ArrayList<>();
        carbsList.add("Pistachio");
        return carbsList;
    }
}
