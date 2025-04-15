package FinalTestMod2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Company Menu =====");
            System.out.println("1. Display all employees");
            System.out.println("2. Add employee");
            System.out.println("3. Update salary");
            System.out.println("4. Find salary by name");
            System.out.println("5. Add department");
            System.out.println("6. Show all departments");
            System.out.println("7. Sort employees by salary (descend)");
            System.out.println("8. Find employee by name");
            System.out.println("9. Calculate salary with bonus");
            System.out.println("0. Exit");
            System.out.println();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    company.displayEmployees();
                    break;
                case 2:
                    System.out.print("Enter type (employee/manager): ");
                    String type = scanner.nextLine();
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter salary: ");
                    double salary = scanner.nextDouble();
                    scanner.nextLine();
                    if (type.equalsIgnoreCase("manager")) {
                        System.out.print("Enter department: ");
                        String dept = scanner.nextLine();
                        company.addEmployee(new Manager(name, age, salary, dept));
                    } else {
                        company.addEmployee(new Employee(name, age, salary));
                    }
                    break;
                case 3:
                    System.out.print("Enter name: ");
                    String n = scanner.nextLine().trim();
                    System.out.print("Enter new salary: ");
                    double newSal = scanner.nextDouble();
                    scanner.nextLine();

                    if (company.updateSalaryByName(n, newSal)) {
                        System.out.println("Updated successfully.");
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter name: ");
                    company.findSalary(scanner.nextLine());
                    break;
                case 5:
                    System.out.print("Enter department name: ");
                    company.addDepartment(scanner.nextLine());
                    break;
                case 6:
                    company.displayDepartments();
                    break;
                case 7:
                    company.sortEmployeesBySalaryDesc();
                    System.out.println("Sorted.");
                    break;
                case 8:
                    System.out.print("Enter name: ");
                    company.findEmployeeByName(scanner.nextLine());
                    break;
                case 9:
                    SalaryCalculation calc = (emp) -> emp.getSalary() + 500;
                    for (Employee e : company.employees) {
                        double result = calc.calculateSalary(e);
                        System.out.println(e.getName() + " new salary (with bonus): " + result);
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    return;
            }
        }
    }
}

