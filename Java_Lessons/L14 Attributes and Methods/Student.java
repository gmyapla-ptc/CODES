/*
Activity 2 — Your turn to code
Create a class named Student.
Requirements:
1. Declare an attribute String name = "Alex";
2. Declare an attribute int age = 18;
3. Create a method named displayProfile() that prints the student's name and age.
4. Create a method named celebrateBirthday() that increases the student's age by 1 */
class Student {
    String name = "Alex";
    int age = 18;

    void displayProfile() {
        System.out.println(name);
        System.out.println(age);
    }

    int celebrateBirthday() {
        age++;
        return age;
    }

    
    public static void main(String[] args) {
        System.out.println("Try clicking the Run button.");
    }
}
