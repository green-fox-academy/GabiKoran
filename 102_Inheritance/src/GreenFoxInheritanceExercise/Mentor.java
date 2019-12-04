package GreenFoxInheritanceExercise;

public class Mentor extends Person  {
    private String level;

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public Mentor() {
        super();
        this.level = "intermediate";
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Educate brilliant junior software developers.");
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.printf(" %s mentor.\n", this.level);
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
