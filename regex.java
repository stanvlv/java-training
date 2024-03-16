// define a regular expression that matches phrases
import java.util.Scanner;
import java.util.regex.*;

public class regex {
    // create a const string to hold the regex pattern
    private static final String REGEX_MATCH_STRING = "\\b(damage|minor\\sdamages|heavy\\sdamage)\\b";

    public static boolean isMatch(String s) {
        Pattern p = Pattern.compile(REGEX_MATCH_STRING, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(s);
        return m.find();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hardcoded test string results:");
        System.out.println(isMatch("damage"));                    // true
        System.out.println(isMatch("minor damages"));             // true
        System.out.println(isMatch("heavy damage"));              // true
        System.out.println(isMatch("no damages"));                // false
        System.out.println(isMatch("random text"));               // false
        System.out.println(isMatch("no damages but heavy"));      // true
        System.out.println(isMatch("no damages here"));           // true
        System.out.println(isMatch("there are heavy damages"));   // true
        
        while (true) {
            System.out.print("Try it out yourself, write something (type 'exit' to quit): ");
            String input = scanner.nextLine();

            // Check if the user wants to quit
            if (input.equals("exit")) {
                break;
            }
            System.out.println("Result: " + isMatch(input));
        }

        scanner.close();
    }

    
}
