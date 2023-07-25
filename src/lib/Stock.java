package lib;

public class Stock {
    private String stockCode;
    private String corporationName;
    private Double price;

    public Stock(String stockCode, String corporationName, Double price) {
        this.stockCode = stockCode;
        this.corporationName = corporationName;
        this.price = price;
    }

    public String getCode() {
        return stockCode;
    }

    public String getCorporationName() {
        return corporationName;
    }

    public Double getPrice() {
        return price;
    }
}
