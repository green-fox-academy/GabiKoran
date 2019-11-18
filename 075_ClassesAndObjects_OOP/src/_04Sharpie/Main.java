package _04Sharpie;

public class Main {
    public static void main(String[] args) {

        Sharpie yellow = new Sharpie("yellow", 60);
        int n = 40;
        for (int i = 0; i < n ; i++) {
            yellow.use();
        }
        System.out.println(yellow.inkAmount);
    }
}
