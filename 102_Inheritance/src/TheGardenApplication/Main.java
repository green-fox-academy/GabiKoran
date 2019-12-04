package TheGardenApplication;

public class Main {
    public static void main(String[] args) {
        Garden myLittleGarden = new Garden("myLittleGarden");
        myLittleGarden.plantANewPlant(new Flower("yellow", 2));
        myLittleGarden.plantANewPlant(new Flower("blue", 3));
        myLittleGarden.plantANewPlant(new Tree("purple", 0));
        myLittleGarden.plantANewPlant(new Tree("orange", 0));

        myLittleGarden.info();
        myLittleGarden.watering(30);
        myLittleGarden.info();
        myLittleGarden.watering(10);
        myLittleGarden.info();
    }
}
