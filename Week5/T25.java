package Week5;

import java.util.Scanner;

                public class T25 {
                    public static void main(String[] args) {
                        Scanner input = new Scanner(System.in);

                        // Prompt user to enter three cities
                        System.out.print("Enter the first city: ");
                        String city1 = input.nextLine();

                        System.out.print("Enter the second city: ");
                        String city2 = input.nextLine();

                        System.out.print("Enter the third city: ");
                        String city3 = input.nextLine();

                        // Determine the order of cities
                        String first, second, third;

                        if (city1.compareTo(city2) <= 0 && city1.compareTo(city3) <= 0) {
                            first = city1;
                            if (city2.compareTo(city3) <= 0) {
                    second = city2;
                    third = city3;
                } else {
                    second = city3;
                    third = city2;
                }
            } else if (city2.compareTo(city1) <= 0 && city2.compareTo(city3) <= 0) {
                first = city2;
                if (city1.compareTo(city3) <= 0) {
                    second = city1;
                    third = city3;
                } else {
                    second = city3;
                    third = city1;
                }
            } else {
                first = city3;
                if (city1.compareTo(city2) <= 0) {
                    second = city1;
                    third = city2;
                } else {
                    second = city2;
                    third = city1;
                }
            }

            // Display the cities in alphabetical order
            System.out.println("The three cities in alphabetical order are " + first + " " + second + " " + third);
        }
    }


