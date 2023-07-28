
package myfirstcuiappsectionb;


import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class WelcomeFrame extends JFrame {

    public WelcomeFrame() {
        // Set the frame properties
        setSize(466, 640);
        setTitle("Welcome");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(500,120);
        
        
        JLabel jl=new JLabel();
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon("E:\\CarsSaleProject\\src\\icon\\welcome.png"));
        label.setBounds(0, 0, 450, 607);

        this.add(label);  

        Font f1=new Font("Times New Roman",Font.BOLD,25);
        
        JButton welcomeButton = new JButton("WELCOME",new ImageIcon("E:\\CarsSaleProject\\src\\icon\\nexticon (2).png"));
        welcomeButton.setFont(f1);
        welcomeButton.setBounds(115, 525, 240, 65);
        welcomeButton.setForeground(Color.WHITE);
        welcomeButton.setBackground(new Color(201,0,22));
        add(welcomeButton);

        
        welcomeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Switch to the main frame when the button is clicked
//                mainFrame obj = new mainFrame();
//                obj.setSize(950, 650);
//                obj.initialize();
//                obj.setTitle("CAR SALES");
//                obj.setLayout(null);
//                obj.setResizable(false);
//                obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                obj.getContentPane().setBackground(Color.LIGHT_GRAY);
//                obj.setLocation(270,120);
//                obj.setVisible(true);

                // Close the welcome frame



                setVisible(false);
                new mainFrame(null,null,null,null,null,null);
                dispose();
            }
        });
    }
}





