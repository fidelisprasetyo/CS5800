package macronutrients;

public class Tuna extends Fats {
    @Override
    Fats createFats() {
        Tuna tuna = new Tuna();
        tuna.setName("Tuna");
        return tuna;
    }
}
