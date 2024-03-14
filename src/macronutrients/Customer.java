package macronutrients;

public class Customer {

    private String name;
    private Diet diet;

    public Customer(String name, Diet diet) {
        this.name = name;
        this.diet = diet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Diet getDiet() {
        return diet;
    }

    public void setDiet(Diet diet) {
        this.diet = diet;
    }
}
