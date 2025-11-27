
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("Welcome to the Stock Analyzer. The below are commands you must use (Non-Case Sensitive)");
        System.out.println("In your simulated stock market, you may make up to 5 companies with indices from 1 to 5");
        System.out.println();
        System.out.println(" 1: Input a publicly traded company: 1,(Ticker Symbol),(Market Cap in an Integer),(Number of Outstanding Shares),(IndexNumber)");
        System.out.println("Example: 1,NVDA, 100000,555,1");
        System.out.println();
        System.out.println(" 2: Show Stock Fluctuations over every hour: stockFluctuations,(Ticker Symbol)");
        System.out.println("Example: 2,NVDA");
        System.out.println();
        System.out.println("In, (Ticker Symbol), (Market Cap in an Integer), (Number of Outstanding Shares)");
        System.out.println("Example: invest, NVDA, 100000, 100");

      

        StockCreator stock1 = new StockCreator("DUMMY", 100000, 1000, 1);
        StockCreator stock2 = new StockCreator("DUMMY", 200000, 2000, 2);     
        StockCreator stock3 = new StockCreator("DUMMY", 300000, 3000, 3);
        StockCreator stock4 = new StockCreator("DUMMY", 400000, 4000, 4);
        StockCreator stock5 = new StockCreator("DUMMY", 500000, 5000, 5);

        while (true) {
            String input = scan.nextLine().toUpperCase();
            if (input.split(",")[0].equals("1")) {
                if (Integer.parseInt(input.split(",")[3]) == 1) {
                    stock1.setStock(input.split(",")[1], Integer.parseInt(input.split(",")[2]), Integer.parseInt(input.split(",")[3]), Integer.parseInt(input.split(",")[3]));
                    stock1.displayStock();
                    scan.nextLine();
                } else if (Integer.parseInt(input.split(",")[3]) == 2) {
                    stock2.setStock(input.split(",")[1], Integer.parseInt(input.split(",")[2]), Integer.parseInt(input.split(",")[3]), Integer.parseInt(input.split(",")[3]));
                    stock2.displayStock();
                    scan.nextLine();
                } else if (Integer.parseInt(input.split(",")[3]) == 3) {
                    stock3.setStock(input.split(",")[1], Integer.parseInt(input.split(",")[2]), Integer.parseInt(input.split(",")[3]), Integer.parseInt(input.split(",")[3]));
                    stock3.displayStock();
                    scan.nextLine();
                } else if (Integer.parseInt(input.split(",")[3]) == 4) {
                    stock4.setStock(input.split(",")[1], Integer.parseInt(input.split(",")[2]), Integer.parseInt(input.split(",")[3]), Integer.parseInt(input.split(",")[3]));
                    stock4.displayStock();
                    scan.nextLine();
                } else if (Integer.parseInt(input.split(",")[3]) == 5) {
                    stock5.setStock(input.split(",")[1], Integer.parseInt(input.split(",")[2]), Integer.parseInt(input.split(",")[3]), Integer.parseInt(input.split(",")[3]));
                    stock5.displayStock();
                    scan.nextLine();
                }
            } else if (input.split(",")[0].equals("2")) {
                System.out.println(input.split(",")[1]);
                scan.nextLine();

            }


        }
    }
}








   


    }
}
