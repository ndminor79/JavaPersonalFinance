import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, Welcome to your Personal Finance App!");
        System.out.println("Please select your preffered currency: USD, EUR, GBP");
        String currency = scanner.nextLine().toUpperCase();

        if(currency.equals("USD") || currency.equals("EUR") || currency.equals("GBP")) {
            System.out.println("You have selected " + currency + " as your currency.");
        } else {
            System.out.println("Invalid currency selection. Defaulting to USD.");
            currency = "USD";
        }
    }
}
