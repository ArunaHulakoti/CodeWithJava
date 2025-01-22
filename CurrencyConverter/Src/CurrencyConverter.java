import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
        // Display options to the user
        System.out.println("Welcome to the Currency Converter!");
        System.out.println("Select the conversion type:");
        System.out.println("1. Convert USD to EUR");
        System.out.println("2. Convert EUR to USD");
        System.out.println("3. Convert USD to INR");
        System.out.println("4. Convert INR to USD");
        System.out.print("Enter the number for the conversion (1-4): ");
        int choice = scanner.nextInt();

        // Ask user for the amount to convert
        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        double convertedAmount = 0.0;
        String targetCurrency = "";

        // Conversion rates (Example)
        double usdToEurRate = 0.85; // 1 USD = 0.85 EUR
        double eurToUsdRate = 1.18; // 1 EUR = 1.18 USD
        double usdToInrRate = 82.74; // 1 USD = 82.74 INR
        double inrToUsdRate = 0.012; // 1 INR = 0.012 USD

        // Perform the conversion
        switch (choice) {
            case 1:
                convertedAmount = amount * usdToEurRate;
                targetCurrency = "EUR";
                break;
            case 2:
                convertedAmount = amount * eurToUsdRate;
                targetCurrency = "USD";
                break;
            case 3:
                convertedAmount = amount * usdToInrRate;
                targetCurrency = "INR";
                break;
            case 4:
                convertedAmount = amount * inrToUsdRate;
                targetCurrency = "USD";
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option (1-4).");
                return;
        }

        // Output the result
        System.out.printf("%.2f converted to %s is %.2f\n", amount, targetCurrency, convertedAmount);
        }
        
    }
}
