package macronutrients;

public class MacrosDemo {
    public static void main(String[] args) {
        Customer a = new Customer("Aang", Diet.VEGAN);
        MacrosAbstractFactory macrosAbstractFactory = MacrosFactoryProducer.getFactory(MacrosFactoryProducer.MacrosType.PROTEIN);
    }
}
