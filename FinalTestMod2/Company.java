package FinalTestMod2;

import java.util.*;

public class Company {
    ArrayList<Employee> employees = new ArrayList<>();
    private final HashMap<String, Double> salaryMap = new HashMap<>();
    private final HashSet<String> departments = new HashSet<>();

    public Company() {
        Employee em1 = new Employee("a", 30, 5000);
        Employee em2 = new Employee("b", 28, 6000);
        Employee ma1 = new Manager("c", 35, 8000, "IT");

        employees.add(em1);
        employees.add(em2);
        employees.add(ma1);

        salaryMap.put(em1.getName(), em1.getSalary());
        salaryMap.put(em2.getName(), em2.getSalary());
        salaryMap.put(ma1.getName(), ma1.getSalary());
    }

    public void addEmployee(Employee e) {
        employees.add(e);
        salaryMap.put(e.getName(), e.getSalary());
    }

    public void displayEmployees() {
        for (int i = 0; i < employees.size(); i++) {
            Employee e = employees.get(i);
            e.displayInfo();
            System.out.println();
        }
    }

    public void addOrUpdateSalary(String name, double salary) {
        salaryMap.put(name, salary);
    }

    public void findSalary(String name) {
        Double salary = salaryMap.get(name);
        if (salary != null) {
            System.out.println("Salary of " + name + ": " + salary);
        } else {
            System.out.println("Employee not found.");
        }
    }

    public void addDepartment(String dept) {
        departments.add(dept);
    }

    public void displayDepartments() {
        System.out.println("Departments:");
        for (int i = 0; i < departments.size(); i++) {
            String de = (String) departments.toArray()[i];
            System.out.println("- " + de);
        }
    }

    public boolean updateSalaryByName(String name, double newSalary) {
        for (int i = 0; i < employees.size(); i++) {
            Employee e = employees.get(i);
            if (e.getName().equalsIgnoreCase(name)) {
                e.updateSalary(newSalary);
                addOrUpdateSalary(name, newSalary);
                return true;
            }
        }
        return false;
    }

    public void sortEmployeesBySalaryDesc() {
        employees.sort((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
    }

    public void findEmployeeByName(String name) {
        for (int i = 0; i < employees.size(); i++) {
            Employee e = employees.get(i);
            if (e.getName().equalsIgnoreCase(name)) {
                e.displayInfo();
                return;
            }
        }
        System.out.println("Employee not found.");
    }


}

