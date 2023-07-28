/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myfirstcuiappsectionb;

/**
 *
 * @author DELL
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {
    
    Font f1=new Font("Times New Roman",Font.BOLD,25);

    public LoginFrame() {
        //Login frame properties
        setSize(510, 390);
        setTitle("Admin Login");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(500, 260);
        

        // Create the username label and text field
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(50, 50, 100, 30);
        usernameLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        usernameLabel.setForeground(Color.WHITE);
        add(usernameLabel);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(150, 50, 200, 30);
        add(usernameField);

        // Create the password label and text field
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 100, 100, 30);
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        passwordLabel.setForeground(Color.WHITE);
        add(passwordLabel);

        JTextField passwordField = new JTextField();
        passwordField.setBounds(150, 100, 200, 30);
        add(passwordField);

        // Create the login button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(350, 280, 130, 55);
        loginButton.setFont(f1);
        loginButton.setForeground(Color.WHITE);
        loginButton.setBackground(Color.DARK_GRAY);
        add(loginButton);
        
        
        JLabel jl=new JLabel();
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon("E:\\CarsSaleProject\\src\\icon\\login.jpg"));
        label.setBounds(0, 0,600,360);

        this.add(label);  

        // Add an action listener to the login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String username = usernameField.getText();
                String password = passwordField.getText();

                
                if (username.equals("hussain") && password.equals("hussain")
                        ||username.equals("danyal") && password.equals("danyal")
                        ||username.equals("hamza") && password.equals("hamza")) {
                    
                    //if password matches it will proceed to a wellcome interface
                    WelcomeFrame welcomeFrame = new WelcomeFrame();
                    welcomeFrame.setVisible(true);

                    // Close the login frame
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null,"Incorrect username or password\n             TRY AGAIN");
                   
                }
            }
        });
    }
}
