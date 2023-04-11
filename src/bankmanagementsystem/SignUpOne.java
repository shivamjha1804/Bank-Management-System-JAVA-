package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignUpOne extends JFrame implements ActionListener
{
    long randomNo;
    
    JTextField nameTextField;
    JTextField fatherNameTextField;
    JTextField emailAddressTextField;
    JTextField addressTextField;
    JTextField cityTextField;
    JTextField stateTextField;
    JTextField pinCodeTextField;
    
    JDateChooser dateOfBirthDateChooser;
    
    JRadioButton genderMaleRadioButton;
    JRadioButton genderFemaleRadioButton;
    JRadioButton genderTransgenderRadioButton;
    JRadioButton genderOthersRadioButton;
    JRadioButton maritalStatusSingleRadioButton;
    JRadioButton maritalStatusMarriedRadioButton;
    JRadioButton maritalStatusOthersRadioButton;
   
    JButton next;
    
    SignUpOne()
    {
        setLayout(null);
        
        Random random = new Random();
        randomNo = Math.abs((random.nextLong() % 9000L) + 1000L);
        JLabel formNo = new JLabel("Application Form No. " + randomNo);
        formNo.setFont(new Font("Raleway", Font.BOLD, 38));
        formNo.setBounds(140, 20, 600, 40);
        add(formNo);
        
        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);
        
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);
        
        JLabel fatherName = new JLabel("Father's Name:");
        fatherName.setFont(new Font("Raleway", Font.BOLD, 20));
        fatherName.setBounds(100, 190, 200, 30);
        add(fatherName);
        
        fatherNameTextField = new JTextField();
        fatherNameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fatherNameTextField.setBounds(300, 190, 400, 30);
        add(fatherNameTextField);
        
        JLabel dateOfBirth = new JLabel("Date Of Birth:");
        dateOfBirth.setFont(new Font("Raleway", Font.BOLD, 20));
        dateOfBirth.setBounds(100, 240, 200, 30);
        add(dateOfBirth);
        
        dateOfBirthDateChooser = new JDateChooser();
        dateOfBirthDateChooser.setBounds(300, 240, 400, 30);
        dateOfBirthDateChooser.setForeground(Color.BLACK);
        add(dateOfBirthDateChooser);
        
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        
        genderMaleRadioButton = new JRadioButton("Male");
        genderFemaleRadioButton = new JRadioButton("Female");
        genderTransgenderRadioButton = new JRadioButton("Transgender");
        genderOthersRadioButton = new JRadioButton("Others");
        genderMaleRadioButton.setBounds(300, 290, 80, 30);
        genderFemaleRadioButton.setBounds(400, 290, 80, 30);
        genderTransgenderRadioButton.setBounds(500, 290, 120, 30);
        genderOthersRadioButton.setBounds(620, 290, 100, 30);
        genderMaleRadioButton.setBackground(Color.WHITE);
        genderFemaleRadioButton.setBackground(Color.WHITE);
        genderTransgenderRadioButton.setBackground(Color.WHITE);
        genderOthersRadioButton.setBackground(Color.WHITE);
        add(genderMaleRadioButton);
        add(genderFemaleRadioButton);
        add(genderTransgenderRadioButton);
        add(genderOthersRadioButton);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(genderMaleRadioButton);
        genderGroup.add(genderFemaleRadioButton);
        genderGroup.add(genderTransgenderRadioButton);
        genderGroup.add(genderOthersRadioButton);
        
        JLabel emailAddress = new JLabel("Email Address");
        emailAddress.setFont(new Font("Raleway", Font.BOLD, 20));
        emailAddress.setBounds(100, 340, 200, 30);
        add(emailAddress);
        
        emailAddressTextField = new JTextField();
        emailAddressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailAddressTextField.setBounds(300, 340, 400, 30);
        add(emailAddressTextField);
        
        JLabel maritalStatus = new JLabel("Marital Status:");
        maritalStatus.setFont(new Font("Raleway", Font.BOLD, 20));
        maritalStatus.setBounds(100, 390, 200, 30);
        add(maritalStatus);
        
        maritalStatusSingleRadioButton = new JRadioButton("Single");
        maritalStatusMarriedRadioButton = new JRadioButton("Married");
        maritalStatusOthersRadioButton = new JRadioButton("Others");
        maritalStatusSingleRadioButton.setBounds(300, 390, 100, 30);
        maritalStatusMarriedRadioButton.setBounds(450, 390, 100, 30);
        maritalStatusOthersRadioButton.setBounds(630, 390, 100, 30);
        maritalStatusSingleRadioButton.setBackground(Color.WHITE);
        maritalStatusMarriedRadioButton.setBackground(Color.WHITE);
        maritalStatusOthersRadioButton.setBackground(Color.WHITE);
        add(maritalStatusSingleRadioButton);
        add(maritalStatusMarriedRadioButton);
        add(maritalStatusOthersRadioButton);
        ButtonGroup maritalStatusGroup = new ButtonGroup();
        maritalStatusGroup.add(maritalStatusSingleRadioButton);
        maritalStatusGroup.add(maritalStatusMarriedRadioButton);
        maritalStatusGroup.add(maritalStatusOthersRadioButton);
        
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);
        
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField.setBounds(300, 490, 400, 30);
        add(cityTextField);
        
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTextField.setBounds(300, 540, 400, 30);
        add(stateTextField);
        
        JLabel pinCode = new JLabel("Pin Code:");
        pinCode.setFont(new Font("Raleway", Font.BOLD, 20));
        pinCode.setBounds(100, 590, 200, 30);
        add(pinCode);
        
        pinCodeTextField = new JTextField();
        pinCodeTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pinCodeTextField.setBounds(300, 590, 400, 30);
        add(pinCodeTextField);
        
        next = new JButton("next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.white);
        
        setSize(850, 800);
        setLocation(350, 10);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String formNo = "" + randomNo;
        String name = nameTextField.getText();
        String fatherName = fatherNameTextField.getText();
        String dateOfBirth = ((JTextField)dateOfBirthDateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        
        if(genderMaleRadioButton.isSelected())
        {
            gender = "Male";
        }
        
        else if(genderFemaleRadioButton.isSelected())
        {
            gender = "Female";
        }
        
        else if(genderTransgenderRadioButton.isSelected())
        {
            gender = "Transgender";
        }
        
        else if(genderOthersRadioButton.isSelected())
        {
            gender = "Others";
        }
        
        
        String email = emailAddressTextField.getText();
        String marital = null;
        
        if(maritalStatusSingleRadioButton.isSelected())
        {
            marital = "Single";
        }
        
        else if(maritalStatusMarriedRadioButton.isSelected())
        {
            marital = "Married";
        }
        
        else if(maritalStatusOthersRadioButton.isSelected())
        {
            marital = "Others";
        }
        
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pinCodeTextField.getText();
        
        try
        {
            if(formNo.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Form No Is Required");
            }
            
            else if(name.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Name Is Required");
            }
            
            else if(fatherName.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Father's Name Is Required");
            }
            
            else if(dateOfBirth.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Date Of Birth Is Required");
            }
            
            else if(gender.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Gender Is Required");
            }
            
            else if(email.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Email Is Required");
            }
            
            else if(marital.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Marital Status Is Required");
            }
            
            else if(address.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Address Is Required");
            }
            
            else if(city.equals(""))
            {
                JOptionPane.showMessageDialog(null, "City Is Required");
            }
            
            else if(state.equals(""))
            {
                JOptionPane.showMessageDialog(null, "State Is Required");
            }
         
            else if(pin.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Pin Code Is Required");
            }
            
            else
            {
                Conn c = new Conn();
                String query = "insert into signupone values('"+formNo+"', '"+name+"', + '"+fatherName+"', + '"+dateOfBirth+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+state+"', '"+pin+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignUpTwo(formNo).setVisible(true);
            }
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public static void main(String args[])
    {
        new SignUpOne();
    }
}
