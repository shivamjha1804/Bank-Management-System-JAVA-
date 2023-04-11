package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class SignUpTwo extends JFrame implements ActionListener
{
 
    JTextField panNumberTextField;
    JTextField aadharNumberTextField;
    
    JComboBox religionComboBox;
    JComboBox categoryComboBox;
    JComboBox incomeComboBox;
    JComboBox educationQualificationComboBox;
    JComboBox occupationComboBox;
    
    JRadioButton yesSeniorCitizenRadioButton;
    JRadioButton noSeniorCitizenRadioButton;
    JRadioButton yesExistingAccountRadioButton;
    JRadioButton noExistingAccountRadioButton;
    
    JButton next;
    
    String formNo;
    
    SignUpTwo(String formNo)
    {
        this.formNo = formNo;
        
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE :- 2");
        
        JLabel additionalDetail = new JLabel("Page :- 2. ADDITIONAL DETAILS");
        additionalDetail.setFont(new Font("Raleway", Font.BOLD,22));
        additionalDetail.setBounds(280, 80, 500, 30);
        add(additionalDetail);
        
        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(100, 140, 200, 30);
        add(religion);
       
        String religionValues[] = {"Select", "Hindu", "Muslim", "Sikh", "Jain", "Fharsi", "Christan", "Others"};
        religionComboBox = new JComboBox(religionValues);
        religionComboBox.setBounds(300, 140, 400, 30);
        religionComboBox.setBackground(Color.WHITE);
        add(religionComboBox);
        
        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        category.setBounds(100, 190, 200, 30);
        add(category);
        
        String categoryValues[] = {"Select", "General", "OBC", "ST", "SC", "EWS", "Others"};
        categoryComboBox = new JComboBox(categoryValues);
        categoryComboBox.setBounds(300, 190, 400, 30);
        categoryComboBox.setBackground(Color.WHITE);
        add(categoryComboBox);
        
        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(100, 240, 200, 30);
        add(income);
        
        String incomeValues[] = {"Select", "Null", "< 1,00,000", "< 2,00,000", "< 3,00,000", "< 4,00,000", "> 5,00,000"};
        incomeComboBox = new JComboBox(incomeValues);
        incomeComboBox.setBounds(300, 240, 400, 30);
        incomeComboBox.setBackground(Color.WHITE);
        add(incomeComboBox);
        
        JLabel education = new JLabel("Education ");
        education.setFont(new Font("Raleway", Font.BOLD, 20));
        education.setBounds(100, 290, 200, 30);
        add(education);
        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100, 315, 200, 30);
        add(qualification);
        
        String educationQualificationValues[] = {"Select", "Non - Graduation", "Under - Graduation", "Graduation", "Post - Graduation", "Doctrate", "Others"};
        educationQualificationComboBox = new JComboBox(educationQualificationValues);
        educationQualificationComboBox.setBounds(300, 315, 400, 30);
        educationQualificationComboBox.setBackground(Color.WHITE);
        add(educationQualificationComboBox);
        
        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(100, 390, 200, 30);
        add(occupation);
        
        String occupationValues[] = {"Select", "Un - Employed", "Self - Employed", "Salaried", "Bussiness", "Student", "Others"};
        occupationComboBox = new JComboBox(occupationValues);
        occupationComboBox.setBounds(300, 390, 400, 30);
        occupationComboBox.setBackground(Color.WHITE);
        add(occupationComboBox);
        
        JLabel panNumber = new JLabel("PAN Number:");
        panNumber.setFont(new Font("Raleway", Font.BOLD, 20));
        panNumber.setBounds(100, 440, 200, 30);
        add(panNumber);
        
        panNumberTextField = new JTextField();
        panNumberTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panNumberTextField.setBounds(300, 440, 400, 30);
        add(panNumberTextField);
        
        JLabel aadharNumber = new JLabel("Aadhar Number:");
        aadharNumber.setFont(new Font("Raleway", Font.BOLD, 20));
        aadharNumber.setBounds(100, 490, 200, 30);
        add(aadharNumber);
        
        aadharNumberTextField = new JTextField();
        aadharNumberTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharNumberTextField.setBounds(300, 490, 400, 30);
        add(aadharNumberTextField);
        
        JLabel seniorCitizen = new JLabel("Senior Citizen:");
        seniorCitizen.setFont(new Font("Raleway", Font.BOLD, 20));
        seniorCitizen.setBounds(100, 540, 200, 30);
        add(seniorCitizen);
        
        yesSeniorCitizenRadioButton = new JRadioButton("YES");
        yesSeniorCitizenRadioButton.setBounds(300, 540, 100, 30);
        yesSeniorCitizenRadioButton.setBackground(Color.WHITE);
        add(yesSeniorCitizenRadioButton);
        
        noSeniorCitizenRadioButton = new JRadioButton("NO");
        noSeniorCitizenRadioButton.setBounds(450, 540, 100, 30);
        noSeniorCitizenRadioButton.setBackground(Color.WHITE);
        add(noSeniorCitizenRadioButton);
        
        ButtonGroup seniorCitizenButtonGroup = new ButtonGroup();
        seniorCitizenButtonGroup.add(yesSeniorCitizenRadioButton);
        seniorCitizenButtonGroup.add(noSeniorCitizenRadioButton);
        
        JLabel exitingAccount = new JLabel("Exiting Account:");
        exitingAccount.setFont(new Font("Raleway", Font.BOLD, 20));
        exitingAccount.setBounds(100, 590, 200, 30);
        add(exitingAccount);
        
        yesExistingAccountRadioButton = new JRadioButton("YES");
        yesExistingAccountRadioButton.setBounds(300, 590, 100, 30);
        yesExistingAccountRadioButton.setBackground(Color.WHITE);
        add(yesExistingAccountRadioButton);
        
        noExistingAccountRadioButton = new JRadioButton("NO");
        noExistingAccountRadioButton.setBounds(450, 590, 100, 30);
        noExistingAccountRadioButton.setBackground(Color.WHITE);
        add(noExistingAccountRadioButton);

        ButtonGroup existingAccountButtonGroup = new ButtonGroup();
        existingAccountButtonGroup.add(yesExistingAccountRadioButton);
        existingAccountButtonGroup.add(noExistingAccountRadioButton);
                
        next = new JButton("Next");
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
        String religion = (String) religionComboBox.getSelectedItem();
        String category = (String) categoryComboBox.getSelectedItem();
        String income = (String) incomeComboBox.getSelectedItem();
        String education = (String) educationQualificationComboBox.getSelectedItem();
        String occupation = (String) occupationComboBox.getSelectedItem();
        
        String panNumber = panNumberTextField.getText();
        String aadharNumber = aadharNumberTextField.getText();
        
        String seniorCitizen = null;
        
        if(yesSeniorCitizenRadioButton.isSelected())
        {
            seniorCitizen = "YES";
        }
        
        else if(noSeniorCitizenRadioButton.isSelected())
        {
            seniorCitizen = "NO";
        }
        
        String existingAccount = null;
        
        if(yesExistingAccountRadioButton.isSelected())
        {
            existingAccount = "YES";
        }
        
        else if(noExistingAccountRadioButton.isSelected())
        {
            existingAccount = "NO";
        }
        
        try
        {
            if(formNo.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Form Number Is Required");
            }
            
            else if(religion.equals("Select"))
            {
                JOptionPane.showMessageDialog(null,"Please Select The Requied Option In Religion");
            }
            
            else if(category.equals("Select"))
            {
                JOptionPane.showMessageDialog(null,"Please Select The Requied Option In Category");
            }
            
            else if(income.equals("Select"))
            {
                JOptionPane.showMessageDialog(null,"Please Select The Requied Option In Income");
            }
            
            else if(education.equals("Select"))
            {
                JOptionPane.showMessageDialog(null,"Please Select The Requied Option In Education");
            }
            
            else if(occupation.equals("Selected"))
            {
                JOptionPane.showMessageDialog(null,"Please Select The Requied Option In Occupation");
            }
            
            else if(panNumber.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Pan Number Is Required");
            }
            
            else if(aadharNumber.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Aadhar Number Is Required");
            }
            
            else if(seniorCitizen.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please Select The Requied Option In Senior Citizen");
            }
            
            else if(existingAccount.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please Select The Requied Option In Existing Account");
            }
            
            else
            {
                Conn c = new Conn();
                String query = "insert into signuptwo values ('"+formNo+"', '"+religion+"', '"+category+"', '"+income+"', '"+education+"', '"+occupation+"', '"+panNumber+"', '"+aadharNumber+"', '"+seniorCitizen+"', '"+existingAccount+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignUpThree(formNo).setVisible(true);
            }
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public static void main(String args[])
    {
        new SignUpTwo("");
    }
}
