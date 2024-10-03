package SWING;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TipCalculator extends JFrame {

    public TipCalculator() {
        setTitle("Tip Calculator");
        setSize(550, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // Main panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBackground(new Color(67, 23, 19)); // Background color similar to the image

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        // Title
        JLabel titleLabel = new JLabel("TIP CALCULATOR");
        titleLabel.setFont(new Font("Serif", Font.BOLD, 20));
        titleLabel.setForeground(Color.WHITE);
        gbc.gridx = -1;
        gbc.gridy = -1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(titleLabel);

        // Bill Amount
        JLabel billLabel = new JLabel("How much was your bill?");
        billLabel.setForeground(Color.WHITE);
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(billLabel, gbc);

        JTextField billField = new JTextField(15);
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(billField, gbc);

        // Service quality
        JLabel serviceLabel = new JLabel("How was your service?");
        serviceLabel.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(serviceLabel, gbc);

        String[] serviceOptions = {"-- Choose an Option --", "Excellent", "Good", "Average", "Poor"};
        JComboBox<String> serviceCombo = new JComboBox<>(serviceOptions);
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(serviceCombo, gbc);

        // Number of people
        JLabel peopleLabel = new JLabel("How many people are sharing the bill?");
        peopleLabel.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(peopleLabel, gbc);

        JTextField peopleField = new JTextField(15);
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(peopleField, gbc);

        // Calculate button
        JButton calculateButton = new JButton("CALCULATE!");
        calculateButton.setBackground(new Color(153, 0, 0)); // Dark red button color
        calculateButton.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(calculateButton, gbc);

        // ActionListener for button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Calculation logic goes here
                double billAmount = Double.parseDouble(billField.getText());
                int numberOfPeople = Integer.parseInt(peopleField.getText());
                String serviceQuality = (String) serviceCombo.getSelectedItem();

                double tipPercentage = 0;
                switch (serviceQuality) {
                    case "Excellent":
                        tipPercentage = 0.20;
                        break;
                    case "Good":
                        tipPercentage = 0.15;
                        break;
                    case "Average":
                        tipPercentage = 0.10;
                        break;
                    case "Poor":
                        tipPercentage = 0.05;
                        break;
                }

                double tip = billAmount * tipPercentage;
                double totalAmount = billAmount + tip;
                double amountPerPerson = totalAmount / numberOfPeople;

                JOptionPane.showMessageDialog(null,
                        String.format("Total Tip: $%.2f%nTotal Bill (with Tip): $%.2f%nAmount Per Person: $%.2f",
                                tip, totalAmount, amountPerPerson),
                        "Tip Calculation", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TipCalculator().setVisible(true);
            }
        });
    }
}







