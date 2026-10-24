/* Requirements
1. If the score is at least 90, print Excellent.
2. Otherwise, if the score is at least 75, print Passed.
3. Otherwise, print Failed. */

public class GradeClassifier {
    public static void main(String[] args) {
        int score = 86;

        if (score >= 90) {
            System.out.println("Excellent");
        }
        else if (score >= 75) {
            System.out.println("Passed");
             }
            else {
            System.out.println("Failed");
            }
        

        // Write your conditional statements here

    }
}
