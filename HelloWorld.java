public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int result = add(5, 3);
        System.out.println("Result of the calculations is : " + result);
        
        int subtractionResult = substract(result, 10);
        System.out.println("Result of the subtraction is : " + subtractionResult);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int substract(int a, int b) {
        return a - b;
    }

}
