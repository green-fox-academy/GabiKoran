package TheGardenApplication;

public class Flower extends Plant{
    //needs water if its current water amount is less then 5
    //when watering it the flower can only absorb the 75% of the water
    //eg. watering with 10 the flower's amount of water should only increase with 7.5
    public Flower(String name, int waterAmount) {
        super(name, waterAmount);
        this.setAbsorbationLevel(75);
        this.setThirstyLevel(5);
        this.setPlantType("Flower");
    }
}
