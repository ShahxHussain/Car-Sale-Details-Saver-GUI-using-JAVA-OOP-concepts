package myfirstcuiappsectionb;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.SwingConstants;


public class mainFrame extends JFrame
{


    
    JLabel ob=new JLabel(); 
    JLabel ob1=new JLabel();
    JLabel ob2=new JLabel();
    JLabel ob3=new JLabel();
    JLabel ob4=new JLabel();
 
    JTextArea txtDes = new JTextArea();
    
    JButton admin =new JButton("ADMIN");
    JButton addacar =new JButton("ADD A CAR");
    JButton show =new JButton("SHOW ALL AVAILABLE CARS");
    JButton search =new JButton("SEARCH");
    JButton sopadt =new JButton("SEARCH ON PRICE RANGE");
   
    Font f=new Font("Times New Roman",Font.BOLD,43);
    Font f1=new Font("Times New Roman",Font.BOLD,25);
    Font f2=new Font("Times New Roman",Font.BOLD,15);
    Font f3=new Font("Times New Roman",Font.BOLD,15);
    Font f4=new Font("Times New Roman",Font.BOLD,15);

    //information of Adding
    String manifact;
    String model;
    String color;
    String price;
    String kmd;
    String cnd;
    public mainFrame(String man,String model,String col,String p,String km,String cnd) {
        manifact=man;
        this.model=model;
        color=col;
        this.price=p;
        this.kmd=km;
        this.cnd=cnd;

        setSize(950, 650);
               initialize();
               setTitle("CAR SALES");
               setLayout(null);
               setResizable(false);
               setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               getContentPane().setBackground(Color.LIGHT_GRAY);
               setLocation(270,120);
               setVisible(true);

        ob.setText("Hx CARS SALE POINT");
        ob.setBounds(280,20, 600, 50);
        ob.setFont(f);
        this.add(ob);
        ob.setForeground(Color.BLACK);

        ob1.setText("BUY & SELL CARS WITH US");
        ob1.setForeground(Color.BLACK);
        ob1.setBounds(10,80, 600, 50);
        ob1.setFont(f1);
        this.add(ob1);

        ob2.setText("HAMZA BADAR            FA21-BSE-055");
        ob2.setBounds(10,130, 600, 50);
        ob2.setForeground(Color.WHITE);
        ob2.setFont(f2);
        this.add(ob2);

        ob3.setText("DANIYAL NAWAZ        FA21-BSE-083");
        ob3.setBounds(10,150, 600, 50);
        ob3.setForeground(Color.WHITE);
        ob3.setFont(f3);
        this.add(ob3);

        ob4.setText("SHAH HUSSAIN            FA21-BSE-172");
        ob4.setBounds(10,170, 600, 50);
        ob4.setForeground(Color.WHITE);
        ob4.setFont(f4);
        this.add(ob4);





        this.add(admin);


        admin.setBounds(10,250, 255, 40);
        admin.setFont(f3);
        admin.setForeground(Color.BLACK);
        admin.setBackground(Color.WHITE);
        admin.setOpaque(true);

        addacar.setBounds(10,310, 255, 40);
        addacar.setForeground(Color.BLACK);
        addacar.setFont(f3);
        addacar.setBackground(Color.WHITE);
        addacar.setOpaque(true);
        this.add(addacar);

        show.setBounds(10,370, 255, 40);
        show.setForeground(Color.BLACK);
        show.setFont(f3);
        show.setBackground(Color.WHITE);
        show.setOpaque(true);
        this.add(show);

        search.setBounds(10,430, 255, 40);
        search.setForeground(Color.BLACK);
        search.setBackground(Color.WHITE);
        search.setFont(f3);
        search.setOpaque(true);
        this.add(search);

        sopadt.setBounds(10,490, 255, 40);
        sopadt.setForeground(Color.BLACK);
        sopadt.setBackground(Color.WHITE);
        sopadt.setFont(f3);
        sopadt.setOpaque(true);
        this.add( sopadt);
        
        
         JButton closeButton = new JButton("EXIT");
            closeButton.setBounds(755, 565, 150, 35);
            closeButton.setFont(f1);
            this.add(closeButton);


//       txtDes.setBounds(10, 310, 910, 250);
//       this.add(txtDes);

        ImageIcon i1=new ImageIcon("E:\\CarsSaleProject\\src\\icon\\car.png");
        Image i2=i1.getImage().getScaledInstance(400, 320,Image.SCALE_SMOOTH);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(500,5,500,300);
        add(image);

        JLabel jl=new JLabel();
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon("E:\\CarsSaleProject\\src\\icon\\back1.jpg"));
        label.setBounds(0, 0, 45000, 650);

