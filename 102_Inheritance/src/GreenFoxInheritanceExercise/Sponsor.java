package GreenFoxInheritanceExercise;

public class Sponsor extends Person{
    //Create a Sponsor class that has the same fields and methods as the Person class, and has the following additional

    private String company;
    private int hiredStudents;

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    public Sponsor() {
        super();
        this.company = "Google";
        this.hiredStudents = 0;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.printf(" who represents %s and hired %d students so far.\n", this.company, this.hiredStudents);
    }

    public int hire() {
        return ++this.hiredStudents;
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Hire brilliant junior software developers.");
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getHiredStudents() {
        return hiredStudents;
    }

    public void setHiredStudents(int hiredStudents) {
        this.hiredStudents = hiredStudents;
    }
}
