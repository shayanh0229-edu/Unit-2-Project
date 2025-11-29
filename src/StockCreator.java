public class StockCreator {

    private String stockName;
    private int marketCapitalization;
    private int numberOfShares;
    private int index;

    public StockCreator(String name, int marketCap, int shares, int simulationIndex)
    {
        stockName = name;
        marketCapitalization = marketCap;
        numberOfShares = shares;
        index = simulationIndex;
    }
    public void displayStock() {
        System.out.println("Stock Name: " + stockName);
        System.out.println("Simulation Index: " + index);
        System.out.println("Market Cap: $" + marketCapitalization);
        System.out.println("Total Shares Available: " + numberOfShares);
        System.out.printf("Price per Share: $ %.2f", (double)marketCapitalization/numberOfShares);
    }

    public String getTickerSymbol()
    {
        return stockName;
    }   

    public void setStock(String nameSet, int marketCapSet, int sharesSet, int simulationIndexSet) {
        stockName = nameSet;
        marketCapitalization = marketCapSet;
        numberOfShares = sharesSet;
        index = simulationIndexSet;
    }

    public void stockFluctuations()
    {
        System.out.println("Value of a share of " + stockName + " over the hours of the market: ");
        System.out.println();
        double shareValue = marketCapitalization/numberOfShares;
        double originalShareValue = shareValue;
        double fluctuation = 0;

        for (int hour = 9; hour <= 16; hour++)
        {
            fluctuation = Math.random() * (shareValue * 0.0075); // Fluctuates up to 0.75% of share value
            int increaseOrDecrease = (int)(Math.random() * 2);
            if (increaseOrDecrease == 0)
                fluctuation *= -1;
            shareValue += fluctuation;
            if (hour <= 12) {
                System.out.printf(hour + "AM: %.2f", shareValue); // took this from the unit 1 project 
                System.out.println();
            } else {
                System.out.printf(hour - 12 + "PM: %.2f", shareValue);
                System.out.println();
        }
        }

    }   


    public void invest(int investment)
    {
        marketCapitalization += investment;
        System.out.println("Invested $ " + investment + " in " +  stockName);
        System.out.println("New Stock Info:");
        System.out.println();
        displayStock();
        // Updates market capitalization based on investment
        // Since I used Market Cap in writing the share price in other methods,
        // this is all I need to do to update the numbers everywhere
    }

}
