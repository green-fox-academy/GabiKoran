package AircraftCarrier;

public class Main {
    public static void main(String[] args) {

        Carrier firstOne = new Carrier("firstOne", 1000, 1000);
        Carrier secondOne = new Carrier("secondOne", 1000, 1000);
        firstOne.add(new F16());
        firstOne.add(new F35());
        System.out.println(firstOne.getStatus());
        System.out.println(secondOne.getStatus());

        firstOne.fill();
        firstOne.fight(secondOne);
        System.out.println(firstOne.getStatus());
        System.out.println(secondOne.getStatus());

        firstOne.fill();
        firstOne.fight(secondOne);
        System.out.println(firstOne.getStatus());
        System.out.println(secondOne.getStatus());
    }
}
