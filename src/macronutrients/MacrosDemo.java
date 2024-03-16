package macronutrients;

public class MacrosDemo {
    public static void main(String[] args) {
        Customer a = new Customer("Aang", Diet.VEGAN);
    }

    public static void createMealPlan(Customer customer) {
        Diet dietPlan = customer.getDiet();

        MacrosFactory macrosFactory = MacrosFactoryCreator.createFactory(dietPlan);
        Carbs carbs = macrosFactory.pickCarbs();
        Protein protein = macrosFactory.pickProtein();
        Fats fats = macrosFactory.pickFats();

        System.out.println("Customer Name: " + customer.getName() +
                "\nDiet plan: " + customer.getDiet().toString() + "\nMeal:" +
                "\n\tCarbs: " + carbs);

    }
}
