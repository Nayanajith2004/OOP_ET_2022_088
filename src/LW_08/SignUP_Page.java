package LW_08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUP_Page extends JFrame implements ActionListener {

    private static final int frame_width=350;
    private static final int frame_height=600;
    private static final int frame_X=100;
    private static final int frame_Y=80;

    JButton signup,signin;
    JCheckBox jCheckBox;
    JTextField jTextField2,jTextFieldSignIn1;
    JPasswordField signupPsswd,signInPsswd;
    String emailtxtSIN,emailTxtSUP,psswdTxtSUP,passwdTxtSIN;



    public SignUP_Page (){

        setTitle("Registration Form");
        setSize(frame_width,frame_height);
        setLocation(frame_X,frame_Y);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container contentpane =getContentPane();
        contentpane.setBackground(Color.white);
        contentpane.setLayout(null);


        JLabel jLabel1 =new JLabel("Sign UP");
        jLabel1.setSize(75,30);
        jLabel1.setFont(new Font("Arial",Font.BOLD,20));
        jLabel1.setLocation(125,10);
        jLabel1.setForeground(Color.blue);
        contentpane.add(jLabel1);

        JLabel jLabel2 =new JLabel("Name");
        jLabel2.setSize(50,30);
        jLabel2.setFont(new Font("Arial",Font.BOLD,15));
        jLabel2.setLocation(20,55);
        contentpane.add(jLabel2);

        JTextField jTextField1 =new JTextField();
        jTextField1.setSize(200,30);
        jTextField1.setFont(new Font("Arial",Font.PLAIN,20));
        jTextField1.setLocation(100,55);
        contentpane.add(jTextField1);

        JLabel jLabel3 =new JLabel("Email");
        jLabel3.setSize(50,30);
        jLabel3.setFont(new Font("Arial",Font.BOLD,15));
        jLabel3.setLocation(20,100);
        contentpane.add(jLabel3);

        jTextField2 =new JTextField();
        jTextField2.setSize(200,30);
        jTextField2.setFont(new Font("Arial",Font.PLAIN,20));
        jTextField2.setLocation(100,100);
        contentpane.add(jTextField2);

        JLabel jLabel4 =new JLabel("Gender");
        jLabel4.setSize(75,30);
        jLabel4.setFont(new Font("Arial",Font.BOLD,15));
        jLabel4.setLocation(20,145);
        contentpane.add(jLabel4);

        JRadioButton male =new JRadioButton("Male");
        male.setSize(75,30);
        male.setFont(new Font("Arial",Font.BOLD,15));
        male.setLocation(100,145);
        contentpane.add(male);

        JRadioButton female =new JRadioButton("Female");
        female.setSize(100,30);
        female.setFont(new Font("Arial",Font.BOLD,15));
        female.setLocation(200,145);
        contentpane.add(female);

        ButtonGroup gender =new ButtonGroup();
        gender.add((male));
        gender.add((female));

        JLabel jLabel5 =new JLabel("Birthday");
        jLabel5.setSize(75,30);
        jLabel5.setFont(new Font("Arial",Font.BOLD,15));
        jLabel5.setLocation(20,190);
        contentpane.add(jLabel5);

        final String[] dates = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        final String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        final String[] years = {"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010"};

        JComboBox day =new JComboBox(dates);
        day.setSize(50,30);
        day.setFont(new Font("Arial",Font.PLAIN,15));
        day.setLocation(100,190);
        contentpane.add(day);

        JComboBox month =new JComboBox(months);
        month.setSize(75,30);
        month.setFont(new Font("Arial",Font.PLAIN,15));
        month.setLocation(150,190);
        contentpane.add(month);

        JComboBox year =new JComboBox(years);
        year.setSize(100,30);
        year.setFont(new Font("Arial",Font.PLAIN,15));
        year.setLocation(225,190);
        contentpane.add(year);

        JLabel jLabel6 =new JLabel("Password");
        jLabel6.setSize(75,30);
        jLabel6.setFont(new Font("Arial",Font.BOLD,15));
        jLabel6.setLocation(20,235);
        contentpane.add(jLabel6);

        signupPsswd =new JPasswordField();
        signupPsswd.setFont(new Font("Arial",Font.PLAIN,15));
        signupPsswd.setSize(200,30);
        signupPsswd.setLocation(100,235);
        contentpane.add(signupPsswd);

        jCheckBox=new JCheckBox("I am not a robot");
        jCheckBox.setFont(new Font("Arial",Font.PLAIN,12));
        jCheckBox.setSize(200,30);
        jCheckBox.setLocation(20,280);
        contentpane.add(jCheckBox);

        signup =new JButton("Sign Up");
        signup.setForeground(Color.white);
        signup.setBackground(Color.blue);
        signup.setFont(new Font("arial",Font.BOLD,15));
        signup.setSize(250,30);
        signup.setLocation(50,325);
        signup.addActionListener(this);
        contentpane.add(signup);

        JLabel jLabel7 =new JLabel("Sign In");
        jLabel7.setForeground(Color.blue);
        jLabel7.setSize(75,30);
        jLabel7.setFont(new Font("Arial",Font.BOLD,20));
        jLabel7.setLocation(125,370);
        contentpane.add(jLabel7);

        JLabel jLabel8 =new JLabel("Email");
        jLabel8.setSize(75,30);
        jLabel8.setFont(new Font("Arial",Font.BOLD,15));
        jLabel8.setLocation(20,415);
        contentpane.add(jLabel8);

        jTextFieldSignIn1 =new JTextField();
        jTextFieldSignIn1.setSize(200,30);
        jTextFieldSignIn1.setFont(new Font("Arial",Font.PLAIN,20));
        jTextFieldSignIn1.setLocation(100,415);
        contentpane.add(jTextFieldSignIn1);

        JLabel jLabel9 =new JLabel("Password");
        jLabel9.setSize(75,30);
        jLabel9.setFont(new Font("Arial",Font.BOLD,15));
        jLabel9.setLocation(20,460);
        contentpane.add(jLabel9);

        signInPsswd =new JPasswordField();
        signInPsswd.setSize(200,30);
        signInPsswd.setFont(new Font("Arial",Font.PLAIN,20));
        signInPsswd.setLocation(100,460);
        contentpane.add(signInPsswd);

        signin =new JButton("Sign In");
        signin.setForeground(Color.white);
        signin.setBackground(Color.blue);
        signin.setFont(new Font("arial",Font.BOLD,15));
        signin.setSize(250,30);
        signin.setLocation(50,510);
        signin.addActionListener(this);
        contentpane.add(signin);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==signup){
            if (jCheckBox.isSelected()){
                JOptionPane.showMessageDialog(null,"SignUP Successes,now Please Sign in");

            }else {
                JOptionPane.showMessageDialog(null,"Please confirm not a robot");

            }
        } else if (e.getSource()==signin) {
            emailTxtSUP=jTextField2.getText();
            psswdTxtSUP= new String(signupPsswd.getPassword());
            emailtxtSIN=jTextFieldSignIn1.getText();
            passwdTxtSIN= new String(signInPsswd.getPassword());
            if (emailTxtSUP.equals(emailtxtSIN) && passwdTxtSIN.equals(psswdTxtSUP)){
                JOptionPane.showMessageDialog(null,"SingIn in success");
            }else {
                JOptionPane.showMessageDialog(null,"Invalid Password or Email");
            }

        }

    }
}
