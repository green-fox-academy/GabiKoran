package _12Farm;

import _03Animal.Animal;

public class Main {
    public static void main(String[] args) {
        //    it has list of Animals
        //    it has slots which defines the number of free places for animals
        //    breed() -> creates a new animal if there's place for it
        //    slaughter() -> removes the least hungry animal

        Farm allatfarm = new Farm();
        Animal allat1 = new Animal(80, 80);
        Animal allat2 = new Animal(10, 10);
        Animal allat3 = new Animal(90, 90);
        Animal allat4 = new Animal(96, 96);
        Animal allat5 = new Animal(45, 45);
        allatfarm.nameOfAnimalList.add(allat1);
        allatfarm.nameOfAnimalList.add(allat2);
        allatfarm.nameOfAnimalList.add(allat3);
        allatfarm.nameOfAnimalList.add(allat4);
        allatfarm.nameOfAnimalList.add(allat5);

        // check:
        allatfarm.breed();
        print(allatfarm);
        allatfarm.breed();
        allatfarm.breed();
        allatfarm.breed();
        allatfarm.breed();
        allatfarm.breed();
        allatfarm.breed();
        print(allatfarm);
        allatfarm.slaughter();
        print(allatfarm);
        allatfarm.breed();
        allatfarm.slaughter();
        print(allatfarm);
    }

    public static void print(Farm name) {
        System.out.println("Allatok éhségszintjei a farmon: ");
        for (int i = 0; i < name.nameOfAnimalList.size() - 1; i++) {
            System.out.print(name.nameOfAnimalList.get(i).hunger + ", ");
        }
        System.out.print(name.nameOfAnimalList.get(name.nameOfAnimalList.size() - 1).hunger);
        System.out.println();
    }
}
