/* Requirements
1. Create a class named StudentGradeAnalyzer.
2. Declare String studentName = "Alex";.
3. Declare an integer array: int[] grades = {85, 92, 78, 90, 88};.
4. Create a method named calculateAverage that accepts an integer array and returns a double.
5. Use a loop inside the method to calculate the sum of all grades.
6. Calculate the average using floating-point division.
7. In main, call the method and print the student's name and average.
8. Use a loop to print every grade.
*/
class StudentGradeAnalyzer {

    static double calculateAverage(int [] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return 
            sum / numbers.length ;
    }
    
    public static void main(String[] args) {
        
        String studentName = "Alex";
        int [] grades = {85, 92, 78, 90, 88};

        double average = calculateAverage(grades);
        System.out.println("Student: " + studentName);


        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
            
        }
        System.out.println("Average: " + average);
        

  
        

        
  }  
}
