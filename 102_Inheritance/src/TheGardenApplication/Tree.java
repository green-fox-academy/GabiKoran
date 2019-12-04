package TheGardenApplication;

public class Tree extends Plant{
    //needs water if its current water amount is less then 10
    //when watering it the tree can only absorb the 40% of the water
    //eg. watering with 10 the tree's amount of water should only increase with 4
    public Tree(String name, double waterAmount) {
        super(name, waterAmount);
        this.setAbsorbationLevel(40);
        this.setThirstyLevel(10);;
        this.setPlantType("Tree");
    }
}
