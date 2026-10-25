/* Requirements:
1. Create a class named StopAtThree.
2. Declare a main method.
3. Use a for loop starting at i = 1, continuing while i <= 5, and increasing i by one.
4. Inside the loop, use if to check whether i == 3.
5. If true, use break.
6. Print i inside the loop, but make sure the print statement is positioned so the output is 1 and 2 only
*/
class StopAtThree {
    public static void main(String[] args) {


        for (int i = 1; i <= 5; i++) {
            if (i == 3) {   
            break;    }
                System.out.println(i);
            
        }
        

        
  }  
}
