import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("Welcome to the Stock Analyzer. The below are commands you must use (Non-Case Sensitive)");
        System.out.println("In your simulated stock market, you may make up to 5 companies with indices from 1 to 5");
        System.out.println();
        System.out.println(" 1: Input a publicly traded company: 1,(Ticker Symbol),(Market Cap in an Integer),(Number of Outstanding Shares),(IndexNumber)");
        System.out.println("Example: 1, NVDA, 100000,555,1");
        System.out.println();
        System.out.println(" 2: Show Stock Fluctuations over every hour: stockFluctuations,(Ticker Symbol)");
        System.out.println("Example: 2, NVDA");
        System.out.println();
        System.out.println("In, (Ticker Symbol), (Market Cap in an Integer), (Number of Outstanding Shares)");
        System.out.println("Example: invest, NVDA, 100000, 100");

        String creatorCommand = "CREATESTOCK"; // the command variables are in uppercase in order to prevent case sensitivity
        String fluctuationsCommand = "STOCKFLUCTUATIONS"; //also makes the ticker symbols uppercase        

        while (true) {
            String input = scan.nextLine().toUpperCase();
            if (input.split(",")[0].equals("1")) {
                if (Integer.parseInt(input.split(",")[3]) == 1) {
                    StockCreator one = new StockCreator(input.split(",")[1], Integer.parseInt(input.split(",")[2]), Integer.parseInt(input.split(",")[3]), Integer.parseInt(input.split(",")[3]));
                    one.displayStock();
                    scan.nextLine();
                } else if (Integer.parseInt(input.split(",")[3]) == 2) {
                    StockCreator two = new StockCreator(input.split(",")[1], Integer.parseInt(input.split(",")[2]), Integer.parseInt(input.split(",")[3]), Integer.parseInt(input.split(",")[3]));
                    two.displayStock();
                    scan.nextLine();
                } else if (Integer.parseInt(input.split(",")[3]) == 3) {
                    StockCreator three = new StockCreator(input.split(",")[1], Integer.parseInt(input.split(",")[2]), Integer.parseInt(input.split(",")[3]), Integer.parseInt(input.split(",")[3]));
                    three.displayStock();
                    scan.nextLine();
                } else if (Integer.parseInt(input.split(",")[3]) == 4) {
                    StockCreator four = new StockCreator(input.split(",")[1], Integer.parseInt(input.split(",")[2]), Integer.parseInt(input.split(",")[3]), Integer.parseInt(input.split(",")[3]));
                    four.displayStock();
                    scan.nextLine();
                } else if (Integer.parseInt(input.split(",")[3]) == 5) {
                    StockCreator five = new StockCreator(input.split(",")[1], Integer.parseInt(input.split(",")[2]), Integer.parseInt(input.split(",")[3]), Integer.parseInt(input.split(",")[3]));
                    five.displayStock();
                    scan.nextLine();
                }
            } else if (input.split(",")[0].equals("2")) {
                System.out.println(input.split(",")[1]);
                scan.nextLine();

            }


        }
    }
}
