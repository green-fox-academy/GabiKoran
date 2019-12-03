package GreenFoxInheritanceExercise;

import java.util.*;

public class Cohort {

    private String name;
    private List<Student> students;
    private List<Mentor> mentors;

    public Cohort(String name) {
        this.name = name;
        students = new ArrayList<Student>();
        mentors = new ArrayList<Mentor>();
    }

    public void addStudent(Student student) {
       this.students.add(student);
    }

    public void addMentor(Mentor mentor) {
        this.mentors.add(mentor);
    }

    public void info() {
        System.out.printf("The %s cohort has %d students and %d mentors.\n", this.name, this.students.size(), this.mentors.size());
    }
}
