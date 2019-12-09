import main.java.animals.*;

public class Zoo {

    public static void main(String[] args) {

        Reptile reptile = new Reptile("Crocodile");
        Mammal mammal = new Mammal("Koala");
        Bird bird = new Bird("Parrot");

        System.out.println("How do you breed?\n");
        System.out.println("A " + reptile.getName() + " is breeding by " + reptile.breed() + ".\n");
        System.out.println("A " + mammal.getName() + " is breeding by " + mammal.breed() + ".\n");
        System.out.println("A " + bird.getName() + " is breeding by " + bird.breed() + ".\n");
    }
}