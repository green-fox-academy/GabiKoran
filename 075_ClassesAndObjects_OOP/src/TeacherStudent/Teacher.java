package TeacherStudent;

public class Teacher {
//    teach(student) -> calls the students learn method
//    answer() -> prints the teacher is answering a question
    String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    public Teacher() {
    }

    public void teach(Student name) {
        System.out.print(this.teacherName + " teached " + name.studentName + "\n so ");
        name.learn();
    }

    public void answer() {
        System.out.println("the teacher is answering a question");
    }
}
