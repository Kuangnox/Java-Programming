package Week6;

public class T8 {
    /** Main method */
    public static void main(String[] args) {
        // Display the table heading
        System.out.println("Multiplication Table");

        // Display the number title
        System.out.print("      "+1);
        for (int j = 2; j <= 9; j++) {
            System.out.print("    " + j);
        }
        System.out.println("\n");

        // Print table body
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + "|");
            for (int j = 1; j <= 9; j++) {
                // Display the product and align properly
                System.out.printf("%5d", i * j);
            }
            System.out.println();
        }
    }
}