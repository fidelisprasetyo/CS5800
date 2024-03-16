package macronutrients;

import java.util.ArrayList;

public class VeganFats extends Fats {

    @Override
    public ArrayList<String> createFatsList() {
        ArrayList<String> fatsList = new ArrayList<>();
        fatsList.add("Avocado");
        fatsList.add("Tuna");
        fatsList.add("Peanuts");
        return fatsList;
    }
}
