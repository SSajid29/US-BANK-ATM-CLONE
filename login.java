package  bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener {
    JLabel jLabel, jLabel2, jlabel3;
    JTextField textField1;
    JPasswordField passwordField2;
    JButton button1, button2, button3;

    login() {
        super("Bank Management Syestem");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/us-bank-4.png"));
        Image image = ((Image) i1.getImage()).getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(image);
        JLabel label = new JLabel(i2);
        label.setBounds(350, 10, 100, 100);
        setLayout(null);

        add(label);



        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image image1 = ((Image) ii1.getImage()).getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon ii2 = new ImageIcon(image1);
        JLabel label1 = new JLabel(ii2);
        label1.setBounds(670, 320, 100, 100);

        add(label1);

        jLabel = new JLabel("WELCOME TO US BANK ATM");
        jLabel.setForeground(Color.WHITE);
        jLabel.setFont(new Font("AvantGrade", Font.BOLD, 26));
        jLabel.setBounds(230, 125, 450, 40);
        add(jLabel);

        jLabel2 = new JLabel("CARD NUMBER: ");
        jLabel2.setFont(new Font("Ralway", Font.BOLD, 22));
        jLabel2.setForeground(Color.white);
        jLabel2.setBounds(150, 190, 375, 30);
        add(jLabel2);

        textField1 = new JTextField(15);
        textField1.setBounds(330, 190, 230, 30);
        textField1.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField1);


        jlabel3 = new JLabel("PIN: ");
        jlabel3.setFont(new Font("Ralway", Font.BOLD, 22));
        jlabel3.setForeground(Color.white);
        jlabel3.setBounds(150, 250, 375, 30);
        add(jlabel3);

        passwordField2 = new JPasswordField(15);
        passwordField2.setBounds(330, 250, 230, 30);
        passwordField2.setFont(new Font("Arial", Font.BOLD, 14));
        add(passwordField2);

        button1 = new JButton("SIGN IN");
        button1.setFont((new Font("Arial", Font.BOLD, 14)));
        button1.setForeground(Color.white);
        button1.setBackground(Color.BLACK);
        button1.setBounds(330, 300, 100, 30);
        button1.addActionListener(this::actionPerformed);
        add(button1);


        button2 = new JButton("CLEAR");
        button2.setFont((new Font("Arial", Font.BOLD, 14)));
        button2.setForeground(Color.white);
        button2.setBackground(Color.BLACK);
        button2.setBounds(470, 300, 100, 30);
        button2.addActionListener(this::actionPerformed);
        add(button2);


        button3 = new JButton("SIGN UP");
        button3.setFont((new Font("Arial", Font.BOLD, 14)));
        button3.setForeground(Color.white);
        button3.setBackground(Color.BLACK);
        button3.setBounds(330, 350, 230, 30);
        button3.addActionListener(this::actionPerformed);
        add(button3);

        ImageIcon ii4 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image image2 = ((Image) ii4.getImage()).getScaledInstance(850, 450, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(image2);
        JLabel label2 = new JLabel(ii3);
        label2.setBounds(0, 0, 850, 450);


        add(label2);


        setSize(850, 450);
        setLocation(450, 200); // From where in window it will open
        setUndecorated(true);
        setVisible(true);
        setResizable(false);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == button1)
            {
                con c = new con();
                String cardnumber = textField1.getText();
                String pin = passwordField2.getText();
                String q = "select * from login where card_number = '"+cardnumber+"' and  pin = '"+pin+"'";

                ResultSet resultSet = c.statement.executeQuery(q);

                if(resultSet.next()) {
                    System.out.println("Login successful.");
                    setVisible(false);
                    new main_Class(pin);
                } else {
                   JOptionPane.showMessageDialog(null,"INVALID CARD NUMBER OR PIN"  );
                }



            } else if (e.getSource() == button2) {

                textField1.setText("");
                passwordField2.setText("");

            } else if (e.getSource() == button3)
            {
             new Signup();
             setVisible(false);

            }
        }
        catch(
    Exception f )

    {
        f.printStackTrace();
    }

}

    public static void main(String[] args) {
        login login = new login();

    }
}
