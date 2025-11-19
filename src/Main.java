//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("Welcome to the Stock Analyzer. The below are commands you must use (Non-Case Sensitive)");
        System.out.println();
        System.out.println("Input a publicly traded company: createStock, (Ticker Symbol), (Market Cap in an Integer), (Number of Outstanding Shares)");
        System.out.println("Example: createStock, NVDA, 100000, 100");
        System.out.println();
        System.out.println("Show Stock Fluctuations over every (Integer n) hours: stockFluctuations, (Ticker Symbol), (Int n)");
        System.out.println("Example: stockFluctuations, NVDA, 2");
        System.out.println();
        System.out.println("In, (Ticker Symbol), (Market Cap in an Integer), (Number of Outstanding Shares)");
;

        System.out.println("Show Stock Data: stockFluctuations, (Ticker Symbol)");
        System.out.println("Example: stockFluctuations, NVDA, 2");

        String creatorCommand = "createstock"; // the command variables are in lowercase in order to prevent case sensitivity
        String fluctuationsCommand = "stockfluctuations";
        String input = scan.nextLine().toLowerCase();
        if (input.equals(creatorCommand)) {
            System.out.println("What is the name of your stock?");
            String name = scan.nextLine();
            System.out.println("What is the Market Cap of this company?");
            int marketCap = scan.nextInt();
            System.out.println("How many shares are there?");
            int shares = scan.nextInt();
            StockCreator stock = new StockCreator(name, marketCap, shares);


        } else if (input.equals(fluctuationsCommand)) {
            System.out
        }






        }

    }
