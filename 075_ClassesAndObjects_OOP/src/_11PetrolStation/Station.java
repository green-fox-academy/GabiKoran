package _11PetrolStation;

public class Station {
//    gasAmount
//    refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
    int gasAmount;

    public Station() {
        gasAmount = 2000;
    }

    public Station(int gasAmount) {
        this.gasAmount = gasAmount;
    }

    public void refill(Car name) {
        this.gasAmount -= name.capacity;
        name.gasAmount = name.capacity;

    }
}
