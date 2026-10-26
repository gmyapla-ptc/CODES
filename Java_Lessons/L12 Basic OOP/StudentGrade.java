/* Objective: Build a Student class that stores a student's name and grades, then calculates and displays their average.

Requirements
1. Create a class named StudentGrade.
2. Declare these instance fields:
   - String name
   - int[] grades
3. Create a method named calculateAverage() that:
   - Returns a double.
   - Uses a loop to calculate the sum of the grades.
   - Uses floating-point division to calculate the average.
4. Create a method named displayProfile() that prints the student's name and calculated average.
5. In main(), create two Student objects:
   - Alex with grades {85, 90, 95}
   - Maria with grades {78, 82, 88}
6. Call displayProfile() on both objects. */

class StudentGrade {

    String name;
    int [] grades;

    double calculateAverage(){
        double sum = 0;
        
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        } 
        return sum / grades.length; } 

    void displayProfile() {
        System.out.println("Name: " + name);
        System.out.println("Average: " + calculateAverage()); 
    }

        public static void main (String[]args) {
            
            StudentGrade student1 = new StudentGrade();
            student1.name = "Alex";
            student1.grades = new int[] {85, 90, 95};
            student1.displayProfile();

            StudentGrade student2 = new StudentGrade();
            student2.name = "Maria";
            student2.grades = new int[] {78, 82, 88};
            student2.displayProfile();

            

            
        }
    
    } 
