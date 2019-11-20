package _11PetrolStation;

public class Car {
//    gasAmount
//    capacity
    int gasAmount;
    int capacity;
//    create constructor for Car where:
//    initialize gasAmount -> 0
//    initialize capacity -> 100

    public Car() {
        this.gasAmount = 0;
        this.capacity = 100;
    }

    public Car(int gasAmount, int capacity) {
        this.gasAmount = gasAmount;
        this.capacity = capacity;
    }
}
