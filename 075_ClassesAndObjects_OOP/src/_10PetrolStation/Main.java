package _10PetrolStation;

public class Main {
    public static void main(String[] args) {
        Car yellow = new Car();
        Station downTown = new Station();

        System.out.println(yellow.gasAmount + " " + downTown.gasAmount);
        downTown.refill(yellow);
        System.out.println(yellow.gasAmount + " " + downTown.gasAmount);
    }
}
