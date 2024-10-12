package Week5;

public class T3 {
    public static void main(String[] args) {
        // Demonstrating Math.ceil
        System.out.println("Math.ceil(2.1) returns " + Math.ceil(2.1)); // 3.0
        System.out.println("Math.ceil(2.0) returns " + Math.ceil(2.0)); // 2.0
        System.out.println("Math.ceil(-2.0) returns " + Math.ceil(-2.0)); // -2.0
        System.out.println("Math.ceil(-2.1) returns " + Math.ceil(-2.1)); // -2.0

        // Demonstrating Math.floor
        System.out.println("Math.floor(2.1) returns " + Math.floor(2.1)); // 2.0
        System.out.println("Math.floor(2.0) returns " + Math.floor(2.0)); // 2.0
        System.out.println("Math.floor(-2.0) returns " + Math.floor(-2.0)); // -2.0
        System.out.println("Math.floor(-2.1) returns " + Math.floor(-2.1)); // -3.0

        // Demonstrating Math.rint
        System.out.println("Math.rint(2.1) returns " + Math.rint(2.1)); // 2.0
        System.out.println("Math.rint(2.5) returns " + Math.rint(2.5)); // 3.0
        System.out.println("Math.rint(-2.1) returns " + Math.rint(-2.1)); // -2.0
        System.out.println("Math.rint(-2.5) returns " + Math.rint(-2.5)); // -2.0

        // Demonstrating Math.round
        System.out.println("Math.round(2.1) returns " + Math.round(2.1)); // 2
        System.out.println("Math.round(2.5) returns " + Math.round(2.5)); // 3
        System.out.println("Math.round(-2.0) returns " + Math.round(-2.0)); // -2
        System.out.println("Math.round(-2.5) returns " + Math.round(-2.5)); // -2
    }
}
