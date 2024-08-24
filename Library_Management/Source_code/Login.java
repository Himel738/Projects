package com.mycompany.librarymanagementsystem;

import javax.swing.*;
import java.awt.*;

class Login extends JFrame {
    
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel statusLabel;
    private LoginListener loginListener;
    
    
    public Login() {
        
        Student [] objects = new Student[]{
        new Student("B210101017","12345"),
        new Student("B210101030","12345"),
        new Student("B210101004","12345"),
        new Student("B210101003","12345"),
        new Student("B210101002","12345")
        };
        
       
        setTitle("Login");
        setSize(500, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));
        
        usernameField = new JTextField(15);
        passwordField = new JPasswordField(15);
        loginButton = new JButton("Login");
        statusLabel = new JLabel();
        
        panel.add(new JLabel("Username:"));
        panel.add(usernameField);
        panel.add(new JLabel("Password:"));
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(statusLabel);
        
        add(panel);
        
        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            Boolean l =null;
             for(int i=0;i<5;i++)
            {
              l=objects[i].cheack(username,password);
              if(l==true) break;
             }
            if (l==true)
            {
                statusLabel.setText("Login successful");
                if (loginListener != null)
                {
                    loginListener.onLoginSuccess();
                }
            } else
            {
                statusLabel.setText("Invalid username or password");
            }
        });
    }
    
    public void setLoginListener(LoginListener listener) {
        this.loginListener = listener;
    }
}

interface LoginListener {
    void onLoginSuccess();
}

class Student{
    String UniqueID; 
    String password;
    Student(String UniqueID)
    {
        this.UniqueID=UniqueID;
    }
    Student(String UniqueID,String password)
    {
        this.UniqueID=UniqueID;
        this.password=password;
    }
    Boolean cheack(String UniqueID,String password)
    {
        if(this.UniqueID.equals(UniqueID) && this.password.equals(password) ) return true;
        return false;
    }
    Boolean cheack(String UniqueID)
    {
        if(this.UniqueID.equals(UniqueID) ) return true;
        return false;
    }
}
