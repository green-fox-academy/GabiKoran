package _09TeacherStudent;

public class Student {
//    learn() -> prints the student is learning something new
//    question(teacher) -> calls the teachers answer method
    String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public Student() {
    }

    public void learn() {
        System.out.println("the student is learning something new");
    }

    public void question(Teacher name) {
        System.out.print(this.studentName + " asked " + name.teacherName + "\n so ");
        name.answer();
    }
}
