import javax.swing.*;
import java.util.Random;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class pizzaordering extends JFrame
{
    private JTextField nameField;
    private JTextField mobile ;
    private JTextField address;
    private JComboBox<String> pizzasize;
    private JCheckBox[] toppings;
    private JRadioButton cashpay , cardpay ;
    private double toppingprice = 10;
    private double baseprice;
    private double total;

    public pizzaordering()
    {
        // dispalying window
        setTitle("Online Pizza Order System");
        setSize(500 , 500 );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // main panel
        JPanel mainpanel = new JPanel();
        mainpanel.setLayout(new BoxLayout(mainpanel, BoxLayout.Y_AXIS));
        mainpanel.setBorder(BorderFactory.createEmptyBorder(10,10, 10, 10));

        // cutomer details 
        JPanel namPanel = new JPanel(new GridLayout(0,1));
        namPanel.add(new JLabel("customer name : ")); 
        nameField = new JTextField(15);
        namPanel.add(nameField);
        namPanel.add(new JLabel("Mobile no. :"));
        mobile = new JTextField(10);
        namPanel.add(mobile);
        namPanel.add(new JLabel("address : "));
        address = new JTextField(20);
        namPanel.add(address);
        mainpanel.add(namPanel);


        // pizza selection
        JPanel pizzapanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pizzapanel.add(new JLabel("Choose Pizza Size : "));
        String[] sizes = {"small (Rs. 60)", "Medium (Rs. 80)" , "Large (Rs. 100)"};
        pizzasize = new JComboBox<>(sizes);
        pizzapanel.add(pizzasize);
        mainpanel.add(pizzapanel);

        // Topping selection
        JPanel Toppingpanel = new JPanel(new GridLayout(5,1));
        Toppingpanel.add(new JLabel("Choose Toppings (for each Rs 10 ) : "));
        String[] toopings = {"veggies" , "mushrroms" , "sweetcorn" , "onion" , "Tomato"};
        toppings = new JCheckBox[toopings.length];
        for(int i = 0; i<toopings.length; i++)
        {
            toppings[i] = new JCheckBox(toopings[i]);
            Toppingpanel.add(toppings[i]);
        }
        mainpanel.add(Toppingpanel);
        

        // payment selection
        JPanel Paypannel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        Paypannel.add(new JLabel("Choose Payment Method : "));
        cashpay = new JRadioButton("cash",true);
        cardpay = new JRadioButton("card");
        ButtonGroup paygroup = new ButtonGroup();
        paygroup.add(cashpay);
        paygroup.add(cardpay);
        Paypannel.add(cashpay);
        Paypannel.add(cardpay);
        mainpanel.add(Paypannel);

        // for order
        JButton orderbutton = new JButton("Order Now ");
        orderbutton.addActionListener(new ActionListener() 
            
         {
            @Override
            public void actionPerformed(ActionEvent e)
            {   total();
                placeorder();
            }
        });


        //adding all components in the frame
        add(mainpanel, BorderLayout.CENTER);
        add(orderbutton, BorderLayout.SOUTH);
        setVisible(true);
    }
    // update total price
    private void total()
    {
        int selectedpizza = pizzasize.getSelectedIndex();
        switch (selectedpizza) {
            case 0 -> baseprice = 60; //small
            case 1 -> baseprice = 80; //medium
            case 2 -> baseprice = 100 ;//large
        }
         total = baseprice;

        for (JCheckBox i : toppings)
        {
            if(i.isSelected())
            {
                total += toppingprice;
            }
        }
    }
    // handling order processing
    private void placeorder()
    {
        String customername = nameField.getText().trim();
        String phone = mobile.getText();
        String add = address.getText().trim();
        String pizza = (String) pizzasize.getSelectedItem();
        String payment = cashpay.isSelected() ?  "cash" : "card";
        
        // validtion
        if(customername.isEmpty())
        {
            JOptionPane.showMessageDialog(this,  "please enter your name ", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if (phone.isEmpty())
        {
            JOptionPane.showMessageDialog(this,  "please enter your mobile no. ", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if (add.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"please enter your address", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }


        int orderid = genratedorderid();

        // saving order details in file 
        Saveorder( orderid,  customername, phone,  add , pizza , payment);
    }

    // genrating random orderid
    private int genratedorderid()
    {
        Random random = new Random();
        return 1000 + random.nextInt(90000);
    }

    // function for saving order details in file
    private void Saveorder(int orderid, String customername, String phone, String add , String pizza , String payment)
    {
        try ( FileWriter fw = new FileWriter("orders.txt" , true);
            PrintWriter pw = new PrintWriter(fw))
            {
                pw.println("order id" + orderid +  " | customer name : " + customername +  " | mobile no. : " + phone +  " | address : " + add  + " | pizza : " + pizza +  " | payment method : " + payment + " | Total Bill : " + total);
                JOptionPane.showMessageDialog(this,  "order id : " + orderid +  "\ncustomer name : " + customername +  "\nmobile no. : " + phone +  "\naddress : " + add  + "\npizza : " + pizza + "\nToppings (for each) :" + toppingprice +"\nTotal Bill : " + total +"\npayment method : "  + payment , "order saved sucessfully", JOptionPane.INFORMATION_MESSAGE);

            }
        catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this , "Error saving order" , "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // main method 
    public static void main(String[] args) {
        new pizzaordering();
    }
}