        this.add(label);

        admin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Switch to the AddCarFrame when the button is clicked
                AdminsFrame af = new AdminsFrame();
                af.setVisible(true);

                // Close the main frame
                setVisible(false);
                dispose();
            }
        });


        addacar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Switch to the AddCarFrame when the button is clicked
//                AddCarFrame addCarFrame = new AddCarFrame();
//                addCarFrame.setVisible(true);
                new AddCarFrame();
                // Close the main frame
                setVisible(false);
                dispose();
            }
        });

       

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });




        enterEventHandler hand = new enterEventHandler();
        admin.addActionListener(hand);
        addacar.addActionListener(hand);
        show.addActionListener(hand);
        search.addActionListener(hand);
        sopadt.addActionListener(hand);


    }
    
   // This was the initializer function............
    public void initialize()
   {
       
       


    }
   class enterEventHandler extends JFrame implements ActionListener{
              
       @Override
       public void actionPerformed(ActionEvent e){

           
           if(e.getSource()==show){

               new ShowCarsFrame(manifact,model,color,price,kmd,cnd);
//           txtDes.setText("\n\t\t\t\t\tWELCOME TO CAR SALE SYSTEM\n\n TOTAL NO OF CARS:0"
//               + "\n\n TOTAL NO OF MANUFACTURERS:0"
//               + "\n\n CAR PRICE:0\n\n CAR MILAGE:0"
//               + "\n\n\t\t\tTHANKS FOR VISITING OUR SITE WE HOPE YOU FIND BEST CAR HERE"
//               + "\n Email:abcd123@gmail.com"
//               + "\n Contact No:03xx-xxxxxxx\n\t\t\t\t\tFEEL FREE TO ASK ANYTHING");
             }
           
           if(e.getSource()==search){
           txtDes.setText("\n\t\t\t\t\tWELCOME TO CAR SALE SYSTEM\n\n TOTAL NO OF CARS:0"
               + "\n\n TOTAL NO OF MANUFACTURERS:0"
               + "\n\n CAR PRICE:0\n\n CAR MILAGE:0"
               + "\n\n\t\t\tTHANKS FOR VISITING OUR SITE WE HOPE YOU FIND BEST CAR HERE"
               + "\n Email:abcd123@gmail.com"
               + "\n Contact No:03xx-xxxxxxx\n\t\t\t\t\tFEEL FREE TO ASK ANYTHING");
             }
           
           if(e.getSource()==show){
           txtDes.setText("\n\t\t\t\t\tWELCOME TO CAR SALE SYSTEM\n\n TOTAL NO OF CARS:0"
               + "\n\n TOTAL NO OF MANUFACTURERS:0"
               + "\n\n CAR PRICE:0\n\n CAR MILAGE:0"
               + "\n\n\t\t\tTHANKS FOR VISITING OUR SITE WE HOPE YOU FIND BEST CAR HERE"
               + "\n Email:abcd123@gmail.com"
               + "\n Contact No:03xx-xxxxxxx\n\t\t\t\t\tFEEL FREE TO ASK ANYTHING");
             }
         
                   
           if(e.getSource()==sopadt){
           txtDes.setText("\n\t\t\t\t\tWELCOME TO CAR SALE SYSTEM\n\n TOTAL NO OF CARS:0"
               + "\n\n TOTAL NO OF MANUFACTURERS:0"
               + "\n\n CAR PRICE:0\n\n CAR MILAGE:0"
               + "\n\n\t\t\tTHANKS FOR VISITING OUR SITE WE HOPE YOU FIND BEST CAR HERE"
               + "\n Email:abcd123@gmail.com"
               + "\n Contact No:03xx-xxxxxxx\n\t\t\t\t\tFEEL FREE TO ASK ANYTHING");
             }
       }
   }

    public static void main(String[] args) {
        new mainFrame(null,null,null,null,null,null);
    }
}