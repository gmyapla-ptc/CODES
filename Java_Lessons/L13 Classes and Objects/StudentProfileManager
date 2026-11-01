/* Challenge 1: Student Profile Manager
Create a Java program that:
1. Defines a class named StudentProfileManager.
2. Declares attributes:
   - String name
   - int age
   - int[] grades
3. Creates a method calculateAverage() that returns a double.
   - Use a loop to calculate the sum of the grades.
   - Calculate the average using floating-point division.
4. Creates a method displayProfile() that displays:
   - Student's name
   - Student's age
   - Average grade
   - Adult status using isAdult()
5. Creates two Student objects with different names, ages, and grades.
6. Calls displayProfile() for both objects.  */

class StudentProfileManager {
    String name;
    int age;
    int[] grades;

    double calculateAverage() {
        double sum = 0;      
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return sum / grades.length;
    }

    boolean isAdult() {
        return age >= 18;
    }

    void displayProfile() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Average grade: " + calculateAverage());
        System.out.println("Adult status: " + isAdult());
        
    }
    
    public static void main (String[] arg) {
        StudentProfileManager s1 = new StudentProfileManager();
        s1.name = "Genji";
        s1.age = 34;
        s1.grades = new int[] {90,90,99,75,85};
        s1.displayProfile();
        System.out.println();

        StudentProfileManager s2 = new StudentProfileManager();
        s2.name = "KING";
        s2.age = 24;
        s2.grades = new int[] {99,60,99,90,88};
        s2.displayProfile();
        System.out.println();

        



        
    }
}
