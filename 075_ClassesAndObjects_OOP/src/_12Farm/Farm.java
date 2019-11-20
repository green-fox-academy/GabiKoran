package _12Farm;

import _03Animal.Animal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Farm {
//    it has list of Animals
//    it has slots which defines the number of free places for animals
//    breed() -> creates a new animal if there's place for it
//    slaughter() -> removes the least hungry animal
    List<Animal> nameOfAnimalList;
    int placeCapacity; // number of places for animals
    int freeSpace;


    public Farm() {
        this.nameOfAnimalList = new ArrayList<>();
        this.placeCapacity = 10;
    }

    public Farm(List<Animal> nameOfAnimalList) {
        this.nameOfAnimalList = new ArrayList<>();
        this.placeCapacity = 10;
    }



    public void breed() {
        freeSpace = placeCapacity - nameOfAnimalList.size();
        if (freeSpace >= 1) {
            Animal nameNewAnimal = new Animal();
            this.nameOfAnimalList.add(nameNewAnimal);
        }
    }

    public void slaughter() {
        freeSpace = placeCapacity - nameOfAnimalList.size();
        if (freeSpace <= 0) {
            int indexToSlaughter = -1;
            int hungerMin = 10000;
            for (int i = 0; i < this.nameOfAnimalList.size(); i++) {
                if (nameOfAnimalList.get(i).hunger < hungerMin) {
                    hungerMin = nameOfAnimalList.get(i).hunger;
                    indexToSlaughter = i;
                }
            }
            nameOfAnimalList.remove(indexToSlaughter);
        }
    }
}
