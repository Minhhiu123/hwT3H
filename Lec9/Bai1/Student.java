package Lec9.Bai1;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String[] courses;
    private int courseCount;
    private static final String[] VALID_COURSES = {"Math", "English", "History", "Science"};

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new String[10];
        this.courseCount = 0;
    }

    public void registerCourse(String courseName) throws CourseAlreadyRegisteredException {
        if (!isValidCourse(courseName)) {
            throw new IllegalArgumentException("Invalid course: " + courseName);
        }
        if (isCourseRegistered(courseName)) {
            throw new CourseAlreadyRegisteredException(courseName);
        }
        if (courseCount == courses.length) {
            expandCourseArray();
        }
        courses[courseCount++] = courseName;
    }

    private boolean isValidCourse(String courseName) {
        for (int i = 0; i < courseCount; i++) {
            if (courses[i].equals(courseName)) {
                return true;
            }
        }
        return false;
    }

    private boolean isCourseRegistered(String courseName) {
        for (int i = 0; i < courseCount; i++) {
            if (courses[i].equals(courseName)) {
                return true;
            }
        }
        return false;
    }

    private void expandCourseArray() {
        String[] newCourses = new String[courses.length * 2];
        System.arraycopy(courses, 0, newCourses, 0, courses.length);
        courses = newCourses;
    }

    public String[] getCourses() {
        String[] result = new String[courseCount];
        System.arraycopy(courses, 0, result, 0, courseCount);
        return result;
    }

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter student ID: ");
                id = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer ID.");
            }
        }
        System.out.print("Enter student name: ");
        name = scanner.nextLine();
    }

    public void showInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.print("Registered courses: ");
        for (int i = 0; i < courseCount; i++) {
            System.out.print(courses[i] + (i < courseCount - 1 ? ", " : "\n"));
        }
    }
}
