package macronutrients;

public enum Diet {
    NO_RESTRICTION("No restriction"),
    PALEO("Paleo"),
    VEGAN("Vegan"),
    NUT_ALLERGY("Nut allergy");

    private final String string;

    Diet(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return string;
    }
}