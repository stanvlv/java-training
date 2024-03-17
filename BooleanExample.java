public class BooleanExample {
    public static String getResult(Boolean condition) {
        if (condition == null) {
            return "c"; // Condition doesn't exist
        } else {
            return condition ? "a" : "b"; // Return "a" for true, "b" for false
        }
    }

    public static void main(String[] args) {
        // Test cases
        Boolean condition1 = true;
        Boolean condition2 = false;
        Boolean condition3 = null;

        System.out.println("Result for condition1: " + getResult(condition1));
        System.out.println("Result for condition2: " + getResult(condition2));
        System.out.println("Result for condition3: " + getResult(condition3)); 
    }
}
