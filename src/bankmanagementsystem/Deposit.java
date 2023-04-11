package bankmanagementsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Deposit extends JFrame implements ActionListener
{
    JTextField amountTextField;
    JButton depositButton;
    JButton backButton;
    
    String pinNumber;
    
    Deposit(String pinNumber)
    {
        setTitle("Deposit Page");
        
        this.pinNumber = pinNumber;
        
        ImageIcon image1Icon = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image image = image1Icon.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon image2Icon = new ImageIcon(image);
        JLabel imageLabel = new JLabel(image2Icon);
        imageLabel.setBounds(0, 0, 900, 900);
        add(imageLabel);
        
        JLabel text = new JLabel("Enter the amount you want to deposit");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(170, 300, 400, 20);
        imageLabel.add(text);
        
        amountTextField = new JTextField();
        amountTextField.setFont(new Font("Raleway", Font.BOLD, 22));
        amountTextField.setBounds(170, 350, 320, 25);
        imageLabel.add(amountTextField);
        
        depositButton = new JButton("Deposit");
        depositButton.setBounds(355, 485, 150, 30);
        depositButton.addActionListener(this);
        imageLabel.add(depositButton);
        
        backButton = new JButton("Back");
        backButton.setBounds(355, 520, 150, 30);
        backButton.addActionListener(this);
        imageLabel.add(backButton);
        
        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == depositButton)
        {
           String money = amountTextField.getText();
           Date date = new Date();
           
           if(money.equals(""))
           {
               JOptionPane.showMessageDialog(null, "Please enter the amount you want to deposit");
           }
           
           else
           {
               try
               {
                    Conn conn = new Conn();
                    String query = "insert into bank values('"+pinNumber+"', '"+date+"', 'deposit', '"+money+"')";
                    conn.s.executeUpdate(query);

                    JOptionPane.showMessageDialog(null, "Rs " + money + "Deposited Successfully");
                    setVisible(false);
                    new Transactions(pinNumber).setVisible(true);
               }
               
               catch(Exception e)
               {
                    System.out.println(e);
               }
               
           }
        }
        
        else if(ae.getSource()== backButton)
        {
            setVisible(false);
            new Transactions(pinNumber).setVisible(true);
        }
    }
    
    public static void main(String args[])
    {
        new Deposit("");
    }
}
