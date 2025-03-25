package Lec9.Bai1;

class CourseManager {
    private Student[] students;
    private int studentCount;

    public CourseManager() {
        students = new Student[10];
        studentCount = 0;
    }

    public void addStudent(Student student) {
        if (studentCount == students.length) {
            expandStudentArray();
        }
        students[studentCount++] = student;
    }

    private void expandStudentArray() {
        Student[] newStudents = new Student[students.length * 2];
        System.arraycopy(students, 0, newStudents, 0, students.length);
        students = newStudents;
    }

    public void registerStudentForCourse(Student student, String courseName) {
        try {
            student.registerCourse(courseName);
            System.out.println("Successfully registered: " + courseName);
        } catch (CourseAlreadyRegisteredException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Registration process completed.");
        }
    }
}

