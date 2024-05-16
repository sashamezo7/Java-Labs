package isp.lab9.exercise1.ui;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class RegistreJFrame extends JFrame {
    public static final Map<JTextField,JPasswordField> accounts = new HashMap<>();

    public RegistreJFrame() {
        //display
        this.setVisible(true);
        //setup the window
        this.setTitle("Registre");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(200, 200, 300, 200);

        //create and add components
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(20, 20, 100, 20);
        this.add(userLabel);

        JTextField userInputField = new JTextField();
        userInputField.setBounds(160, 20, 100, 20);
        this.add(userInputField);

        JLabel pwdLabel = new JLabel("Password:");
        pwdLabel.setBounds(20, 60, 100, 20);
        this.add(pwdLabel);

        JPasswordField pwdInputField = new JPasswordField();
        pwdInputField.setBounds(160, 60, 100, 20);
        this.add(pwdInputField);

        JButton button = new JButton("Registre");
        button.setBounds(20, 100, 240, 20);
        this.add(button);

        // initialize accounts
        initAccounts(userInputField,pwdInputField);

        // add event listener to button
        button.addActionListener(e -> new LoginJFrame());

    }
    private void initAccounts(JTextField username, JPasswordField password) {
        accounts.put(username,password);
       // RegistreJFrame.this.setVisible(false);
    }


}
