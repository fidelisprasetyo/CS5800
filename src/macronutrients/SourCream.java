package macronutrients;

public class SourCream extends Fats {
    @Override
    Fats createFats() {
        SourCream sourCream = new SourCream();
        sourCream.setName("Sour Cream");
        return sourCream;
    }
}
