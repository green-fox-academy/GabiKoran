package AircraftCarrier;

public class Main {
    public static void main(String[] args) {

        Carrier firstOne = new Carrier("firstOne", 1000, 1000);
        Carrier secondOne = new Carrier("secondOne", 1000, 1000);
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

        firstOne.fill();
        secondOne.fill();
        firstOne.fight(secondOne);
        secondOne.fight(firstOne);

        System.out.println(firstOne.getStatus());
        System.out.println(secondOne.getStatus());
    }
}
