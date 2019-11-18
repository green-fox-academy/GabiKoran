package xP00_matReview;

public class Main {
    public static void main(String[] args) {

         Human kati = new Human();
         kati.name = "Kati";
         kati.age = 33;
         kati.height = 166;

         Human kari = new Human("Karesz", 35, 175);

        System.out.println(kati.name + " " + kati.age + " " + kati.height + " " + kati.isAlive);
        System.out.println(kari.name + " " + kari.age + " " + kari.height + " " + kari.isAlive);
    }
}
