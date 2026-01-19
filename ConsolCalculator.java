import java.util.Scanner;

public class ConsolCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("   Welcome to Console Calculator");

        boolean continueCalculation = true;

        // Loop to allow multiple calculations
        while (continueCalculation) {

            // Taking first number input
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            // Taking second number input
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            // Display operations menu
            System.out.println("Choose operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");

            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();

            double result = 0; // Variable to store result
            boolean validOperation = true;

            // Perform calculation using switch case
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        validOperation = false;
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please select between 1 to 4.");
                    validOperation = false;
            }

            // Display result if operation was valid
            if (validOperation) {
                System.out.println("Result: " + result);
            }

            // Ask user to continue
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String userChoice = scanner.next();

            if (!userChoice.equalsIgnoreCase("yes")) {
                continueCalculation = false;
            }

            System.out.println();
        }

        System.out.println("Thank you for using Console Calculator!");

        // Close scanner resource
        scanner.close();
    }
}
