package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignUpThree extends JFrame implements ActionListener
{
    JRadioButton savingAccountRadioButton;
    JRadioButton fixedDepositAccountRadioButton;
    JRadioButton currentAccountRadioButton;
    JRadioButton recurringDepositAccountRadioButton;
    
    JCheckBox atmRequiredCheckBox;
    JCheckBox mobileBankingCheckBox;
    JCheckBox internetBankingCheckBox;
    JCheckBox emailAndSmsAlertCheckBox;
    JCheckBox chequeBookCheckBox;
    JCheckBox eStatementCheckBox;
    JCheckBox declarationCheckBox;
    
    JButton submitButton;
    JButton cancelButton;
    
    String formNo;
    
    SignUpThree(String formNo) 
    {
        this.formNo = formNo; 
       
        setLayout(null);
        
        JLabel label3 = new JLabel("Page :- 3 : ACCOUNT DETAILS");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(280, 40, 400, 40);
        add(label3);
        
        JLabel accountTypeLabel = new JLabel("Account Type : ");
        accountTypeLabel.setFont(new Font("Raleway", Font.BOLD, 22));
        accountTypeLabel.setBounds(100, 140, 200, 30);
        add(accountTypeLabel);
        
        savingAccountRadioButton = new JRadioButton("Saving Account");
        savingAccountRadioButton.setFont(new Font("Raleway", Font.BOLD, 16));
        savingAccountRadioButton.setBackground(Color.WHITE);
        savingAccountRadioButton.setBounds(100, 180, 150, 20);
        add(savingAccountRadioButton);
        
        fixedDepositAccountRadioButton = new JRadioButton("Fixed Deposit Account");
        fixedDepositAccountRadioButton.setFont(new Font("Raleway", Font.BOLD, 16));
        fixedDepositAccountRadioButton.setBackground(Color.WHITE);
        fixedDepositAccountRadioButton.setBounds(350, 180, 250, 20);
        add(fixedDepositAccountRadioButton);
        
        currentAccountRadioButton = new JRadioButton("Current Account");
        currentAccountRadioButton.setFont(new Font("Raleway", Font.BOLD, 16));
        currentAccountRadioButton.setBackground(Color.WHITE);
        currentAccountRadioButton.setBounds(100, 220, 250, 20);
        add(currentAccountRadioButton);
        
        recurringDepositAccountRadioButton = new JRadioButton("Recurring Deposit Account");
        recurringDepositAccountRadioButton.setFont(new Font("Raleway", Font.BOLD, 16));
        recurringDepositAccountRadioButton.setBackground(Color.WHITE);
        recurringDepositAccountRadioButton.setBounds(350, 220, 250, 20);
        add(recurringDepositAccountRadioButton);
        
        ButtonGroup accountGroup = new ButtonGroup();
        accountGroup.add(savingAccountRadioButton);
        accountGroup.add(fixedDepositAccountRadioButton);
        accountGroup.add(currentAccountRadioButton);
        accountGroup.add(recurringDepositAccountRadioButton);
        
        JLabel cardNumberLabel = new JLabel("Card Number : ");
        cardNumberLabel.setFont(new Font("Raleway", Font.BOLD, 22));
        cardNumberLabel.setBounds(100, 300, 200, 30);
        add(cardNumberLabel);
        
        JLabel numberLabel = new JLabel("XXXX - XXXX - XXXX - 1456");
        numberLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        numberLabel.setBounds(330, 300, 300, 30);
        add(numberLabel);
        
        JLabel cardDetail = new JLabel("YOUR SIXTEEN DIGIT CARD NUMBER");
        cardDetail.setFont(new Font("Raleway", Font.BOLD, 12));
        cardDetail.setBounds(100, 330, 300, 20);
        add(cardDetail);
        
        JLabel pinLabel = new JLabel("PIN : ");
        pinLabel.setFont(new Font("Raleway", Font.BOLD, 22));
        pinLabel.setBounds(100, 370, 200, 30);
        add(pinLabel);
        
        JLabel pinNumberLabel = new JLabel("XXXX");
        pinNumberLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        pinNumberLabel.setBounds(330, 370, 300, 30);
        add(pinNumberLabel);
        
        JLabel pinDetailLabel = new JLabel("YOUR FOUR DIGIT PIN");
        pinDetailLabel.setFont(new Font("Raleway", Font.BOLD, 12));
        pinDetailLabel.setBounds(100, 400, 300, 20);
        add(pinDetailLabel);
        
        JLabel servicesRequiredLabel = new JLabel("SERVICES REQUIRED : ");
        servicesRequiredLabel.setFont(new Font("Raleway", Font.BOLD, 22));
        servicesRequiredLabel.setBounds(100, 450, 400, 30);
        add(servicesRequiredLabel);
        
        atmRequiredCheckBox = new JCheckBox("Debit Card");
        atmRequiredCheckBox.setBackground(Color.WHITE);
        atmRequiredCheckBox.setFont(new Font("Raleway", Font.BOLD, 16));
        atmRequiredCheckBox.setBounds(100, 500, 200, 30);
        add(atmRequiredCheckBox);
        
        mobileBankingCheckBox = new JCheckBox("Mobile Banking");
        mobileBankingCheckBox.setBackground(Color.WHITE);
        mobileBankingCheckBox.setFont(new Font("Raleway", Font.BOLD, 16));
        mobileBankingCheckBox.setBounds(350, 500, 200, 30);
        add(mobileBankingCheckBox);
        
        internetBankingCheckBox = new JCheckBox("Internet Banking");
        internetBankingCheckBox.setBackground(Color.WHITE);
        internetBankingCheckBox.setFont(new Font("Raleway", Font.BOLD, 16));
        internetBankingCheckBox.setBounds(100, 550, 200, 30);
        add(internetBankingCheckBox);
        
        emailAndSmsAlertCheckBox = new JCheckBox("Email & SMS Alert");
        emailAndSmsAlertCheckBox.setBackground(Color.WHITE);
        emailAndSmsAlertCheckBox.setFont(new Font("Raleway", Font.BOLD, 16));
        emailAndSmsAlertCheckBox.setBounds(350, 550, 200, 30);
        add(emailAndSmsAlertCheckBox);
        
        chequeBookCheckBox = new JCheckBox("Cheque Book");
        chequeBookCheckBox.setBackground(Color.WHITE);
        chequeBookCheckBox.setFont(new Font("Raleway", Font.BOLD, 16));
        chequeBookCheckBox.setBounds(100, 600, 200, 30);
        add(chequeBookCheckBox);
        
        eStatementCheckBox = new JCheckBox("E-Statement");
        eStatementCheckBox.setBackground(Color.WHITE);
        eStatementCheckBox.setFont(new Font("Raleway", Font.BOLD, 16));
        eStatementCheckBox.setBounds(350, 600, 200, 30);
        add(eStatementCheckBox);
        
        declarationCheckBox = new JCheckBox("I herely declares that the above entered details are correct to the best of my knowledge");
        declarationCheckBox.setBackground(Color.WHITE);
        declarationCheckBox.setFont(new Font("Raleway", Font.BOLD, 12));
        declarationCheckBox.setBounds(100, 680, 600, 30);
        add(declarationCheckBox);
        
        submitButton = new JButton("Submit");
        submitButton.setBackground(Color.BLACK);
        submitButton.setForeground(Color.WHITE);
        submitButton.setFont(new Font("Raleway", Font.BOLD, 14));
        submitButton.setBounds(220, 720, 100, 30);
        submitButton.addActionListener(this);
        add(submitButton);
        
        cancelButton = new JButton("Cancel");
        cancelButton.setBackground(Color.BLACK);
        cancelButton.setForeground(Color.WHITE);
        cancelButton.setBounds(420, 720, 100, 30);
        cancelButton.setFont(new Font("Raleway", Font.BOLD, 14));
        cancelButton.addActionListener(this);
        add(cancelButton);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850, 820);
        setLocation(350, 0);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == submitButton)
        {
            String accountType = null;
            
            if(savingAccountRadioButton.isSelected())
            {
                accountType = "Saving Account";
            }
            
            else if(fixedDepositAccountRadioButton.isSelected())
            {
                accountType = "Fixed Deposit Account";
            }
            
            else if(currentAccountRadioButton.isSelected())
            {
                accountType = "Current Account";
            }
            
            else if(recurringDepositAccountRadioButton.isSelected())
            {
                accountType = "Recurring Deposit Account";
            }
            
            Random randomNumber = new Random();
            String cardNumber = "" + Math.abs((randomNumber.nextLong() % 90000000L) + 5040936000000000L);
            
            String pinNumber = "" + Math.abs((randomNumber.nextLong() % 9000L) + 1000L);
            
            String facility = "";
            
            if(atmRequiredCheckBox.isSelected())
            {
                facility += " Debit Card";
            }
            
            if(mobileBankingCheckBox.isSelected())
            {
                facility += " Mobile Banking";
            }
            
            if(internetBankingCheckBox.isSelected())
            {
                facility += " Internet Banking";
            }
            
            if(emailAndSmsAlertCheckBox.isSelected())
            {
                facility += " Email & SMS Alert";
            }
            
            if(chequeBookCheckBox.isSelected())
            {
                facility += " Cheque Book";
            }
            
            if(eStatementCheckBox.isSelected())
            {
                facility += " E-Statement";
            }
            
            try
            {
                if(accountType.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Account Type is Required");
                }
                
                else
                {
                    Conn conn = new Conn();
                    String query1 = "insert into signupthree values('"+formNo+"', '"+accountType+"', '"+cardNumber+"', '"+pinNumber+"', '"+facility+"')";
                    String query2 = "insert into login values('"+formNo+"', '"+cardNumber+"', '"+pinNumber+"')";
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);
                    
                    
                    JOptionPane.showMessageDialog(null, "Card Number : " + cardNumber + "\n Pin Number : " + pinNumber );
                    
                    setVisible(false);
                    new Deposit(pinNumber).setVisible(false);
                }
            }
            
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        
        else if(ae.getSource() == cancelButton)
        {
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    
    public static void main(String args[])
    {
        new SignUpThree("");
    }
}
