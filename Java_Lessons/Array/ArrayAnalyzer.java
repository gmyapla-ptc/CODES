// Online Java Compiler (Editor)
// Write and run Java online using this editor.
/* Array Analyzer

Focus: Arrays, indexing, .length, and loops

Objective: Create a Java program named ArrayAnalyzer.

Requirements
1. Declare an integer array named numbers containing 12, 7, 25, 18, 30.
2. Print the first and last elements using their indices.
3. Print the array's total number of elements using .length.
4. Use a regular for loop to print every element.
5. Calculate and print the sum of all elements using a loop. */

class ArrayAnalyzer { //01
    public static void main(String[] args) {
        int[] numbers = {12,7,25,18,30};
        
        System.out.println(numbers[0]); //02.a
        System.out.println(numbers[4]); //02.b
        System.out.println(numbers.length);//03

        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum: " + sum); 

    
  
        
    }
}
