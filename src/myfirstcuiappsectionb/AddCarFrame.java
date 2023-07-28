package myfirstcuiappsectionb;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class AddCarFrame extends JFrame {
    String manifacture;
    String model;
    String color;
    String prize;
    String kmd;
    String cnd;
    
    private ArrayList<Car> cars = new ArrayList<>();
    JTextField manufacturerTextField;
    JTextField modelTextField;
    JTextField colorTextField;
    JTextField kmDrivenTextField;
    JTextField priceTextField;
    JTextField conditionTextField;
    public AddCarFrame() {
        
        setSize(450, 650);                              
        setTitle("Add a Car");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(500,120);
        setVisible(true);
        
        
        JLabel addLabel = new JLabel("ADDING A CAR");
        Font f1=new Font("Times New Roman",Font.BOLD,25);
        addLabel.setFont(f1);
        addLabel.setBounds(140, 15, 300, 50);
        add(addLabel);
        
        
        
        JLabel manufacturerLabel = new JLabel("Manufacturer:");
        manufacturerLabel.setBounds(50, 70, 100, 25);
        add(manufacturerLabel);

        manufacturerTextField = new JTextField();
        manufacturerTextField.setBounds(150, 70, 200, 25);
        add(manufacturerTextField);


        JLabel modelLabel = new JLabel("Model:");
        modelLabel.setBounds(50, 120, 100, 25);
        add(modelLabel);

       modelTextField = new JTextField();
        modelTextField.setBounds(150, 120, 200, 25);
        add(modelTextField);


        JLabel colorLabel = new JLabel("Color:");
        colorLabel.setBounds(50, 170, 150, 25);
        add(colorLabel);

         colorTextField = new JTextField();
        colorTextField.setBounds(150, 170, 200, 25);
        add(colorTextField);


        JLabel priceLabel = new JLabel("Price:");
        priceLabel.setBounds(50, 220, 100, 25);
        add(priceLabel);

       priceTextField = new JTextField();
        priceTextField.setBounds(150, 220, 200, 25);
        add(priceTextField);



        JLabel kmDrivenLabel = new JLabel("Km Driven:");
        kmDrivenLabel.setBounds(50, 270, 100, 25);
        add(kmDrivenLabel);

         kmDrivenTextField = new JTextField();
        kmDrivenTextField.setBounds(150, 270, 200, 25);
        add(kmDrivenTextField);



        JLabel conditionLabel = new JLabel("Condition:");
        conditionLabel.setBounds(50, 320, 100, 25);
        add(conditionLabel);

         conditionTextField = new JTextField();
        conditionTextField.setBounds(150, 320, 200, 25);
        add(conditionTextField);


        Font f3=new Font("Times New Roman",Font.BOLD,15);
        
        


        JButton addButton = new JButton("ADD");
        addButton.setBounds(100, 506, 230, 40);
        addButton.setFont(f3);
        addButton.setForeground(Color.WHITE);
        addButton.setBackground(new Color(201,0,22));
        add(addButton);
        
        
        addButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        JOptionPane.showMessageDialog(null, "Successfully Added");
        

        manifacture= manufacturerTextField.getText();
        color= colorTextField.getText();
        kmd=(kmDrivenTextField.getText());
        model= modelTextField.getText();
        prize= priceTextField.getText();
        cnd=conditionTextField.getText();
        

        new mainFrame(manifacture,model,color,prize,kmd,cnd);
    }
});

        

        JButton backButton = new JButton("BACK");
        backButton.setBounds(100, 550, 230, 40);
        backButton.setFont(f3);
        backButton.setForeground(Color.WHITE);
        backButton.setBackground(new Color(201,0,22));
        add(backButton);

        backButton.addActionListener(new ActionListener() {
        @Override
    public void actionPerformed(ActionEvent e) {
        
            new mainFrame(null,null,null,null,null,null);
        setVisible(false);
        dispose();
    }
    });
        
        JLabel jl=new JLabel();
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon("E:\\CarsSaleProject\\src\\icon\\adminframe.jpg"));
        label.setBounds(0, 0, 600, 607);

        this.add(label);  
        
        
    }

    public static void main(String[] args) {
        new AddCarFrame();
    }
}
