import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ATM extends JFrame {

    private JTextField amountField;
    private double balance = 500;

    public void Deposit(double amt) {
        balance += amt;
    }

    public void Withdraw(double amt) {
        if (balance > 500)
            balance -= amt;
        else
            System.out.println("Withdraw Limit Exceed");
    }

    public void Display() {
        System.out.println(balance);
    }

    public ATM() {
        setTitle("ATM WELCOME's YOU");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JButton depositButton = new JButton("Deposit");
        JButton withdrawButton = new JButton("Withdraw");
        JButton displayButton = new JButton("Display Balance");
        JButton exitButton = new JButton("Exit");

        JLabel amountLabel = new JLabel("Enter Amount:");

        amountField = new JTextField();

        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amount = Double.parseDouble(amountField.getText());
                Deposit(amount);
                JOptionPane.showMessageDialog(null, "Deposit Successful");
                amountField.setText("");
            }
        });

        withdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amount = Double.parseDouble(amountField.getText());
                if(balance>500){
                    Withdraw(amount);
                    JOptionPane.showMessageDialog(null, "Withdrawal Successful");
                    amountField.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Withdrawal Balance Limit Exceed ");
                }
            }
        });

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Balance: " + balance);
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Thank You! Visit Again!!");
                System.exit(0);
            }
        });

        panel.add(amountLabel);
        panel.add(amountField);
        panel.add(depositButton);
        panel.add(withdrawButton);
        panel.add(displayButton);
        panel.add(exitButton);

        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ATM();
            }
        });
    }
}
