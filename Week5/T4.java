package Week5;

public class T4 {
    public static void main(String[] args) {
        // Using Math.max and Math.min
        System.out.println("Math.max(2, 3) returns " + Math.max(2, 3)); // returns 3
        System.out.println("Math.min(2.5, 4.6) returns " + Math.min(2.5, 4.6)); // returns 2.5

        // Nested use of Math.max
        System.out.println("Math.max(Math.max(2.5, 4.6), Math.min(3, 5.6)) returns "
                + Math.max(Math.max(2.5, 4.6), Math.min(3, 5.6))); // returns 4.6

        // Using Math.abs
        System.out.println("Math.abs(-2) returns " + Math.abs(-2)); // returns 2
        System.out.println("Math.abs(-2.1) returns " + Math.abs(-2.1)); // returns 2.1

        // Generating random numbers
        // Random integer between 0 and 9
        int random1 = (int) (Math.random() * 10);
        System.out.println("Random integer between 0 and 9: " + random1);

        // Random integer between 50 and 99
        int random2 = 50 + (int) (Math.random() * 50);
        System.out.println("Random integer between 50 and 99: " + random2);

        // Example of random integer between a and (a + b - 1)
        int a = 10;
        int b = 5;
        int randomAB = a + (int) (Math.random() * b);
        System.out.println("Random integer between " + a + " and " + (a + b - 1) + ": " + randomAB);
    }
}
