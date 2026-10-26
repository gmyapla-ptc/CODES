/* Challenge B: Student Grade Report
Objective: Combine today's lesson with previously learned Java concepts.

Create a class named StudentGradeReport.

Requirements:
1. Declare String studentName = "Alex";.
2. Declare three integer scores: 85, 90, and 88.
3. Create a calculateAverage method that accepts three integers and returns a double.
4. Calculate the correct average using floating-point division.
5. Use if/else to determine whether the student passed. The passing average is 75.
6. Print the student's name, scores, average, and pass/fail result. */

class StudentGradeReport {
    
    static double calculateAverage (int s1, int s2, int s3) {
    return  (s1 + s2 + s3) / 3.0;
    
}
    public static void main (String [] args) {

        String studentName = "Alex";
        int score1 = 85;
        int score2 = 90;
        int score3 = 88;

        double average = calculateAverage(score1, score2, score3);


        System.out.println("=== STUDENT GRADE REPORT ===");
        System.out.println("Student Name : Alex");
        System.out.println("Score 1: " + score1);
        System.out.println("Score 2: " + score2);
        System.out.println("Score 3: " + score3);
        System.out.println("Average: " + average);
        if (average >= 75) {
            System.out.println("Result: Passed");
             }
            else {
            System.out.println("Result: FAILED");
            }
            
         

        
    }
}
