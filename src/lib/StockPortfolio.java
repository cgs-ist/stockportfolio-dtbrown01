package lib;

import java.util.HashMap;

public class StockPortfolio {
    HashMap<Stock, Integer> stocks = new HashMap<Stock, Integer>();

    public void addStock(Stock stock, int amount) {

        if (stocks.get(stock) != null) {
            stocks.put(stock, stocks.get(stock) + amount);
        } else {
            stocks.put(stock, amount);
        }
    }

    public void viewPortfolio() {
        for (Stock stock : stocks.keySet()) {
            int shareAmount = stocks.get(stock);
            System.out
                    .println(stock.getCode() + " - " + shareAmount + ", valued at $" + stock.getPrice() * shareAmount);
        }
    }
}