/* Objective: Build a student analyzer that calculates an average and determines whether each student passes.

Requirements
1. Create a class named StudentAnalyzer.
2. Declare the instance fields String name and int[] grades.
3. Create calculateAverage() that uses a loop and returns a double.
4. Create getResult() that returns:
   - "PASSED" if the average is at least 75.
   - "FAILED" otherwise.
5. Create displayProfile() that prints the student's name, average, and result.
6. In main(), create two objects with these values:
Student	Grades
Alex	{85, 90, 95}
Maria	{60, 70, 65}

7. Call displayProfile() on both objects.

Expected results
- Alex — average 90.0, result PASSED
- Maria — average 65.0, result FAILED */

class StudentAnalyzer {
    String name;
    int [] grades;

    double calculateAverage () {
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return sum / grades.length;
    }

    String getResult() { if (calculateAverage() >= 75) {
        return "PASSED"; 
         }
        else {
            return "FAILED";
        }
    }
    void displayProfile() {
        System.out.println("Name: " + name);
        System.out.println("Grades: " + calculateAverage());
        System.out.println("Result: " + getResult());
         }

    public static void main (String[]args) {

        StudentAnalyzer student1 = new StudentAnalyzer();
        student1.name = "Alex";
        student1.grades = new int[] {85, 90, 95};
        student1.displayProfile();

        System.out.println();

        StudentAnalyzer student2 = new StudentAnalyzer();
        student2.name = "Maria";
        student2.grades = new int[] {60, 70, 65};
        student2.displayProfile();

        
        

        
    
        
        
    }

    

}
