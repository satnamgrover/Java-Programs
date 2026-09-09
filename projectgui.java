import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class projectgui {
    
    private static int tokenNumber = 900;
    private static int orderCount = 0;
    private static String[] orders = new String[10];
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pizza Order System");
        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(255, 255, 255)); // White

        JLabel titleLabel = new JLabel("Welcome to Friends Pizza!", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(new Color(255, 69, 0)); //  Red-Orange
        titleLabel.setBounds(150, 20, 400, 40);
        frame.add(titleLabel);

        JLabel sizeLabel = new JLabel("Choose Pizza Size: ");
        sizeLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        sizeLabel.setBounds(50, 100, 150, 30);
        frame.add(sizeLabel);

        String[] sizes = {"Small", "Medium", "Large"};
        JComboBox<String> sizeCombo = new JComboBox<>(sizes);
        sizeCombo.setBounds(200, 100, 150, 30);
        frame.add(sizeCombo);

        JLabel crustLabel = new JLabel("Choose Pizza Crust: ");
        crustLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        crustLabel.setBounds(50, 150, 150, 30);
        frame.add(crustLabel);

        String[] crusts = {"Thin", "Thick", "Stuffed"};
        JComboBox<String> crustCombo = new JComboBox<>(crusts);
        crustCombo.setBounds(200, 150, 150, 30);
        frame.add(crustCombo);

        JCheckBox cheeseCheck = new JCheckBox("Cheese (+Rs.10)");
        JCheckBox sweetCheckBox = new JCheckBox("sweetCorn(+Rs.20)");
        JCheckBox onionBox = new JCheckBox("onion(+Rs.15)");

        cheeseCheck.setBounds(200, 200, 200, 30);
        sweetCheckBox.setBounds(200, 230, 200, 30);
        onionBox.setBounds(200, 260, 200, 30);

        frame.add(cheeseCheck);
        frame.add(sweetCheckBox);
        frame.add(onionBox);

        JButton submitButton = new JButton("Place Order");
        submitButton.setBounds(250, 300, 150, 30); 
        submitButton.setBackground(new Color(60, 179, 113)); // Green
        submitButton.setForeground(Color.WHITE);
        submitButton.setFont(new Font("Arial", Font.BOLD, 14));
        frame.add(submitButton);

        JButton searchButton = new JButton("Search Order");
        searchButton.setBounds(250, 350, 150, 30); 
        searchButton.setBackground(new Color(255, 140, 0)); //  Orange
        searchButton.setForeground(Color.WHITE);
        searchButton.setFont(new Font("Arial", Font.BOLD, 14));
        searchButton.setEnabled(false); 
        frame.add(searchButton);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(50, 400, 600, 200);
        textArea.setEditable(false);
        textArea.setBackground(new Color(255, 255, 255)); // White
        textArea.setForeground(new Color(0, 0, 0)); // Black
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(50, 400, 600, 200);
        frame.add(scrollPane);

        JTextField tokenField = new JTextField();
        tokenField.setBounds(450, 350, 100, 30);
        frame.add(tokenField);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (orderCount < 10) {
                    String size = (String) sizeCombo.getSelectedItem();
                    String crust = (String) crustCombo.getSelectedItem();
                    String toppings = "";
                    if (cheeseCheck.isSelected()) toppings += "Cheese ";
                    if (sweetCheckBox.isSelected()) toppings += "sweetCorn";
                    if (onionBox.isSelected()) toppings += "onion ";
                    int price = 0;
                    if (size.equals("Small")) price += 25;
                    else if (size.equals("Medium")) price += 50;
                    else if (size.equals("Large")) price += 70;
                    if (crust.equals("Thin")) price += 10;
                    else if (crust.equals("Thick")) price += 15;
                    else if (crust.equals("Stuffed")) price += 30;
                    if (cheeseCheck.isSelected()) price += 10;
                    if (sweetCheckBox.isSelected()) price += 20;
                    if (onionBox.isSelected()) price += 25;
                    String orderSummary ="order summary :" + "\nToken: " + tokenNumber + "\nSize: " + size + "\nCrust: " + crust + "\nToppings: " + toppings + "\nPrice: Rs." + price + "\nthanks for ordering! , your pizza will be delivered in 30 minutes";
                    orders[orderCount] = orderSummary;
                    textArea.setText(orderSummary);
                    tokenNumber++;
                    orderCount++;

                    
                    searchButton.setEnabled(true);
                } else {
                    textArea.setText("Order limit reached! Please try again later.");
                }
            }
        });

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int token = Integer.parseInt(tokenField.getText());
                if (token >= 900 && token < 900 + orderCount) {
                    textArea.setText(orders[token - 900]);
                } else {
                    textArea.setText("Invalid Token ID.");
                }
            }
        });

        frame.setVisible(true);
    }
}
