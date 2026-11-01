/* Activity 2 — Student Analyzer
Create a Java program that:
1. Defines a class named StudentAct02.
2. Declares attributes name and age.
3. Creates two Student objects.
4. Assigns each object different attribute values.
5. Creates a method named isAdult() that returns a boolean.
   - Returns true if the student's age is 18 or older.
   - Returns false otherwise.
6. Displays each student's name, age, and adult status.  */

class StudentAct02 {
    String name;
    int age;

    boolean isAdult() {
        return age >= 18;
    }

    public static void main (String[] arg) {

        StudentAct02 s1 = new StudentAct02();
        s1.name = "DICKHEAD";
        s1.age = 24;
        s1.isAdult();

        StudentAct02 s2 = new StudentAct02();
        s2.name = "ASSHOLE";
        s2.age = 23;
        s2.isAdult();

        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
        System.out.println("Adult: " + s1.isAdult());
        
        System.out.println();

        System.out.println("Name: " + s2.name);
        System.out.println("Age: " + s2.age);
        System.out.println("Adult: " + s2.isAdult());
       
        
    }
}
