package macronutrients;

import java.util.ArrayList;

public class PaleoProtein extends Protein {

    @Override
    public ArrayList<String> createProteinList() {
        ArrayList<String> proteinList = new ArrayList<>();
        proteinList.add("Fish");
        proteinList.add("Chicken");
        proteinList.add("Beef");
        return proteinList;
    }
}
