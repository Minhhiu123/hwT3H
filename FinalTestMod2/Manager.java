package FinalTestMod2;

public class Manager extends Employee {
    private final String department;

    public Manager(String name, int age, double salary, String department) {
        super(name, age, salary);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }

    public void displayInfo(String format) {
        if (format.equalsIgnoreCase("json")) {
            System.out.println("{ \"name\": \"" + name + "\", \"age\": " + age + ", \"salary\": " + salary + ", \"department\": \"" + department + "\" }");
        } else {
            displayInfo();
        }
    }

    @Override
    public void work() {
        System.out.println(name + " is managing department: " + department);
    }
}

