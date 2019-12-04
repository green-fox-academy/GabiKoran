package AircraftCarrier;

public class Main {
    public static void main(String[] args) {
    F16 repcsi = new F16();
        System.out.println(repcsi.getAmmunition());
    repcsi.refill(500);
        System.out.println(repcsi.getAmmunition());
        System.out.println(repcsi.fight());
        System.out.println(repcsi.getAmmunition());
        System.out.println(repcsi.getType());
        System.out.println(repcsi.getStatus());
        System.out.println(repcsi.fight());
        System.out.println(repcsi.getStatus());
        repcsi.refill(500);
        System.out.println(repcsi.getStatus());
        System.out.println(repcsi.fight());
        System.out.println(repcsi.getStatus());
    }
}
