package _15Pirates;

public class testShipClass {
    public static void main(String[] args) {
        Ship shipA = new Ship();
        shipA.fillShip(new Pirate());

        Ship shipB = new Ship();
        shipB.fillShip(new Pirate());
        shipB.fillShip(new Pirate());
        shipB.fillShip(new Pirate());

        System.out.println("shipA:");
        shipA.represent();
        System.out.println();

        System.out.println("shipB:");
        shipB.represent();
        System.out.println();

        shipA.battle(shipB);

        System.out.println("shipA:");
        shipA.represent();
        System.out.println();

        System.out.println("shipB:");
        shipB.represent();
        System.out.println();


    }
}
