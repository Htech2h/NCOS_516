package SWING;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TipCalculatorLayout{
    public static int customTipValue;
    public static void main(String[] args) {
        //////////////////the app layout
        JFrame f = new JFrame("Tip Calculator");
        f.setSize(1320, 720);
        f.setLayout(null); // using no layout managers
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ///////////////////// Left Panel
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(new Color(174, 202, 214)); // Light Blue color
        leftPanel.setBounds(0, 0, 660, 720); // Set the size to cover the left half
        leftPanel.setLayout(null); // Set layout to null for absolute positioning

        JLabel leftLabel = new JLabel("BILL AMOUNT:");
        leftLabel.setBounds(50, 15, 500, 50);
        leftPanel.setFont(new Font("Tahoma", Font.BOLD, 15));
        leftPanel.add(leftLabel);

        // Adding a text area to the left panel
        JTextArea textArea = new JTextArea();
        textArea.setBounds(50, 50, 300, 30); // Positioning and size (x, y, width, height)
        leftPanel.add(textArea);

        ////////////////////////////////////////
        JLabel tipAmountLabel = new JLabel("SELECT TIP:");
        tipAmountLabel.setBounds(50, 150, 500, 50);
        leftPanel.add(tipAmountLabel);

        //////////////tip buttons
        JButton tip10Button = new JButton("10%");
        tip10Button.setBounds(50, 200, 100, 25);
        leftPanel.add(tip10Button);

        JLabel tip1Button = new JLabel("BAD");
        tip1Button.setBounds(75, 230, 100, 25);
        leftPanel.add(tip1Button);

        JButton tip15Button = new JButton("15%");
        tip15Button.setBounds(170, 200, 100, 25);
        leftPanel.add(tip15Button);

        JLabel tip2Button = new JLabel("GOOD");
        tip2Button.setBounds(195, 230, 100, 25);
        leftPanel.add(tip2Button);

        JButton tip25Button = new JButton("25%");
        tip25Button.setBounds(290, 200, 100, 25);
        leftPanel.add(tip25Button);

        JLabel tip3Button = new JLabel("EXCELLENT");
        tip3Button.setBounds(315, 230, 100, 25);
        leftPanel.add(tip3Button);

        JButton customTip = new JButton("Custom Tip");
        customTip.setBounds(410, 200, 120, 25);
        leftPanel.add(customTip);

        JComboBox<String> customTipBox = new JComboBox<>(new String[]{"SELECT OPTION", "bad", "good", "excellent"});
        customTipBox.setBounds(50, 280, 200, 25);
        leftPanel.add(customTipBox);

        // Number of People Label and Text Field
        JLabel peopleLabel = new JLabel("Number of People Sharing The Bill:");
        peopleLabel.setBounds(50, 440, 300, 25);
        peopleLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        leftPanel.add(peopleLabel);

        JTextField peopleField = new JTextField();
        peopleField.setBounds(50, 470, 200, 25);
        leftPanel.add(peopleField);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.setBounds(50, 580, 120, 30);
        leftPanel.add(calculateButton);

        // Add the left panel to the frame
        f.add(leftPanel);

        ///////////////////// Right Panel
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(new Color(144, 238, 144)); // Light Green color
        rightPanel.setBounds(660, 0, 660, 720); // Set the size to cover the right half
        rightPanel.setLayout(null); // Set layout to null for absolute positioning

        ///////////////////////rightDisplayer
        JPanel rightDisplayer = new JPanel();
        rightDisplayer.setBackground(new Color(174, 202, 214));
        rightDisplayer.setBounds(730, 150, 500, 270);
        rightDisplayer.setLayout(null);
        f.add(rightDisplayer);


        // Adding labels to display results
        JLabel result = new JLabel("RESULTS");
        result.setBounds(250, 100, 500, 50);
        result.setFont(new Font("Times New Roman", Font.BOLD, 30));
        result.setForeground(new Color(51, 51, 51));
        rightPanel.add(result);

        JLabel tipAmountLabelRight = new JLabel("Tip Amount:");
        tipAmountLabelRight.setBounds(50, 50, 350, 50);
        tipAmountLabelRight.setFont(new Font("Serif", Font.BOLD, 25));
        rightPanel.setForeground(new Color(51, 51, 51));
        rightDisplayer.add(tipAmountLabelRight);

        JLabel totalPerPersonLabel = new JLabel("Total Per Person:");
        totalPerPersonLabel.setBounds(50, 100, 350, 50);
        totalPerPersonLabel.setFont(new Font("Serif", Font.BOLD, 25));
        totalPerPersonLabel.setForeground(new Color(51, 51, 51));
        rightDisplayer.add(totalPerPersonLabel);

        JLabel total = new JLabel("TOTAL:");
        total.setBounds(50, 150, 350, 50);
        total.setFont(new Font("Serif", Font.BOLD, 25));
        total.setForeground(new Color(51, 51, 51));
        rightDisplayer.add(total);

        // Add right panel to the frame
        f.add(rightPanel);

        // Action Listeners
        tip10Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                customTipBox.setSelectedIndex(1); // Set dropdown to "bad"
            }
        });

        tip15Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                customTipBox.setSelectedIndex(2); // Set dropdown to "good"
            }
        });

        tip25Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                customTipBox.setSelectedIndex(3); // Set dropdown to "excellent"
            }
        });


        customTipBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = customTipBox.getSelectedIndex();
                tip10Button.setBackground(null);
                tip15Button.setBackground(null);
                tip25Button.setBackground(null);
                customTip.setBackground(null);

                switch (selectedIndex) {
                    case 1:
                        tip10Button.setBackground(Color.CYAN);
                        break;
                    case 2:
                        tip15Button.setBackground(Color.CYAN);
                        break;
                    case 3:
                        tip25Button.setBackground(Color.CYAN);
                        break;
                    default:
                        break;
                }
                if(customTipValue >25){
                    tip10Button.setBackground(null);
                    tip15Button.setBackground(null);
                    tip25Button.setBackground(null);
                    customTip.setBackground(Color.CYAN);
                }
            }
        });

        customTip.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to execute when the button is clicked

                customTip.setBackground(new Color(174, 202, 214));
                customTipValue = Integer.parseInt(JOptionPane.showInputDialog(f,"Enter Custom Tip"));
                if(customTipValue <25){
                    JOptionPane.showMessageDialog(f, "Custom Tip Amount less than 25 will Not Apply");
                }else {
                    tip10Button.setBackground(null);
                    tip15Button.setBackground(null);
                    tip25Button.setBackground(null);
                    customTip.setBackground(Color.CYAN);
                    JOptionPane.showMessageDialog(f, "Now You Will Top " + customTipValue + "%");
                }
            }
        });


        // Action Listener for Calculate Button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = customTipBox.getSelectedIndex();
                double tipPercentage = 0;

                switch (selectedIndex) {
                    case 1:
                        tipPercentage = 0.10;
                        break;
                    case 2:
                        tipPercentage = 0.15;
                        break;
                    case 3:
                        tipPercentage = 0.25;
                        break;
                    default:
                        JOptionPane.showMessageDialog(f, "Please select Your Satisfaction! In The DropDown Menu");
                        return;
                }
                calculateTip(textArea, peopleField, tipPercentage, tipAmountLabelRight, totalPerPersonLabel,total);
            }
        });

        f.setVisible(true); // making the frame visible
    }

    ////////////////////////////custom tip


    // Method to calculate and display the tip
    private static void calculateTip(JTextArea billAmountArea, JTextField peopleField, double tipPercentage, JLabel resultLabel, JLabel tipAmountLabel,JLabel totalLabel) {
        try {
            if( customTipValue > 25){
               tipPercentage = (double) customTipValue /100;
               customTipValue = 0;
            }

            double billAmount = Double.parseDouble(billAmountArea.getText());
            int numberOfPeople = Integer.parseInt(peopleField.getText());

            double tipAmount = billAmount * tipPercentage;
            double totalAmount = billAmount + tipAmount;
            double amountPerPerson = totalAmount / numberOfPeople;


            tipAmountLabel.setText(String.format("Tip Amount: $%.2f", tipAmount));
            resultLabel.setText(String.format("Total Per Person: $%.2f", amountPerPerson));
            totalLabel.setText(String.format("Total: $%.2f",totalAmount));
        } catch (NumberFormatException ex) {
            tipAmountLabel.setText("Please enter valid numbers!");
            resultLabel.setText("");
            totalLabel.setText("");
        }
    }
}






