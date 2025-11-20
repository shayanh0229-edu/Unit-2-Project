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
        System.out.println("Input a publicly traded company: createStock,(Ticker Symbol),(Market Cap in an Integer),(Number of Outstanding Shares)");
        System.out.println("Example: createStock, NVDA, 100000, 100");
        System.out.println();
        System.out.println("Show Stock Fluctuations over every hour: stockFluctuations,(Ticker Symbol)");
        System.out.println("Example: stockFluctuations, NVDA, 2");
        System.out.println();
        System.out.println("In, (Ticker Symbol), (Market Cap in an Integer), (Number of Outstanding Shares)");
        ;

        System.out.println("Show Stock Data: stockFluctuations, (Ticker Symbol)");
        System.out.println("Example: stockFluctuations, NVDA, 2");

        String creatorCommand = "createstock"; // the command variables are in lowercase in order to prevent case sensitivity
        String fluctuationsCommand = "stockfluctuations";
        String input = scan.nextLine().toLowerCase();

        for (int i = 0; i < 1;i++)
        if (input.split(",")[0].equals(creatorCommand)) {
            StockCreator stock = new StockCreator(input.split(",")[1], Integer.parseInt(input.split(",")[2]), Integer.parseInt(input.split(",")[3]));
            stock.displayStock();
            scan.nextLine();

        } else if (input.split(",")[0].equals(fluctuationsCommand)) {
            System.out.println("Which stock's fluctuations would you like to see?");
        }


    }

    }
