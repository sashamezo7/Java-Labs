package isp.lab9.exercise1.ui;

import java.math.BigDecimal;

public class OwnStock {
    private String symbol;
    private int quantity;
    private BigDecimal pricePerUnit;
    private BigDecimal total;

    public OwnStock(String symbol, int quantity, BigDecimal pricePerUnit, BigDecimal total) {
        this.symbol = symbol;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.total = total;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public BigDecimal getPricePerUnit() {
        return pricePerUnit;
    }

    public BigDecimal getTotalPrice() {
        return total;
    }
}
