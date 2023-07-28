
package myfirstcuiappsectionb;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AdminsFrame extends JFrame {

                                                                                                                                                                                                                                                                                                                                                    
    public AdminsFrame() {
        
        
        
        JLabel ob=new JLabel(); 
        JLabel ob1=new JLabel();
        JLabel ob2=new JLabel();
        JLabel ob3=new JLabel();
        
        JLabel semail=new JLabel(); 
        JLabel demail=new JLabel(); 
        JLabel hemail=new JLabel(); 
        
        JLabel saddress=new JLabel(); 
        JLabel daddress=new JLabel(); 
        JLabel haddress=new JLabel(); 
        
        Font f=new Font("Times New Roman",Font.BOLD,40);
        Font f1=new Font("Times New Roman",Font.BOLD,25);
        Font f2=new Font("Times New Roman",Font.BOLD,15);
        Font f3=new Font("Times New Roman",Font.BOLD,15);
        
        setSize(600, 650);                              
        setTitle("Add a Car");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(500,120);
        
        
        
        
       ImageIcon i1=new ImageIcon("E:\\CarsSaleProject\\src\\icon\\hussain1.png");
       Image i2=i1.getImage().getScaledInstance(150, 150,Image.SCALE_SMOOTH);
       ImageIcon i3=new ImageIcon(i2);
       JLabel image=new JLabel(i3);
       image.setBounds(330,15,300,200);
       add(image);
       
       
       ImageIcon ii=new ImageIcon("E:\\CarsSaleProject\\src\\icon\\danyal.png");
       Image ii2=ii.getImage().getScaledInstance(150, 150,Image.SCALE_SMOOTH);
       ImageIcon ii3=new ImageIcon(ii2);
       JLabel image2=new JLabel(ii3);
       image2.setBounds(330,180,300,200);
       add(image2);
       
       ImageIcon iii=new ImageIcon("E:\\CarsSaleProject\\src\\icon\\hamza.png");
       Image iii2=iii.getImage().getScaledInstance(150, 150,Image.SCALE_SMOOTH);
       ImageIcon iii3=new ImageIcon(iii2);
       JLabel image3=new JLabel(iii3);
       image3.setBounds(335,330,300,200);
       add(image3);


        
        ob1.setText("SYED SHAH HUSSAIN");
        ob1.setBounds(10,80, 600, 50);
        ob1.setFont(f1);
        this.add(ob1);
        
       semail.setText("Shahhussain19288@gmail.com");
       semail.setBounds(10,120, 600, 50);
       semail.setFont(f2);
       this.add(semail);
       
       saddress.setText("Qasmi Katlang,\n MARDAN,\n PAKISTAN");
       saddress.setBounds(10,140, 600, 50);
       saddress.setFont(f2);
       this.add(saddress);
        
        
        ob2.setText("DANYAL NAWAZ");
        ob2.setBounds(10,240, 600, 50);
        ob2.setFont(f1);
        this.add(ob2);
        
         demail.setText("Dawan0329@gmail.com");
       demail.setBounds(10,280, 600, 50);
       demail.setFont(f2);
       this.add(demail);
       
       daddress.setText("Ganda Road,\n MANSEHRA,\n PAKISTAN");
       daddress.setBounds(10,300, 600, 50);
       daddress.setFont(f2);
       this.add(daddress);
        
        
        ob3.setText("HAMZA BADAR");
        ob3.setBounds(10,400, 600, 50);
        ob3.setFont(f1);
        this.add(ob3);
        
        hemail.setText("Badarhamza320@gmail.com");
       hemail.setBounds(10,440, 600, 50);
       hemail.setFont(f2);
       this.add(hemail);
       
       haddress.setText("Muslimabad Havelian,\n ABBOTTABAD,\n PAKISTAN");
       haddress.setBounds(10,460, 600, 50);
       haddress.setFont(f2);
       this.add(haddress);
       
       JLabel jl=new JLabel();
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon("E:\\CarsSaleProject\\src\\icon\\adminframe.jpg"));
        label.setBounds(0, 0, 600, 607);

        this.add(label);  
        
        
       JButton backButton = new JButton("BACK",new ImageIcon("E:\\CarsSaleProject\\src\\icon\\backicon.png"));
        backButton.setBounds(350, 550, 230, 40);
        backButton.setForeground(Color.WHITE);
        backButton.setBackground(new Color(201,0,22));
        add(backButton);

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
//        mainFrame.getContentPane().setBackground(ColorFloatingDecimal.parseDouble.LIGHT_GRAY);
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
