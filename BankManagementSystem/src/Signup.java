
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Signup extends JFrame {
  static int count=1;
    
Signup(){
    // Creating a Sign up Page
    

    JLabel form = new JLabel(" Green Bank Sign Up Form No:"+ count);
    

    form.setBounds(200,50,700,40);
    form.setFont(new Font("Osward",Font.BOLD,30));
    add(form);

    // Name
    JLabel name= new JLabel("Name:");
    name.setBounds(200,160,400,40);
    name.setFont(new Font("Raleway",Font.BOLD,25));
    add(name);

    // Name Field
    JTextField namefield= new JTextField();
    namefield.setBounds(400,160,400,40);
    namefield.setFont(new Font("Raleway",Font.BOLD,25));
    add(namefield);

    //Date of Birth
    JLabel dob= new JLabel("Date of Birth:");
    dob.setBounds(200,300,400,40);
    dob.setFont(new Font("Raleway",Font.BOLD,25));
    add(dob);

    //Date of Birth Field
    JTextField dobfield= new JTextField();
    dobfield.setBounds(400,300,400,40);
    dobfield.setFont(new Font("Raleway",Font.BOLD,25));
    add(dobfield);

    //Email Address
    JLabel email= new JLabel("Email Address:");
    email.setBounds(200,440,400,40);
    email.setFont(new Font("Raleway",Font.BOLD,25));
    add(email);

    //Email Address Field
    JTextField emailfield= new JTextField();
    emailfield.setBounds(400,440,400,40);
    emailfield.setFont(new Font("Raleway",Font.BOLD,25));
    add(emailfield);

    //Home Address
    JLabel homeaddress= new JLabel("Home Address:");
    homeaddress.setBounds(200,580,400,40);
    homeaddress.setFont(new Font("Raleway",Font.BOLD,25));
    add(homeaddress);

    //Home Address Field
    JTextField homeaddressfield= new JTextField();
    homeaddressfield.setBounds(400,580,400,40);
    homeaddressfield.setFont(new Font("Raleway",Font.BOLD,25));
    add(homeaddressfield);

    //Marital Status
    JLabel maritalstatus= new JLabel("Marital Status:");
    maritalstatus.setBounds(200,720,400,40);
    maritalstatus.setFont(new Font("Raleway",Font.BOLD,25));
    add(maritalstatus);

    // Marital Status Field
    JTextField maritalstatusfield= new JTextField();
    maritalstatusfield.setBounds(400,720,400,40);
    maritalstatusfield.setFont(new Font("Raleway",Font.BOLD,25));
    add(maritalstatusfield);

    //Gender
    JLabel gender = new JLabel();
    gender.setBounds(200,860,400,40);
    gender.setFont(new Font("Raleway",Font.BOLD,25));
    add(gender);

    //Gender Field
    JTextField genderfield = new JTextField();
    genderfield.setBounds(400,860,400,40);
    genderfield.setFont(new Font("Raleway",Font.BOLD,25));
    add(genderfield);
    






    getContentPane().setBackground(Color.WHITE);
    setSize(800,1000);
    setLocation(350,10);
    setLayout(null);
    setVisible(true);
    


}
public static void main(String[] args) {
    new Signup();
    count++;
}
}


