package macronutrients;

public class MacrosDemo {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Aang", Diet.VEGAN);
        Customer customer2 = new Customer("Katara", Diet.PALEO);
        Customer customer3 = new Customer("Sokka", Diet.NO_RESTRICTION);
        Customer customer4 = new Customer("Toph", Diet.NUT_ALLERGY);
        Customer customer5 = new Customer("Zuko", Diet.NO_RESTRICTION);
        Customer customer6 = new Customer("Mako", Diet.VEGAN);

        createMealPlan(customer1);
        createMealPlan(customer2);
        createMealPlan(customer3);
        createMealPlan(customer4);
        createMealPlan(customer5);
        createMealPlan(customer6);
    }

    public static void createMealPlan(Customer customer) {
        Diet dietPlan = customer.getDiet();
        MacrosFactory macrosFactory = MacrosFactoryCreator.createFactory(dietPlan);

        Carbs carbs = macrosFactory.createCarbs();
        Protein protein = macrosFactory.createProtein();
        Fats fats = macrosFactory.createFats();

        System.out.println(
                "Customer Name: " + customer.getName() +
                "\nDiet plan: " + customer.getDiet().toString() +
                "\nMeal: " + carbs.getName() + " (carbs) + " + protein.getName() + " (protein) + " + fats.getName() + " (fats)\n");
    }
}
