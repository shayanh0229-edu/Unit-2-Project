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
        System.out.println("Market Cap: " + marketCapitalization);
        System.out.println("Total Shares Avaialable: " + numberOfShares);
        System.out.println("Price per Share: " + marketCapitalization/numberOfShares);
    }

    public void setStock(String nameSet, int marketCapSet, int sharesSet, int simulationIndexSet) {
        stockName = nameSet;
        marketCapitalization = marketCapSet;
        numberOfShares = sharesSet;
        index = simulationIndexSet;
    }

    public boolean checkStockName(String dummyCheck)
    {
        return stockName.equals("DUMMY");
    }

    public void stockFluctuations()
    {
        System.out.println("Value of a share of " + stockName + " over the hours of the market: ");
        int shareValue = marketCapitalization/numberOfShares;
        int fluctuation = 0;

        for (int hour = 9; hour <= 14; hour++)
        {
            fluctuation = (int)(Math.random() * (shareValue * 0.05 )) - 5;
            shareValue += fluctuation;
            if (hour < 12)
                System.out.println(hour + "AM: " + shareValue);
            else
                System.out.println(hour + "PM: " + shareValue);
        }
    }


    public void invest(int shares, double currentValue)
    {
        marketCapitalization += shares * currentValue;
        // Updates market capitalization based on investment
        // Since I used Market Cap in writing the share price in other methods,
        // this is all I need to do to update the numbers everywhere
    }

}
