package GreenFoxInheritanceExercise;

public class Student extends Person {
    private String previousOrganization;
    private int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student() {
        super();
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    //methods:
    @Override
    public void introduce() {
        super.introduce();
        System.out.printf(" from %s who skipped %d days from the course already.\n", this.previousOrganization, this.skippedDays);
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Be a junior software developer.");
    }

    public int skipDays(int i) {
        int newSkippedDays = this.getSkippedDays() + 1;
        return this.setSkippedDays(newSkippedDays);
    }

    public String getPreviousOrganization() {
        return previousOrganization;
    }

    public void setPreviousOrganization(String previousOrganization) {
        this.previousOrganization = previousOrganization;
    }

    public int getSkippedDays() {
        return skippedDays;
    }

    public int setSkippedDays(int skippedDays) {
        this.skippedDays = skippedDays;
        return skippedDays;
    }
}
