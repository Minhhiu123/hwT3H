package Lec9.Bai1;

public class Main {
    public static void main(String[] args) {
        CourseManager manager = new CourseManager();
        Student student1 = new Student(1, "Nguyen A");
        Student student2 = new Student(2, "Tran B");

        manager.addStudent(student1);
        manager.addStudent(student2);

        manager.registerStudentForCourse(student1, "Math");
        manager.registerStudentForCourse(student1, "Math");
        manager.registerStudentForCourse(student1, "Philosophy");

        student1.showInfo();
    }
}

