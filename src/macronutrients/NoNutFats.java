package macronutrients;

import java.util.ArrayList;

public class NoNutFats extends Fats {

    @Override
    public ArrayList<String> createFatsList() {
        ArrayList<String> fatsList = new ArrayList<>();
        fatsList.add("Avocado");
        fatsList.add("Sour Cream");
        fatsList.add("Tuna");
        return fatsList;
    }
}
