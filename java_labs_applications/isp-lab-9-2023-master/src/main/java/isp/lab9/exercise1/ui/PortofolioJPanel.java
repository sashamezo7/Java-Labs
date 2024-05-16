package isp.lab9.exercise1.ui;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * todo: implement portfolio panel; for each owned stock add symbol, quantity, price per unit, total price of the position
 *  it should look similar to the 'Market' panel
 */
public class PortofolioJPanel extends JPanel {
    private StockMarketJFrame frame;

    public PortofolioJPanel(StockMarketJFrame frame) {
        this.frame = frame;
    }
    private void initComponent(){
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        JTable jTablePortofolio = new JTable();
        jTablePortofolio.setModel(frame.getPortfolio());
        JButton refreshButton = new JButton("Refresh");
        refreshButton.addActionListener(evt -> buttonRefreshActionPerformed(evt));

        JScrollPane PortfolioScrollablePane=new JScrollPane(jTablePortofolio);
        add(PortfolioScrollablePane);
        add(refreshButton);

    }

    private void buttonRefreshActionPerformed(ActionEvent evt) {
        try {
            frame.getMarketService().refreshMarketData();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this,
                    ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(StockMarketJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
