package AircraftCarrier;

public class Main {
    public static void main(String[] args) throws ThereIsNoAmmoException {

        Carrier firstOne = new Carrier("firstOne", 1000, 10000);
        Carrier secondOne = new Carrier("secondOne", 1000, 10000);
        for (int i = 0; i < 3; i++) {
            firstOne.add(new F35());
        }
        for (int i = 0; i < 2; i++) {
            firstOne.add(new F16());
        }

        for (int i = 0; i < 2; i++) {
            secondOne.add(new F35());
        }
        for (int i = 0; i < 3; i++) {
            secondOne.add(new F16());
        }

        for (int i = 0; i < 7; i++) {
            firstOne.fight(secondOne);
            secondOne.fight(firstOne);
            try {
                firstOne.fill();
            } catch (ThereIsNoAmmoException e) {
                System.out.println(e.getMessage());
            }
            try {
                secondOne.fill();
            } catch (ThereIsNoAmmoException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(firstOne.getStatus());
        System.out.println(secondOne.getStatus());
    }
}
