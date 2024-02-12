public class CruiseShip extends Ship {
    private int maxPassengers;

    public CruiseShip(String name, String year, int maxPassengers) {
        super(name, year);
        this.maxPassengers = maxPassengers;
    }

    @Override
    public void print() {
        System.out.println(
                "Ship name: " + getName() + "\n" +
                "Maximum number of passengers: " + maxPassengers + "\n");
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }
}
