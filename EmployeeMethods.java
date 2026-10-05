public class EmployeeMethods {

    String name;
    int salary;

    void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

    void calculateBonus() {
        double bonus = salary * 0.10;
        System.out.println("Bonus: " + bonus);
    }

    public static void main(String[] args) {

        EmployeeMethods employee = new EmployeeMethods();

        employee.name = "Rahul";
        employee.salary = 50000;

        employee.displayEmployee();
        employee.calculateBonus();
    }
}
