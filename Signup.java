package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1, r2, M1, M2 ,M3;
    JButton next;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L ) + 1000L;
    String first = "  " + Math.abs(first4);
    JTextField  textField, textField2 , textEmail , textMS , textadd , textState, textCity , textpin;
    JDateChooser dateChooser;

    Signup ()
     {
         super("APPLICATION FORM");

         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/us-bank-4.png"));
         Image image = ((Image) i1.getImage()).getScaledInstance(100, 100, Image.SCALE_DEFAULT);
         ImageIcon i2 = new ImageIcon(image);
         JLabel label = new JLabel(i2);
         label.setBounds(30, 10, 100, 100);
         setLayout(null);

         add(label);

         JLabel label1 = new JLabel("APPLICATION FORM NUMBER:" + first );
         label1.setBounds(200,40,600,40);
         label1.setFont(new Font("Raleway", Font.BOLD,28));
         add(label1);

//         JLabel label2 = new JLabel("Page 1" );
//         label2.setBounds(330,70,600,30);
//         label2.setFont(new Font("Raleway", Font.BOLD,22));
//         add(label2);

         JLabel label3 = new JLabel("Personal Details" );
         label3.setBounds(290,120,600,30);
         label3.setFont(new Font("Raleway", Font.BOLD,22));
         add(label3);

         JLabel label4 = new JLabel("Name: " );
         label4.setBounds(100,190,100,30);
         label4.setFont(new Font("Raleway", Font.BOLD,22));
         add(label4);

         textField = new JTextField();
         textField.setFont(new Font("Raleway", Font.BOLD,14));
         textField.setBounds(300,190,400,30);
         textField.setBackground(Color.white);
         add(textField);


         JLabel labell5 = new JLabel("Father's Name: " );
         labell5.setBounds(100,240,200,30);
         labell5.setFont(new Font("Raleway", Font.BOLD,22));
         add(labell5);

         textField2 = new JTextField();
         textField2.setFont(new Font("Raleway", Font.BOLD,14));
         textField2.setBounds(300,240,400,30);
         textField2.setBackground(Color.white);
         add(textField2);

         JLabel labell6 = new JLabel("Date Of Birth: " );
         labell6.setBounds(100,340,200,30);
         labell6.setFont(new Font("Raleway", Font.BOLD,22));
         add(labell6);

         dateChooser = new JDateChooser();
         dateChooser.setForeground(new Color(105,105,105));
         dateChooser.setBounds(300,340,400,30);
         add(dateChooser);

         JLabel labell7 = new JLabel("Gender: " );
         labell7.setBounds(100,290,200,30);
         labell7.setFont(new Font("Raleway", Font.BOLD,22));
         add(labell7);

         r1 = new JRadioButton("Male");
         r1.setBounds(300,290,60,30);
         r1.setFont(new Font("Raleway", Font.BOLD,14));

         r1.setBackground(Color.WHITE);
         add(r1);

         r2 = new JRadioButton("Female");
         r2.setBounds(450,290,90,30);
         r2.setFont(new Font("Raleway", Font.BOLD,14));
         r2.setBackground(Color.white);
         add(r2);

         ButtonGroup buttonGroup = new ButtonGroup();
         buttonGroup.add(r1);
         buttonGroup.add(r2);

         JLabel labell8 = new JLabel("Email Address: " );
         labell8.setBounds(100,390,200,30);
         labell8.setFont(new Font("Raleway", Font.BOLD,20));
         add(labell8);

         textEmail = new JTextField();
         textEmail.setFont(new Font("Raleway", Font.BOLD,14));
         textEmail.setBounds(300,390,400,30);
         textEmail.setBackground(Color.white);
         add(textEmail);

         JLabel labell9 = new JLabel("Marital Status: " );
         labell9.setBounds(100,440,200,30);
         labell9.setFont(new Font("Raleway", Font.BOLD,20));
         add(labell9);

         M1 = new JRadioButton("Married");
         M1.setBounds(300,440,100,30);
         M1.setFont(new Font("Raleway", Font.BOLD,14));

         M1.setBackground(Color.WHITE);
         add(M1);

         M2 = new JRadioButton("Single");
         M2.setBounds(450,440,100,30);
         M2.setFont(new Font("Raleway", Font.BOLD,14));

         M2.setBackground(Color.WHITE);
         add(M2);

         M3 = new JRadioButton("Other");
         M3.setBounds(600,440,100,30);
         M3.setFont(new Font("Raleway", Font.BOLD,14));

         M3.setBackground(Color.WHITE);
         add(M3);


         ButtonGroup buttonGroup1 = new ButtonGroup();
         buttonGroup1.add(M1);
         buttonGroup1.add(M2);
         buttonGroup1.add(M3);




         JLabel labell10 = new JLabel("Address: " );
         labell10.setBounds(100,490,200,30);
         labell10.setFont(new Font("Raleway", Font.BOLD,20));
         add(labell10);

         textadd = new JTextField();
         textadd.setFont(new Font("Raleway", Font.BOLD,14));
         textadd.setBounds(300,490,400,30);
         textadd.setBackground(Color.white);
         add(textadd);


         JLabel labell11 = new JLabel("City: " );
         labell11.setBounds(100,540,200,30);
         labell11.setFont(new Font("Raleway", Font.BOLD,20));
         add(labell11);

         textCity = new JTextField();
         textCity.setFont(new Font("Raleway", Font.BOLD,14));
         textCity.setBounds(300,540,400,30);
         textCity.setBackground(Color.white);
         add(textCity);

         JLabel labellpin = new JLabel("Pin Code: " );
         labellpin.setBounds(100,590,200,30);
         labellpin.setFont(new Font("Raleway", Font.BOLD,20));
         add(labellpin);

         textpin = new JTextField();
         textpin.setFont(new Font("Raleway", Font.BOLD,14));
         textpin.setBounds(300,590,400,30);
         textpin.setBackground(Color.white);
         add(textpin);

         JLabel labellState = new JLabel("State: " );
         labellState.setBounds(100,640,200,30);
         labellState.setFont(new Font("Raleway", Font.BOLD,20));
         add(labellState);

         textState = new JTextField();
         textState.setFont(new Font("Raleway", Font.BOLD,14));
         textState.setBounds(300,640,400,30);
         textState.setBackground(Color.white);
         add(textState);

         next = new JButton("Next");
         next.setFont(new Font("Raleway", Font.BOLD,14));
         next.setBounds(620,710,80,30);
         next.setBackground(Color.WHITE);
         next.addActionListener(this::actionPerformed);
         add(next);









         setLayout(null);
         setSize(850,800);
         setLocation(360, 40);
         setForeground(Color.WHITE);
         getContentPane().setBackground(new Color(173, 216, 230));
         setVisible(true);

     }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formnumber = first;
        String name = textField.getText();
        String fname = textField2.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected())
        {
            gender = "Male";
        } else if (r2.isSelected())
        {
            gender = "Female";

        }
        String email = textEmail.getText();
        String marital = null;

        if(M1.isSelected())
        {
            marital= "Married";
        } else if (M2.isSelected())
        {
            marital = "Single";

        } else if (M3.isSelected()) {
            marital = "Others";

        }
        String address = textadd.getText();
        String city = textCity.getText();
        String pincode = textpin.getText();
        String state = textState.getText();

        try{
            if(textField.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Name Is Required");

            }
            else
            {
                con con1 = new con();
                String q = "insert into signup values('" + formnumber+"', '" + name+"', '" + fname+"','" + dob+"', '" + gender+"', '" + email+"', '" + marital+"', '" + address+"', '" +city+"', '" +pincode+"', '" + state+"' )";
                con1.statement.executeUpdate(q);
                new signuptwo(formnumber);
                setVisible(false);
            }

        }
        catch (Exception g)
        {
            g.printStackTrace();
        }




    }

    public static void main(String[] args) {
         Signup signup = new Signup();

    }
}
