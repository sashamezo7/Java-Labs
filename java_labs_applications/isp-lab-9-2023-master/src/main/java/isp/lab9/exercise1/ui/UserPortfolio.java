package isp.lab9.exercise1.ui;

import lombok.AllArgsConstructor;
import lombok.Data;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import javax.swing.table.AbstractTableModel;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Data
@AllArgsConstructor
public class UserPortfolio extends AbstractTableModel {
    private BigDecimal cash;
    private Map<String, Integer> shares; // a map of number of shares by stock symbol
    private String[] columns = new String[]{"Symbol", "Quantity", "Price per unit", "Total price of the position"};
    private List<OwnStock> ownedStocks;
    private String[] symbols = new String[]{"INTC", "BABA", "TSLA", "AIR.PA", "MSFT", "AAPL",
            "OHI", "MPW", "MMM", "SWK", "PFE", "ABB", "JNJ", "MDT", "RIO", "EPD", "ET", "USA",
            "BHP", "BP", "BCE", "VZ", "GOOG"};

    public UserPortfolio(BigDecimal cash, TreeMap<String, Integer> shares) {
    }

    public void refreshPortfolioData() throws IOException {
        ownedStocks = new ArrayList<>();

        for (String symbol : symbols) {
            Stock stock = YahooFinance.get(symbol);
            if (stock != null) {
                int quantity = shares.getOrDefault(symbol, 0);
                BigDecimal pricePerUnit = stock.getQuote().getPrice();
                BigDecimal totalPrice = pricePerUnit.multiply(BigDecimal.valueOf(quantity));
                ownedStocks.add(new OwnStock(symbol, quantity, pricePerUnit, totalPrice));
            }
        }

        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return ownedStocks.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        OwnStock stock = ownedStocks.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return stock.getSymbol();
            case 1:
                return stock.getQuantity();
            case 2:
                return stock.getPricePerUnit();
            case 3:
                return stock.getTotalPrice();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
}
