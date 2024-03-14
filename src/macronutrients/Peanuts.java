package macronutrients;

public class Peanuts extends Fats {
    @Override
    Fats createFats() {
        Peanuts peanuts = new Peanuts();
        peanuts.setName("Peanuts");
        return peanuts;
    }
}
