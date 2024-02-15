package polymorphism;

public class PolymorphismDriver {

    public static void main(String[] args) {

        Ship[] shipArray = new Ship[3];

        shipArray[0] = new Ship("Serenity", "2000");
        shipArray[1] = new CruiseShip("Royal Caribbean", "2010", 5000);
        shipArray[2] = new CargoShip("Evergreen", "2020", 20000);

        for(Ship ship : shipArray) {
            ship.print();
        }
    }

}
