/* Create a Java program that:
1. Defines a class named Student.
2. Declares attributes name and age.
3. Creates two Student objects.
4. Assigns each object different attribute values.
5. Displays each student's information using a method named displayProfile(). */

class Student{
    String name;
    int age;

    void displayProfile() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "LeFrence";
        s1.age = 20;
        s1.displayProfile();

        Student s2 = new Student();
        s2.name = "Gerecho";
        s2.age = 24;
        s2.displayProfile();

       
    }
}
