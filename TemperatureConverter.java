import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        // Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Display options for temperature conversion
        System.out.println("Temperature Converter");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");

        // Get user choice for conversion type
        int choice;
        do {
            System.out.print("Enter your choice (1 or 2): ");
            choice = scanner.nextInt();

            if (choice < 1 || choice > 2) {
                System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        } while (choice < 1 || choice > 2); // Repeat until valid choice entered

        // Get temperature value from user
        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        // Perform conversion based on user choice
        double convertedTemperature;
        switch (choice) {
            case 1:
                convertedTemperature = (temperature * 9.0 / 5) + 32;
                System.out.printf("%.2f degrees Celsius is equal to %.2f degrees Fahrenheit\n", temperature, convertedTemperature);
                break;
            case 2:
                convertedTemperature = (temperature - 32) * 5.0 / 9;
                System.out.printf("%.2f degrees Fahrenheit is equal to %.2f degrees Celsius\n", temperature, convertedTemperature);
                break;
        }

        scanner.close(); // Close Scanner object
    }
}