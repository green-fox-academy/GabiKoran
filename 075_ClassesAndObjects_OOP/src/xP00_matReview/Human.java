package xP00_matReview;

public class Human {
    String name;
    int age;
    Integer height;
    boolean isAlive;

    public Human() {
        this.name = "JohnDoe";
        this.age = 30;
        this.height = 170;
        this.isAlive = true;
    }

    public Human(String name, int age, Integer height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void fight (Human xhuman) {
        if (this.height > xhuman.height) {
            System.out.println(this.name + " win");
            xhuman.isAlive = false;
        } else if (this.height > xhuman.height) {
            System.out.println(xhuman.name + " win");
            this.isAlive = false;
        }
    }
}
