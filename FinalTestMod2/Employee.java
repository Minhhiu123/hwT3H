package FinalTestMod2;

public class Employee implements Workable {
        protected String name;
        protected int age;
        protected double salary;

        public Employee(String name, int age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
            work();
        }

        public void displayInfo() {
            System.out.println("Name: " + name + ", Age: " + age + ", Salary: " + salary);
        }

        public void updateSalary(double newSalary) {
            if (newSalary < 0) {
                throw new IllegalArgumentException("Salary cannot be negative");
            }
            this.salary = newSalary;
        }

        @Override
        public void work() {
            System.out.println(name + " is working as employee.");
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }
    }


