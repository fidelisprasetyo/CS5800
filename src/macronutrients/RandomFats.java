package macronutrients;

import java.util.ArrayList;

public class RandomFats extends Fats {

    @Override
    public ArrayList<String> createFatsList() {
        ArrayList<String> fatsList = new ArrayList<>();
        fatsList.add("Avocado");
        fatsList.add("Sour Cream");
        fatsList.add("Tuna");
        fatsList.add("Peanuts");
        return fatsList;
    }
}
