import java.util.Scanner;

public class leftoverString {
    public static String removeCharacters(String A, String B) {
        StringBuilder result = new StringBuilder();
        for (char c : A.toCharArray()) {
            if (B.indexOf(c) == -1) { // Check if the character is NOT in B
                result.append(c);
            }
        }
        return result.length() > 0 ? result.toString() : "Empty"; // Return "Empty" if no characters remain
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter string A: ");
        String A = scanner.nextLine().toUpperCase();
        
        System.out.print("Enter string B: ");
        String B = scanner.nextLine().toUpperCase();
        
        // Calling function and printing result
        System.out.println("Output: " + removeCharacters(A, B));
        
        scanner.close();
    }
}
