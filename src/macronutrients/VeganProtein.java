package macronutrients;

import java.util.ArrayList;

public class VeganProtein extends Protein {

    @Override
    public ArrayList<String> createProteinList() {
        ArrayList<String> proteinList = new ArrayList<>();
        proteinList.add("Tofu");
        return proteinList;
    }
}
