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
import java.util.ArrayList;
import javax.swing.*;

public class ShowCarsFrame extends JFrame {
    String manifact;
    String model;
    String color;
    String price;
    String kmd;
    String cnd;
    
    
    
    public ShowCarsFrame(String man,String model,String col,String p,String km,String cnd){
        manifact=man;
        this.model=model;
        color=col;
        this.price=p;
        this.kmd=km;
        this.cnd=cnd;


        setSize(450, 650);
        setTitle("Add a Car");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(500,120);
        setVisible(true);
        
        
        
        
        JLabel addLabel = new JLabel("RECENTLY ADDED CAR");
        Font f1=new Font("Times New Roman",Font.BOLD,25);
        addLabel.setFont(f1);
        addLabel.setBounds(88, 15, 300, 50);
        add(addLabel);
        

        JLabel manufacturerLabel = new JLabel("Manufacturer:");
        manufacturerLabel.setBounds(50, 70, 100, 25);
        add(manufacturerLabel);

        JTextField manufacturerTextField = new JTextField();
        manufacturerTextField.setBounds(150, 70, 200, 25);
        add(manufacturerTextField);

        manufacturerTextField.setText(manifact);

        JLabel modelLabel = new JLabel("Model:");
        modelLabel.setBounds(50, 120, 100, 25);
        add(modelLabel);

        JTextField modelTextField = new JTextField();
        modelTextField.setBounds(150, 120, 200, 25);
        add(modelTextField);
        modelTextField.setText(model);

        JLabel colorLabel = new JLabel("Color:");
        colorLabel.setBounds(50, 170, 150, 25);
        add(colorLabel);

        JTextField colorTextField = new JTextField();
        colorTextField.setBounds(150, 170, 200, 25);
        add(colorTextField);
         colorTextField.setText(color);

        JLabel priceLabel = new JLabel("Price:");
        priceLabel.setBounds(50, 220, 100, 25);
        add(priceLabel);

        JTextField priceTextField = new JTextField();
        priceTextField.setBounds(150, 220, 200, 25);
        add(priceTextField);

         priceTextField.setText(price);

        JLabel kmDrivenLabel = new JLabel("Km Driven:");
        kmDrivenLabel.setBounds(50, 270, 100, 25);
        add(kmDrivenLabel);

        JTextField kmDrivenTextField = new JTextField();
        kmDrivenTextField.setBounds(150, 270, 200, 25);
        add(kmDrivenTextField);

        kmDrivenTextField.setText(kmd);

        JLabel conditionLabel = new JLabel("Condition:");
        conditionLabel.setBounds(50, 320, 100, 25);
        add(conditionLabel);

        JTextField conditionTextField = new JTextField();
        conditionTextField.setBounds(150, 320, 200, 25);
        add(conditionTextField);
        conditionTextField.setText(cnd);
        
        Font f3=new Font("Times New Roman",Font.BOLD,15);
        
        JButton backButton = new JButton("BACK");
        backButton.setBounds(100, 550, 230, 40);
        backButton.setFont(f3);
        backButton.setForeground(Color.WHITE);
        backButton.setBackground(new Color(201,0,22));
        add(backButton);
        
        
        JButton allButton = new JButton("SHOW ALL CARS");
        allButton.setBounds(100, 500, 230, 40);
        allButton.setFont(f3);
        allButton.setForeground(Color.WHITE);
        allButton.setBackground(new Color(201,0,22));
        add(allButton);
        
        JLabel jl=new JLabel();
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon("E:\\CarsSaleProject\\src\\icon\\adminframe.jpg"));
        label.setBounds(0, 0, 600, 607);

        this.add(label); 
        
        
        backButton.addActionListener(new ActionListener() {
        @Override
    public void actionPerformed(ActionEvent e) {
        // Switch to the main frame when the button is clicked
//        mainFrame mainFrame = new mainFrame();
//        mainFrame.setSize(950, 650);
//        mainFrame.initialize();
//        mainFrame.setTitle("CAR SALES");
//        mainFrame.setLayout(null);
//        mainFrame.setResizable(false);
//        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        mainFrame.getContentPane().setBackground(Color.LIGHT_GRAY);
//        mainFrame.setLocation(270,120);
//        mainFrame.setVisible(true);

        // Close the add car frame
            new mainFrame(null,null,null,null,null,null);
        setVisible(false);
        dispose();
    }
    });
        

    }
    }
