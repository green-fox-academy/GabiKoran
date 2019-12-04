package TheGardenApplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    //The Garden
    //is able to hold unlimited amount of flowers or trees
    //when watering it should only water those what needs water with equally divided amount amongst them
    //eg. watering with 40 and 4 of them need water then each gets watered with 10
    private String name;
    private List<Plant> gardensPlants;

    public Garden(String name) {
        this.name = name;
        gardensPlants = new ArrayList<Plant>();
    }

    public void plantANewPlant(Plant plant) {
        this.gardensPlants.add(plant);
    }

    public void info() {
        for (int i = 0; i < this.gardensPlants.size(); i++) {
            gardensPlants.get(i).info();
        }
        System.out.println();
    }

    public void infoExtra() {
        for (int i = 0; i < this.gardensPlants.size(); i++) {
            gardensPlants.get(i).info();
            System.out.println(gardensPlants.get(i).getWaterAmount());
        }
        System.out.println();
    }

    public void watering(double wateringAmount) {
        List<Plant> thirstyPlants = new ArrayList<>();
        for (int i = 0; i < this.gardensPlants.size(); i++) {
            if (gardensPlants.get(i).isThirsty()) {
                thirstyPlants.add(gardensPlants.get(i));
            }
        }
        for (int i = 0; i < thirstyPlants.size(); i++) {
            double newWaterAmount = thirstyPlants.get(i).getWaterAmount() + (wateringAmount / thirstyPlants.size());
            thirstyPlants.get(i).setWaterAmount(newWaterAmount);
        }
        System.out.printf("Watering with %d\n", (int)(wateringAmount));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Plant> getGardensPlants() {
        return gardensPlants;
    }

    public void setGardensPlants(List<Plant> gardensPlants) {
        this.gardensPlants = gardensPlants;
    }
}
