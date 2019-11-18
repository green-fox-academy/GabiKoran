public class xMain {
    public static void main(String[] args) {

         xHuman kati = new xHuman();
         kati.name = "Kati";
         kati.age = 33;
         kati.height = 166;

         xHuman kari = new xHuman("Karesz", 35, 175);

        System.out.println(kati.name + " " + kati.age + " " + kati.height + " " + kati.isAlive);
        System.out.println(kari.name + " " + kari.age + " " + kari.height + " " + kari.isAlive);
    }
}
