/* Requirements
1. Declare int score = 86;.
2. If the score is at least 90, print Excellent.
3. Otherwise, if the score is at least 75, print Passed.
4. Otherwise, print Failed.
5. Ensure your conditions are ordered correctly so higher scores receive the appropriate classification. */


class Grade_Decision_System {

    public static void main (String[]args) {

        int score = 86;

        if (score >= 90) {
            System.out.println("Excellent");
        }
        else if (score >= 75) {
            System.out.println("Passed");
             }
        else {
            System.out.print("Failed");
        
        }
    }
}
