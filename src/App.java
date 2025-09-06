import java.util.Scanner;

public class App {

    public float balance = 0.0f;
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        float balance = 0.0f;

        System.out.println("Hello, Welcome to your Personal Finance App!");
        System.out.println("Please select your preffered currency: USD, EUR, GBP");
        String currency = scanner.nextLine().toUpperCase();

        if(currency.equals("USD") || currency.equals("EUR") || currency.equals("GBP")) {
            System.out.println("You have selected " + currency + " as your currency.");
        } else {
            System.out.println("Invalid currency selection. Defaulting to USD.");
            currency = "USD";
        }

        System.out.println("Please enter your initial balance in " + currency + ":");
        balance = scanner.nextFloat();

        System.out.println("Your initial balance is: " + balance + " " + currency);

        System.out.println("Please Select an option:");
        System.out.println("1. Add Income");
        System.out.println("2. Add Expense");
        System.out.println("3. View Balance");
        System.out.println("4. View Transaction History");

        int option = scanner.nextInt();

        System.out.println("You selected option: " + option);

        scanner.close();
    }
}
