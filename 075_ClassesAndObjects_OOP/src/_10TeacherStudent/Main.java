package _10TeacherStudent;

public class Main {
    public static void main(String[] args) {
        Student kati = new Student("Kati");
        Teacher sam = new Teacher("Sam");

        kati.question(sam);

        sam.teach(kati);
    }
}
