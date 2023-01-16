
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
//https://www.youtube.com/watch?v=vClv4Q2hSgo&list=PL_6klLfS1WqG8mRCW5a-bIViq1DbzQkp9&index=2
// https://github.com/kunaltyagi9/ATM-Simulator-System/blob/master/ATM-Simulator-System/src/ASimulatorSystem/Login.java
import java.lang.ref.Cleaner;
import java.util.EventListener;
import java.util.*;




public class Login extends JFrame implements ActionListener{
    JLabel welcome,cardnum,pin;
    JTextField cardnumfield;
    JButton signin,clear,signup;
    JPasswordField pinfield;


    Login(){

        setTitle("GreenBank ATM");
        setLayout(null);
      

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("Icons/Bank.png"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);

        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,20,100,100);
         add(label);


        JLabel welcome= new JLabel("WELCOME TO GREENBANK ATM");
        welcome.setBounds(200,50,700,40);
        welcome.setFont(new Font("Osward",Font.BOLD,30));
        add(welcome);


        JLabel cardnum= new JLabel("Card Number:");
        cardnum.setBounds(200,160,400,40);
        cardnum.setFont(new Font("Raleway",Font.BOLD,25));
        add(cardnum);


      JTextField cardnumfield= new JTextField();
       cardnumfield.setBounds(400,160,400,40);
        cardnumfield.setFont(new Font("Raleway",Font.BOLD,25));
        add(cardnumfield);
        

        JLabel pin= new JLabel("PIN:");
        pin.setBounds(200,300,400,40);
        pin.setFont(new Font("Raleway",Font.BOLD,25));
        add(pin);

       // getContentPane().setBackground(Color.WHITE);

      //Add the Text Field for PIN
   


        JPasswordField pinfield= new JPasswordField();
         pinfield.setBounds(400,300,400,40);
        pinfield.setFont(new Font("Raleway",Font.BOLD,25));
        pinfield.setForeground(Color.BLACK);
        add(pinfield);

      //Sign In Button
        JButton signin= new JButton("Sign In");
        signin.setBounds(400,400,150,40);
        signin.setFont(new Font("Raleway",Font.BOLD,25));
        signin.setBackground(Color.BLACK);
        signin.addActionListener(this);
        add(signin);

        //Clear Button
        JButton clear= new JButton("Clear");
        clear.setBounds(600,400,150,40);
        clear.setFont(new Font("Raleway",Font.BOLD,25));
        clear.setBackground(Color.WHITE);
        clear.setForeground(Color.BLACK);
       // clear.addActionListener(this);
        clear.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            cardnumfield.setText("");
            pinfield.setText("");
          }
        });
        add(clear);

        //Sign Up Button
        JButton signup= new JButton("Sign Up");
        signup.setBounds(400,500,350,40);
        signup.setFont(new Font("Raleway",Font.BOLD,25));
        signup.setBackground(Color.BLACK);
        signup.addActionListener(this);
        add(signup);


        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
     
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //Change to Grey Background
        getContentPane().setBackground(Color.WHITE);

      

    }



public void actionPerformed(ActionEvent ae){
if(ae.getSource()==clear){
    cardnumfield.setText("");
    pinfield.setText("");
}

}


public static void main(String args[]){
    new Login();
}

}

