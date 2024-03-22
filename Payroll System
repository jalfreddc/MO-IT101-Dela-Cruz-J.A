import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private String name;
    private double hourlyRate;
    private double hoursWorked;

    public Employee(String name, double hourlyRate) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = 0; // Initialize hours worked to 0
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // Calculate the weekly pay for the employee
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

public class PayrollSystem {
    private ArrayList<Employee> employees;

    public PayrollSystem() {
        employees = new ArrayList<>();
    }

    // Add a new employee to the system
    public void addEmployee(String name, double hourlyRate) {
        Employee newEmployee = new Employee(name, hourlyRate);
        employees.add(newEmployee);
    }

    // Calculate and display the payroll for all employees
    public void calculatePayroll() {
        System.out.println("Payroll Information:");
        for (Employee employee : employees) {
            double pay = employee.calculatePay();
            System.out.println("Name: " + employee.getName() + ", Pay: $" + pay);
        }
    }

    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        Scanner scanner = new Scanner(System.in);

        // Adding employees
        payrollSystem.addEmployee("Justine", 15.0);
        

        // Simulate hours worked for each employee
        for (Employee employee : payrollSystem.employees) {
            System.out.print("Enter hours worked for " + employee.getName() + ": ");
            double hoursWorked = scanner.nextDouble();
            employee.setHoursWorked(hoursWorked);
        }

        // Calculate and display payroll
        payrollSystem.calculatePayroll();

        scanner.close();
    }
}
