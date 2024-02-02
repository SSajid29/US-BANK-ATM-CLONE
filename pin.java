package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pin extends JFrame implements ActionListener {
 JButton b1,b2;
 JPasswordField p1,p2;
 String pin;
    pin( String pin)
    {
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image image = ((Image) i1.getImage()).getScaledInstance(1550, 1000, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(image);
        JLabel label = new JLabel(i2);
        label.setBounds(0, 0, 1550, 830);
        setLayout(null);

        add(label);

        ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("icon/us-bank-4.png"));
        Image image2 = ((Image) i3.getImage()).getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i4 = new ImageIcon(image2);
        JLabel label3 = new JLabel(i4);
        label3.setBounds(30, 20, 100, 100);

        label.add(label3);

        JLabel label1 = new JLabel("CHANGE YOUR PIN");
        label1.setBounds(440,160,400,35);
        label1.setFont(new Font("System", Font.BOLD,17));
        label1.setForeground(Color.WHITE);
        label.add(label1);

        JLabel label2 = new JLabel("NEW PIN:");
        label2.setBounds(440,220,150,35);
        label2.setFont(new Font("System", Font.BOLD,14));
        label2.setForeground(Color.WHITE);
        label.add(label2);

        p1 = new JPasswordField();
        p1.setBounds(600,220,220,35);
        p1.setFont(new Font("System", Font.BOLD,22));
        p1.setBackground(new Color(65,125,128));
        p1.setForeground(Color.WHITE);
        label.add(p1);

        JLabel label4 = new JLabel("Re-Enter New Pin:");
        label4.setBounds(440,270,400,35);
        label4.setFont(new Font("System", Font.BOLD,14));
        label4.setForeground(Color.WHITE);
        label.add(label4);

        p2 = new JPasswordField();
        p2.setBounds(600,270,220,35);
        p2.setFont(new Font("System", Font.BOLD,22));
        p2.setBackground(new Color(65,125,128));
        p2.setForeground(Color.WHITE);
        label.add(p2);


        b1 = new JButton("CHANGE");
        b1.setBounds(700,362,150,35);
        b1.setFont(new Font("System", Font.BOLD,13));
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        label.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(700,406,150,35);
        b2.setFont(new Font("System", Font.BOLD,13));
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        label.add(b2);


        setSize(1550, 1080);
        setLocation(0,0);
        setResizable(false);
        setVisible(true);
        setLayout(null);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        try
        {
            String pin1 = p1.getText();
            String pin2 = p2.getText();

            if(!pin1.equals(pin2))
            {
                JOptionPane.showMessageDialog(null,"Entered PIN Does not match");
                return;
            }
            if (e.getSource() == b1) {
                if (p1.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Enter the New Pin");
                    return;
                }
                if (p2.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Re-Enter the New Pin");
                    return;

                }


                 else {
                    con c = new con();
                    String q1 = "update bank set pin_no = '" + pin1 + "' where pin_no = '" + pin + "'";
                    String q2 = "update login set pin = '" + pin1 + "' where pin = '" + pin + "'";
                    String q3 = "update signupthree set pin = '" + pin1 + "' where pin = '" + pin + "'";

                    c.statement.executeUpdate(q1);
                    c.statement.executeUpdate(q2);
                    c.statement.executeUpdate(q3);
                    JOptionPane.showMessageDialog(null, "PIN CHANGED SUCCESSFULLY");
                    setVisible(false);
                    new main_Class(pin);
                }

            }
            else if (e.getSource() == b2)
            {
                setVisible(false);
                new main_Class(pin);
            }
        }
        catch (Exception E)
        {
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new  pin ("");
    }
}
