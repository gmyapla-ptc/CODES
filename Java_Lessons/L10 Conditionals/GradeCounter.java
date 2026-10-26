/*Requirements
1. Traverse the grades array using a regular for loop.
2. Use grades.length to control the loop.
3. If a grade is at least 75, increment passedCount.
4. Print the total using the provided System.out.println() statement.  */


public class GradeCounter {
    public static void main(String[] args) {
        int[] grades = {85, 62, 90, 70, 78};

        int passedCount = 0;

        // Write your for loop and conditional here
        for (int i = 0; i < grades.length; i++) {

            if (grades[i] >= 75) { 
            passedCount++;
        }
             }
            

        System.out.println("Students passed: " + passedCount);
    }
}
