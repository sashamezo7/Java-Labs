package isp.lab9.exercise1.ui;

import isp.lab9.exercise1.ui.StockMarketJFrame;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SellJPanel extends JPanel {
    private StockMarketJFrame mainFrame;

    public SellJPanel(StockMarketJFrame mainFrame) {
        this.mainFrame = mainFrame;
        initComponents();
    }

    private void initComponents() {
        setLayout(new GridLayout(2, 2));

        JPanel sellPanel = new JPanel();
        sellPanel.setLayout(new GridLayout(10, 2));

        JLabel availableFundsLabel = new JLabel("Available funds:");
        JTextField availableFundsTextField = new JTextField(mainFrame.getPortfolio().getCash().toPlainString() + " $");
        availableFundsTextField.setEditable(false);

        JLabel symbolLabel = new JLabel("Symbol:");
        JComboBox<String> symbolComboBox = new JComboBox<>();
        List<String> ownedSymbols = new ArrayList<>(mainFrame.getPortfolio().getShares().keySet());
        symbolComboBox.setModel(new DefaultComboBoxModel(ownedSymbols.toArray()));

        JLabel quantityLabel = new JLabel("Quantity:");
        JTextField quantityTextField = new JTextField();

        JLabel sellPriceLabel = new JLabel("Sell price per unit:");
        JTextField sellPriceTextField = new JTextField();
        sellPriceTextField.setEditable(false);

        JButton sellButton = new JButton("Sell");
        // todo: add event listener to 'Sell' button

        JButton sellPriceButton = new JButton("Get sell price");
        sellPriceButton.addActionListener(e ->
                calculateSellPriceActionPerformed(symbolComboBox, sellPriceTextField));

        sellPanel.add(availableFundsLabel);
        sellPanel.add(availableFundsTextField);
        sellPanel.add(new JPanel()); // empty cell in the grid
        sellPanel.add(new JPanel()); // empty cell in the grid
        sellPanel.add(symbolLabel);
        sellPanel.add(symbolComboBox);
        sellPanel.add(new JPanel()); // empty cell in the grid
        sellPanel.add(new JPanel()); // empty cell in the grid
        sellPanel.add(quantityLabel);
        sellPanel.add(quantityTextField);
        sellPanel.add(new JPanel()); // empty cell in the grid
        sellPanel.add(new JPanel()); // empty cell in the grid
        sellPanel.add(sellPriceLabel);
        sellPanel.add(sellPriceTextField);
        sellPanel.add(new JPanel()); // empty cell in the grid
        sellPanel.add(new JPanel()); // empty cell in the grid
        sellPanel.add(sellPriceButton);
        sellPanel.add(sellButton);
        add(sellPanel);
        add(new JPanel()); // empty cell in the grid
        add(new JPanel()); // empty cell in the grid
        add(new JPanel()); // empty cell in the grid

        sellButton.addActionListener(e -> {
            String symbol = (String) symbolComboBox.getSelectedItem();
            int quantity = Integer.parseInt(quantityTextField.getText());

            try {
                BigDecimal sellPrice = mainFrame.getMarketService().getStockPrice(symbol);

                // Check if the user owns enough shares
                Map<String, Integer> shares = mainFrame.getPortfolio().getShares();
                if (!shares.containsKey(symbol) || shares.get(symbol) < quantity) {
                    JOptionPane.showMessageDialog(this,
                            "Insufficient shares. Cannot sell stocks.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                BigDecimal totalSale = sellPrice.multiply(BigDecimal.valueOf(quantity));

                // Update portfolio and perform the sale
                mainFrame.getPortfolio().setCash(mainFrame.getPortfolio().getCash().add(totalSale));
                mainFrame.getPortfolio().getShares().merge(symbol, -quantity, Integer::sum);
                mainFrame.getPortfolio().refreshPortfolioData();

                // Show success message
                JOptionPane.showMessageDialog(this,
                        "Stock sale successful!",
                        "Success",
                        JOptionPane.INFORMATION_MESSAGE);

                // Clear input fields
                quantityTextField.setText("");
                sellPriceTextField.setText("");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this,
                        ex.getMessage(),
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(StockMarketJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    /**
     * Calculates the sell price per unit
     */
    private void calculateSellPriceActionPerformed(JComboBox<String> symbolComboBox, JTextField sellPriceTextField) {
        try {
            String symbol = (String) symbolComboBox.getSelectedItem();
            BigDecimal sellPrice = mainFrame.getMarketService().getStockPrice(symbol);

            DecimalFormat formatter = new DecimalFormat("#,##0.##");
            sellPriceTextField.setText(formatter.format(sellPrice));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this,
                    ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(StockMarketJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
