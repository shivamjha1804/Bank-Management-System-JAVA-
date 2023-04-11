package bankmanagementsystem;

import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PinChange extends JFrame implements ActionListener
{
    String pinNumber;
    
    JPasswordField pinTextField;
    JPasswordField repeatPinTextField;
    
    JButton changeButton;
    JButton backButton;
    
    PinChange(String pinNumber)
    {
        setTitle("Pin Change Page");
        
        this.pinNumber = pinNumber;
        
        setLayout(null);
        
        ImageIcon image1Icon = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image image = image1Icon.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon image2Icon = new ImageIcon(image);
        JLabel imageLabel = new JLabel(image2Icon);
        imageLabel.setBounds(0, 0, 900, 900);
        add(imageLabel);
        
        JLabel text = new JLabel("Please change your pin");
        text.setBounds(250, 280, 500, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        imageLabel.add(text);
        
        JLabel pinText = new JLabel("New Pin : ");
        pinText.setBounds(165, 320, 180, 25);
        pinText.setForeground(Color.WHITE);
        pinText.setFont(new Font("System", Font.BOLD, 16));
        imageLabel.add(pinText);
        
        pinTextField = new JPasswordField();
        pinTextField.setFont(new Font("Raleway", Font.BOLD, 25));
        pinTextField.setBounds(330, 320, 180, 25);
        imageLabel.add(pinTextField);
        
        JLabel repeatPinText = new JLabel("Re-Enter New Pin : ");
        repeatPinText.setBounds(165, 320, 180, 25);
        repeatPinText.setForeground(Color.WHITE);
        repeatPinText.setFont(new Font("System", Font.BOLD, 16));
        imageLabel.add(repeatPinText);
        
        pinTextField = new JPasswordField();
        repeatPinTextField.setFont(new Font("Raleway", Font.BOLD, 25));
        repeatPinTextField.setBounds(330, 360, 180, 25);
        imageLabel.add(repeatPinTextField);
        
        changeButton = new JButton("Change");
        changeButton.setBounds(355, 485, 150, 30);
        changeButton.addActionListener(this);
        imageLabel.add(changeButton);
        
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
        if(ae.getSource() == changeButton)
        {
            try
            {
               String newPin =  pinTextField.getText();
               String repeatPin = pinTextField.getText();

               if(!newPin.equals(repeatPin))
               {
                   JOptionPane.showMessageDialog(null, "Please entered PIN does not match");

                   return;
               }
               
               if(newPin.equals(""))
               {
                   JOptionPane.showMessageDialog(null, "Please entered new PIN ");

                   return;
               }
               
               if(repeatPin.equals(""))
               {
                   JOptionPane.showMessageDialog(null, "Please re- entered new PIN");

                   return;
               }
               
               Conn conn = new Conn();
               String query1 = "update bank set pin_number = '"+repeatPin+"' where pin_number = '"+pinNumber+"'";
               String query2 = "update login set pin_number = '"+repeatPin+"' where pin_number = '"+pinNumber+"'";
               String query3 = "update signupthree set pin_number = '"+repeatPin+"' where pin_number = '"+pinNumber+"'";
               
               conn.s.executeUpdate(query1);
               conn.s.executeUpdate(query2);
               conn.s.executeUpdate(query3);
               
               JOptionPane.showMessageDialog(null, "PIN changed successfully");
               
               setVisible(false);
               new Transactions(repeatPin).setVisible(true);
            }

            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        
        else
        {
            setVisible(false);
            new Transactions(pinNumber).setVisible(true);
        }
         
     }
    
    public static void main(String args[])
    {
        new PinChange("").setVisible(true);
    }
}
