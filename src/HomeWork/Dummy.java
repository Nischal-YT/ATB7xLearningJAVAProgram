package HomeWork;

import java.util.Scanner;

public class Dummy {
    public static void main(String[] args) {
        // Create a Scanner object to read from standard input
        Scanner scanner = new Scanner(System.in);

        // Read the integer from the first line
        int integerValue = scanner.nextInt();

        // Read the double from the second line
        double doubleValue = scanner.nextDouble();

        // Clear the newline left by nextDouble()
        scanner.nextLine();

        // Read the string from the third line
        String stringValue = scanner.nextLine();

        // Print the values in the required format
        System.out.println("String: " + stringValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Int: " + integerValue);

        // Close the scanner
        scanner.close();
    }
}
