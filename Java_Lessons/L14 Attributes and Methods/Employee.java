/* 
Identify:
1. The three attributes.
2. The two methods.
3. Which method changes the employee's position.
*/


class Employee {
    String name = "Juan";
    String position = "IT Support";
    int salary = 25000;

    void displayDetails() {
        System.out.println(name);
        System.out.println(position);
        System.out.println(salary);
    }

    void promote() {
        position = "IT Manager";
    }
}

/*
The 3 Attributes are : 
String name = "Juan";
    String position = "IT Support";
    int salary = 25000;

While the two Methods() are 
 void displayDetails() {
        System.out.println(name);
        System.out.println(position);
        System.out.println(salary);
    }

    void promote() {
        position = "IT Manager";


*/

