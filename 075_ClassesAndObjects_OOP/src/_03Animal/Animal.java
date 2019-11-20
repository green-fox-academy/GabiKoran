package _03Animal;

public class Animal {
    //    Every animal has a hunger value, which is a whole number
    public int hunger;
    //    Every animal has a thirst value, which is a whole number
    public int thirst;
    //    when creating a new animal object these values are created with the default 50 value


    public Animal() {
        this(50, 50); // 2. így is, viszont így vár egy másik Constructort
        //this.hunger = 50; // 1. így is meg lehet adni a default paramétereket
        //this.thirst = 50;
    }

    public Animal(int hunger, int thirst) {
        this.hunger = hunger;
        this.thirst = thirst;
    }

    //    Every animal can eat() which decreases their hunger by one
    public void eat() {
        this.hunger--;
    }

    //    Every animal can drink() which decreases their thirst by one
    public void drink() {
        this.thirst--;
    }

    //    Every animal can play() which increases both by one
    public void play() {
        this.hunger++;
        this.thirst++;
    }
}