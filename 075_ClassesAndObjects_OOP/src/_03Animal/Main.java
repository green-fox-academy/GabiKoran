package _03Animal;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal();
        //System.out.println(lion.thirst);

        lion.eat();
        System.out.println(lion.thirst);
        System.out.println(lion.hunger);
        System.out.println();

        lion.drink();
        System.out.println(lion.thirst);
        System.out.println(lion.hunger);
        System.out.println();

        lion.play();
        System.out.println(lion.thirst);
        System.out.println(lion.hunger);
        System.out.println();
    }
}
