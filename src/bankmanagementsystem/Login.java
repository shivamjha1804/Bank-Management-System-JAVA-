package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener
{
    
    JButton loginButton;
    JButton clearButton;
    JButton signUpButton;
    
    JTextField text2CardNoTextField;
    JPasswordField text3PinNoPasswordField;
    
    Login()
    {
        setTitle("Login Page");
        setLayout(null);
        
        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image img2 = img1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel label = new JLabel(img3);
        label.setBounds(70, 10, 100, 100);
        add(label);
        
        JLabel text1 = new JLabel("Welcome To ATM");
        text1.setFont(new Font("Osward", Font.BOLD, 38));
        text1.setBounds(200, 40, 400, 40);
        add(text1);
        
        JLabel text2 = new JLabel("Card No.");
        text2.setFont(new Font("Osward", Font.BOLD, 28));
        text2.setBounds(120, 150, 150, 30);
        add(text2);
        
        text2CardNoTextField = new JTextField();
        text2CardNoTextField.setBounds(300, 150, 230, 30);
        text2CardNoTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(text2CardNoTextField);
     
        JLabel text3 = new JLabel("PIN No.");
        text3.setFont(new Font("Osward", Font.BOLD, 28));
        text3.setBounds(120, 220, 250, 30);
        add(text3);
        
        text3PinNoPasswordField = new JPasswordField();
        text3PinNoPasswordField.setBounds(300, 220, 230, 30);
        text3PinNoPasswordField.setFont(new Font("Arial", Font.BOLD, 14));
        add(text3PinNoPasswordField);
        
        loginButton = new JButton("SIGN IN");
        loginButton.setBounds(300, 300, 100, 30);
        loginButton.setBackground(Color.BLACK);
        loginButton.setForeground(Color.WHITE);
        loginButton.addActionListener(this);
        add(loginButton);
        
        clearButton = new JButton("CLEAR");
        clearButton.setBounds(430, 300, 100, 30);
        clearButton.setBackground(Color.BLACK);
        clearButton.setForeground(Color.WHITE);
        clearButton.addActionListener(this);
        add(clearButton);
        
        signUpButton = new JButton("SIGN UP");
        signUpButton.setBounds(300, 350, 230, 30);
        signUpButton.setBackground(Color.BLACK);
        signUpButton.setForeground(Color.WHITE);
        signUpButton.addActionListener(this);
        add(signUpButton);
     
        getContentPane().setBackground(Color.WHITE);
        setSize(800, 480);
        setVisible(true);
        setUndecorated(true);
        setLocation(350, 200);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == clearButton)
        {
            text2CardNoTextField.setText("");
            text3PinNoPasswordField.setText("");
        }
        
        else if(ae.getSource() == loginButton)
        {
            Conn conn = new Conn();
            String cardNumber = text2CardNoTextField.getText();
            String pinNumber = text3PinNoPasswordField.getText();
            String query = "select * from login where card_number = '"+cardNumber+"' and pin_number = '"+pinNumber+"'";
            try
            {
                ResultSet rs = conn.s.executeQuery(query);
                if(rs.next())
                {
                    setVisible(false);
                    new Transactions(pinNumber).setVisible(true);
                }
                
                else
                {
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
                }
            }
            
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        
        else if(ae.getSource() == signUpButton)
        {
            setVisible(false);
            new SignUpOne().setVisible(true);
        }
    }
    
    public static void main(String args[])
    {
        new Login();
    }
}
