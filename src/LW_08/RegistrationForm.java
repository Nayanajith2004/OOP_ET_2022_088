package LW_08;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class RegistrationForm extends JFrame {
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 800;
    private static final int FRAME_X_ORIGIN = 550;
    private static final int FRAME_Y_ORIGIN = 150;



    public RegistrationForm(){
        setTitle("RegistrationForm");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.WHITE);

        contentPane.setLayout(null);

        JLabel signUp =new JLabel("Sign UP");
        signUp.setFont(new Font("calibri", Font.BOLD, 25));
        signUp.setLocation(150,20);
        signUp.setSize(100,25);
        signUp.setForeground(Color.blue);
        contentPane.add(signUp);



        JLabel nameLable=new JLabel("Name");
        nameLable.setFont(new Font("calibri", Font.BOLD, 15));
        nameLable.setLocation(30,75);
        nameLable.setSize(50,20);
        nameLable.setForeground(Color.BLACK);
        contentPane.add(nameLable);

        JTextField nametext=new JTextField();
        nametext.setLocation(120,75);
        nametext.setSize(150,20);
        contentPane.add(nametext);


        JLabel email=new JLabel("Email");
        email.setFont(new Font("calibri", Font.BOLD, 15));
        email.setLocation(30,115);
        email.setSize(50,20);
        email.setForeground(Color.BLACK);
        contentPane.add(email);

        JTextField emailtext=new JTextField();
        emailtext.setLocation(120,115);
        emailtext.setSize(150,20);
        contentPane.add(emailtext);

        JLabel gender=new JLabel("Gender");
        gender.setFont(new Font("calibri", Font.BOLD, 15));
        gender.setLocation(30,155);
        gender.setSize(50,20);
        gender.setForeground(Color.BLACK);
        contentPane.add(gender);

        JRadioButton malebutton=new JRadioButton("Male");
        malebutton.setLocation(125,155);
        malebutton.setSize(75,20);
        contentPane.add(malebutton);

        JRadioButton femalebutton=new JRadioButton("FeMale");
        femalebutton.setLocation(210,155);
        femalebutton.setSize(75,20);
        contentPane.add(femalebutton);

        ButtonGroup butGender=new ButtonGroup();
        butGender.add(malebutton);
        butGender.add(femalebutton);
        malebutton.setSelected(true);

        // Days
        String[] days = new String[31];
        for (int i = 0; i < 31; i++) {
            days[i] = String.valueOf(i + 1);
        }
        JComboBox dayBox = new JComboBox (days);
        dayBox.setLocation(125,195);
        dayBox.setSize(50,20);
        contentPane.add(dayBox);

        // Months
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        JComboBox<String> monthBox = new JComboBox (months);
        monthBox.setLocation(180,195);
        monthBox.setSize(75,20);
        contentPane.add(monthBox);

        String[] years =new String[80];
        int c=0;
        for (int y = 2025; y >= 1950; y--) {
            years[c]=String.valueOf(y);
            c+=1;
        }
        //ArrayList<String> years = new ArrayList<>();
        //for (int y = 2025; y >= 1950; y--) { // Using a smaller range for brevity
         //   years.add(String.valueOf(y));
       // }
        JComboBox yearBox =new JComboBox(years);
        yearBox.setLocation(260,195);
        yearBox.setSize(75,20);
        contentPane.add(yearBox);


        JLabel birth = new JLabel("Birthday");
        birth.setFont(new Font("calibri", Font.BOLD, 15));
        birth.setLocation(30,195);
        birth.setSize(75,20);
        birth.setForeground(Color.BLACK);
        contentPane.add(birth);


        JLabel psw=new JLabel("Password");
        psw.setFont(new Font("calibri", Font.BOLD, 15));
        psw.setLocation(30,235);
        psw.setSize(75,20);
        psw.setForeground(Color.BLACK);
        contentPane.add(psw);




    }
}
