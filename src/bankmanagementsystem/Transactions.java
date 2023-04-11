package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Transactions extends JFrame implements ActionListener
{
    JButton depositButton;
    JButton withdrawlButton;
    JButton fastCashButton;
    JButton miniStatementButton;
    JButton pinChangeButton;
    JButton balanceEnquiryButton;
    JButton exitButton;
    
    String pinNumber;
    
    Transactions(String pinNumber)
    {
        setTitle("Automated teller Machine");
        
        this.pinNumber = pinNumber;
        
        setLayout(null);
        
        ImageIcon image1Icon = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image image = image1Icon.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon image2Icon = new ImageIcon(image);
        JLabel imageLabel = new JLabel(image2Icon);
        imageLabel.setBounds(0, 0, 900, 900);
        add(imageLabel);
        
        JLabel text = new JLabel("Please select your Transaction");
        text.setBounds(210, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        imageLabel.add(text);
        
        depositButton = new JButton("Deposit");
        depositButton.setBounds(170, 415, 150, 30);
        depositButton.addActionListener(this);
        imageLabel.add(depositButton);
        
        withdrawlButton = new JButton("Withdraw");
        withdrawlButton.setBounds(355, 415, 150, 30);
        withdrawlButton.addActionListener(this);
        imageLabel.add(withdrawlButton);
        
        fastCashButton = new JButton("Fast Cash");
        fastCashButton.setBounds(170, 450, 150, 30);
        imageLabel.add(fastCashButton);
        
        miniStatementButton = new JButton("Mini Statement");
        miniStatementButton.setBounds(355, 450, 150, 30);
        miniStatementButton.addActionListener(this);
        imageLabel.add(miniStatementButton);
        
        pinChangeButton = new JButton("Pin Change");
        pinChangeButton.setBounds(170, 485, 150, 30);
        pinChangeButton.addActionListener(this);
        imageLabel.add(pinChangeButton);
        
        balanceEnquiryButton = new JButton("Balance Enquiry");
        balanceEnquiryButton.setBounds(355, 485, 150, 30);
        balanceEnquiryButton.addActionListener(this);
        imageLabel.add(balanceEnquiryButton);
        
        exitButton = new JButton("Exit");
        exitButton.setBounds(355, 520, 150, 30);
        exitButton.addActionListener(this);
        imageLabel.add(exitButton);
        
        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == exitButton)
        {
            System.exit(0);
        }
        
        else if(ae.getSource() == depositButton)
        {
            setVisible(false);
            new Deposit(pinNumber).setVisible(true);
        }
        
        else if(ae.getSource() == withdrawlButton)
        {
            setVisible(false);
            new Withdrawl(pinNumber).setVisible(true);
        }
        
        else if(ae.getSource() == fastCashButton)
        {
            setVisible(false);
            new FastCash(pinNumber).setVisible(true);
        }
        
        else if(ae.getSource() == pinChangeButton)
        {
            setVisible(false);
            new PinChange(pinNumber).setVisible(true);
        }
        
        else if(ae.getSource() == balanceEnquiryButton)
        {
            setVisible(false);
            new BalanceEnquiry(pinNumber).setVisible(true);
        }
        
        else if(ae.getSource() == miniStatementButton)
        {
            new MiniStatement(pinNumber).setVisible(true);
        }
    }
    
    public static void main(String args[])
    {
        new Transactions("");
    }
}
