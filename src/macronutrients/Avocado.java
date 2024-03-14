package macronutrients;

public class Avocado extends Fats {
    @Override
    Fats createFats() {
        Avocado avocado = new Avocado();
        avocado.setName("Avocado");
        return avocado;
    }
}
