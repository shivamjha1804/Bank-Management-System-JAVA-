package bankmanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class BalanceEnquiry extends JFrame implements ActionListener
{
    String pinNumber;
    
    JButton backButton;
    
    int balance = 0;
    
    BalanceEnquiry(String pinNumber)
    {
        setTitle("Balance Enquiry Page");
        
        this.pinNumber = pinNumber;
        
        setLayout(null);
        
        ImageIcon image1Icon = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image image = image1Icon.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon image2Icon = new ImageIcon(image);
        JLabel imageLabel = new JLabel(image2Icon);
        imageLabel.setBounds(0, 0, 900, 900);
        add(imageLabel);
        
        backButton = new JButton("Back");
        backButton.setBounds(355, 520, 150, 30);
        backButton.addActionListener(this);
        imageLabel.add(backButton);
        
        Conn conn = new Conn();
            
        try
        {
            ResultSet rs = conn.s.executeQuery("select * from bank where pin = '"+pinNumber+"'");

            while(rs.next())
            {
                if(rs.getString("type").equals("Deposit"))
                {
                    balance += Integer.parseInt(rs.getString("amount"));
                }

                else
                {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        JLabel text = new JLabel("Your current account balance is RS. " + balance);
        text.setBounds(170,300, 400, 30);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        imageLabel.add(text);
        
        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
        new Transactions(pinNumber).setVisible(true);
    }
    
    public static void main(String args[])
    {
        new BalanceEnquiry("").setVisible(true);
    }
}
