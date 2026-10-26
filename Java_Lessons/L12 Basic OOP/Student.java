/*Requirements:
1. Declare a String field named name.
2. Declare an int field named age.
3. Create a method named introduce() that prints the student's name and age.
4. In main(), create one Student object.
5. Assign "Alex" to name and 18 to age.
6. Call introduce() on that object. */


/* Requirements:
1. Keep student1 with the name "Alex" and age 18.
2. Create student2 from the same class.
3. Set student2.name to "Maria" and student2.age to 20.
4. Call introduce() on both objects.  */

class Student {

    String name;
    int age;

    void introduce() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main (String [] args) {
        
        Student student1 = new Student();
        student1.name = "Alex";
        student1.age = 18;
        student1.introduce();

        Student student2 = new Student();
        student2.name = "Maria";
        student2.age = 20;
        student2.introduce();
        
        
    }
}
