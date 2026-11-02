/*
Revised Challenge 1 — Employee Management
Create a class named EmployeeManager.

Attributes:
- String name = "Juan";
- String position = "IT Support";
- int salary = 25000;
Methods:
1. displayDetails() — prints the employee's name, position, and salary.
2. promote() — changes the employee's position to "IT Manager".
3. increaseSalary() — increases the employee's salary by 5000.
*/
class EmployeeManager {
    String name = "Juan";
    String position = "IT Support";
    int salary = 25000;

    void displayDetails() {
        System.out.println(name);
        System.out.println(position);
        System.out.println(salary);
    }

    String promote() {
        position = "IT Manager";
        return position;
    }

    int increaseSalary() {
        salary = salary + 5000;
        return salary;
    }

    public static void main(String[] args) {
        System.out.println("Try clicking the Run button.");
    }
}
