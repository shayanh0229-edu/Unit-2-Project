
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("Welcome to the Stock Analyzer. The below are commands you must use (Do not include spaces after commas):");
        System.out.println("In your simulated stock market, you may make up to 5 companies with indices from 1 to 5");
        System.out.println();
        System.out.println(" 1: Input a publicly traded company: 1,(Ticker Symbol),(Market Cap in an Integer),(Number of Outstanding Shares),(IndexNumber)");
        System.out.println("Example: 1,NVDA,100000,555,1");
        System.out.println();
        System.out.println(" 2: Show Stock Fluctuations over every hour: 2,(stockIndexNumber)");
        System.out.println("Example: 2,1");
        System.out.println();
        System.out.println("3: Invest in a stock: 3,(Total amount you want to invest)");
        System.out.println("Example: 3,1,1000");

      

        StockCreator stock1 = new StockCreator("DUMMY", 100000, 1000, 1);
        StockCreator stock2 = new StockCreator("DUMMY", 200000, 2000, 2);     
        StockCreator stock3 = new StockCreator("DUMMY", 300000, 3000, 3);
        StockCreator stock4 = new StockCreator("DUMMY", 400000, 4000, 4);
        StockCreator stock5 = new StockCreator("DUMMY", 500000, 5000, 5);

        while (true) {
            String input = scan.nextLine().toUpperCase();
            if (input.split(",")[0].equals("1")) {
                if (Integer.parseInt(input.split(",")[4]) == 1) {
                    if (input.split(",")[1].equals(stock2.getTickerSymbol()) || input.split(",")[1].equals(stock3.getTickerSymbol()) || input.split(",")[1].equals(stock4.getTickerSymbol()) || input.split(",")[1].equals(stock5.getTickerSymbol())) {
                        System.out.println("Same ticker symbol already exists. Please choose a different one.");
                        
                    } else {
                        stock1.setStock(input.split(",")[1], Integer.parseInt(input.split(",")[2]), Integer.parseInt(input.split(",")[3]), Integer.parseInt(input.split(",")[4]));
                    stock1.displayStock();
                    }
                    
                    
                } else if (Integer.parseInt(input.split(",")[4]) == 2) {
                    if (input.split(",")[1].equals(stock1.getTickerSymbol()) || input.split(",")[1].equals(stock3.getTickerSymbol()) || input.split(",")[1].equals(stock4.getTickerSymbol()) || input.split(",")[1].equals(stock5.getTickerSymbol())) {
                        System.out.println("Same ticker symbol already exists. Please choose a different one.");
                       
                    } else {
                    stock2.setStock(input.split(",")[1], Integer.parseInt(input.split(",")[2]), Integer.parseInt(input.split(",")[3]), Integer.parseInt(input.split(",")[4]));
                    stock2.displayStock();
                    }
                } else if (Integer.parseInt(input.split(",")[4]) == 3) {
                    if (input.split(",")[1].equals(stock1.getTickerSymbol()) || input.split(",")[1].equals(stock2.getTickerSymbol()) || input.split(",")[1].equals(stock4.getTickerSymbol()) || input.split(",")[1].equals(stock5.getTickerSymbol())) {
                        System.out.println("Same ticker symbol already exists. Please choose a different one.");
                        
                    } else {
                    stock3.setStock(input.split(",")[1], Integer.parseInt(input.split(",")[2]), Integer.parseInt(input.split(",")[3]), Integer.parseInt(input.split(",")[4]));
                    stock3.displayStock();
                    }
                } else if (Integer.parseInt(input.split(",")[4]) == 4) {
                    if (input.split(",")[1].equals(stock1.getTickerSymbol()) || input.split(",")[1].equals(stock2.getTickerSymbol()) || input.split(",")[1].equals(stock3.getTickerSymbol()) || input.split(",")[1].equals(stock5.getTickerSymbol())) {
                        System.out.println("Same ticker symbol already exists. Please choose a different one.");
                        
                    } else {
                    stock4.setStock(input.split(",")[1], Integer.parseInt(input.split(",")[2]), Integer.parseInt(input.split(",")[3]), Integer.parseInt(input.split(",")[4]));
                    stock4.displayStock();
                    }

                } else if (Integer.parseInt(input.split(",")[4]) == 5) {
                    if (input.split(",")[1].equals(stock1.getTickerSymbol()) || input.split(",")[1].equals(stock2.getTickerSymbol()) || input.split(",")[1].equals(stock3.getTickerSymbol()) || input.split(",")[1].equals(stock4.getTickerSymbol())) {
                        System.out.println("Same ticker symbol already exists. Please choose a different one.");
                        
                    } else {
                    stock5.setStock(input.split(",")[1], Integer.parseInt(input.split(",")[2]), Integer.parseInt(input.split(",")[3]), Integer.parseInt(input.split(",")[4]));
                    stock5.displayStock();
                    } 
                }
                
            } else if (input.split(",")[0].equals("2")) {
                if (Integer.parseInt(input.split(",")[1]) ==  1) {
                    stock1.stockFluctuations();
                } else if (Integer.parseInt(input.split(",")[1]) == 2) {
                    stock2.stockFluctuations();
                } else if (Integer.parseInt(input.split(",")[1]) == 3) {
                    stock3.stockFluctuations();
                } else if (Integer.parseInt(input.split(",")[1]) == 4) {
                    stock4.stockFluctuations();
                } else if (Integer.parseInt(input.split(",")[1]) == 5) {
                    stock5.stockFluctuations();
                }   

            }
             else if (input.split(",")[0].equals("3")) {
                int investment = Integer.parseInt(input.split(",")[2]);
                if (input.split(",")[1].equals("1")) {
                    stock1.invest(investment);
                    
                } else if (input.split(",")[1].equals("2")) {
                 
                    stock2.invest( investment);
                } else if (input.split(",")[1].equals("3")) {
      
                    stock3.invest(investment);
                } else if (input.split(",")[1].equals("4")) {
            
                    stock4.invest(investment);
                } else if (input.split(",")[1].equals("5")) {

                    stock5.invest(investment);
                }

        }
}
}
}
