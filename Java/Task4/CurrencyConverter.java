import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Step 1: Predefined Exchange Rates
        Map<String, Double> conversionRates = new HashMap<>();
        conversionRates.put("USD", 1.0); // Base currency
        conversionRates.put("INR", 83.12);
        conversionRates.put("EUR", 0.92);
        conversionRates.put("GBP", 0.78);
        conversionRates.put("JPY", 156.78);

        System.out.println("--- Welcome to Currency Converter ---\n");

        // Step 2: Input base and target currencies
        System.out.print("Enter base currency (e.g. USD, INR): ");
        String fromCurrency = userInput.next().toUpperCase();

        System.out.print("Enter target currency: ");
        String toCurrency = userInput.next().toUpperCase();

        // Step 3: Validate selected currencies
        if (!conversionRates.containsKey(fromCurrency) || !conversionRates.containsKey(toCurrency)) {
            System.out.println("\n[Error] Unsupported currency code. Please try again with valid inputs.");
            return;
        }

        // Step 4: Get amount to convert
        System.out.print("Enter amount in " + fromCurrency + ": ");
        double enteredAmount;
        try {
            enteredAmount = userInput.nextDouble();
            if (enteredAmount < 0) {
                System.out.println("\n[Error] Amount must be positive.");
                return;
            }
        } catch (Exception e) {
            System.out.println("\n[Error] Invalid amount entered.");
            return;
        }

        // Step 5: Perform conversion
        double inUSD = enteredAmount / conversionRates.get(fromCurrency);
        double finalValue = inUSD * conversionRates.get(toCurrency);

        // Step 6: Show result
        System.out.printf("\n%.2f %s = %.2f %s\n", enteredAmount, fromCurrency, finalValue, toCurrency);

        System.out.println("\nThank you for using our converter. Have a great day!");
        userInput.close();
    }
}
