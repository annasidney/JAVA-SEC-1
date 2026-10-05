public class EmployeeNoConstructor {

    String name;
    int age;
    double salary;

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {

        EmployeeNoConstructor employee = new EmployeeNoConstructor();

        employee.name = "Priya";
        employee.age = 25;
        employee.salary = 45000;

        employee.displayDetails();
    }
}
