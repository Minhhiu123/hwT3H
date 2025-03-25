package Lec9.Bai1;

public class CourseAlreadyRegisteredException extends Exception {
    private String courseName;

    public CourseAlreadyRegisteredException(String courseName) {
        super("Course '" + courseName + "' is already registered.");
        this.courseName = courseName;
    }
}
