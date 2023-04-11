package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener
{
    JButton oneHundredRupeesButton;
    JButton twoHundredRupeesButton;
    JButton fiveHundredRupeesButton;
    JButton oneThousandRupeesButton;
    JButton twoThousandRupeesButton;
    JButton fiveThousandRupeesButton;
    JButton backButton;
    
    String pinNumber;
    
    FastCash(String pinNumber)
    {
        setTitle("Fast Cash page");
        
        this.pinNumber = pinNumber;
        
        setLayout(null);
        
        ImageIcon image1Icon = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image image = image1Icon.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon image2Icon = new ImageIcon(image);
        JLabel imageLabel = new JLabel(image2Icon);
        imageLabel.setBounds(0, 0, 900, 900);
        add(imageLabel);
        
        JLabel text = new JLabel("Please select withdrawl amount");
        text.setBounds(210, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        imageLabel.add(text);
        
        oneHundredRupeesButton = new JButton("Rs 100");
        oneHundredRupeesButton.setBounds(170, 415, 150, 30);
        oneHundredRupeesButton.addActionListener(this);
        imageLabel.add(oneHundredRupeesButton);
        
        twoHundredRupeesButton = new JButton("Rs 200");
        twoHundredRupeesButton.setBounds(355, 415, 150, 30);
        twoHundredRupeesButton.addActionListener(this);
        imageLabel.add(twoHundredRupeesButton);
        
        fiveHundredRupeesButton = new JButton("Rs 500");
        fiveHundredRupeesButton.setBounds(170, 450, 150, 30);
        imageLabel.add(fiveHundredRupeesButton);
        
        oneThousandRupeesButton = new JButton("Rs 1000");
        oneThousandRupeesButton.setBounds(355, 450, 150, 30);
        oneThousandRupeesButton.addActionListener(this);
        imageLabel.add(oneThousandRupeesButton);
        
        twoThousandRupeesButton = new JButton("Rs 2000");
        twoThousandRupeesButton.setBounds(170, 485, 150, 30);
        twoThousandRupeesButton.addActionListener(this);
        imageLabel.add(twoThousandRupeesButton);
        
        fiveThousandRupeesButton = new JButton("Rs 5000");
        fiveThousandRupeesButton.setBounds(355, 485, 150, 30);
        fiveThousandRupeesButton.addActionListener(this);
        imageLabel.add(fiveThousandRupeesButton);
        
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
        if(ae.getSource() == backButton)
        {
            setVisible(false);
            new Transactions(pinNumber).setVisible(true);
        }
        
        else
        {
            String amount =((JButton) ae.getSource()).getText().substring(3);
            Conn conn = new Conn();
            
            try
            {
                ResultSet rs = conn.s.executeQuery("select * from bank where pin = '"+pinNumber+"'");
                
                int balance = 0;
                
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
                
                if(ae.getSource() != backButton && balance <Integer.parseInt(amount))
                {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }
                
                Date date = new Date();
                String query = "insert into bank values('"+pinNumber+"', '"+date+"', 'withdrawl', '"+amount+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs " + amount + "Debited Sucessfully");
                
                setVisible(false);
                new Transactions(pinNumber).setVisible(true);
            }
            
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
    
    public static void main(String args[])
    {
        new FastCash("");
    }
}
