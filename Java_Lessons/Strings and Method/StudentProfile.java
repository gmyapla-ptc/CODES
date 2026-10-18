public class StudentProfile {

    // TODO 1: Create countCharacters(String text)
    static int countCharacters(String text) {
        return text.length();
            }
    // Return the number of characters in text.
    
    // TODO 2: Create createGreeting(String name)
    // Return "Welcome, " + name + "!"
    static String createGreeting(String name) {
        return "Welcome, " + name + "!";
    }


    public static void main(String[] args) {

        // TODO 3: Declare studentName with extra spaces
        String studentName = "  alex johnson  ";
        
        // TODO 4: Remove the extra spaces with trim()
        studentName = studentName.trim();
        
      // TODO 5: Convert the cleaned name to uppercase
        studentName = studentName.toUpperCase();
        
            // TODO 6: Call your methods and print the results
        int countCharacters = countCharacters(studentName);
        String createGreeting = createGreeting(studentName);

        System.out.println ("=== STUDENT PROFILE ===");
        System.out.println("Name: " + studentName);
        System.out.println("Characters: " + countCharacters);
        System.out.println("Greeting: " + createGreeting);

    }
}
