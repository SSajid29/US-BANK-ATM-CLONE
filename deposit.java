package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class deposit extends JFrame implements ActionListener {
   String pin;
   TextField textField;
   JButton b1,b2;
    deposit(String pin)
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


        JLabel label1 = new JLabel("ENTER THE AMOUNT OF MONEY YOU WANT TO DEPOSIT");
        label1.setBounds(440,180,400,35);
        label1.setFont(new Font("System", Font.BOLD,14));
        label1.setForeground(Color.WHITE);
        label.add(label1);

        textField = new TextField();
        textField.setBounds(440,230,380,25);
        textField.setFont(new Font("System", Font.BOLD,22));
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.WHITE);
        label.add(textField);

        b1 = new JButton("DEPOSIT");
        b1.setBounds(700,362,150,35);
        b1.setFont(new Font("System", Font.BOLD,16));
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        label.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(700,406,150,35);
        b2.setFont(new Font("System", Font.BOLD,16));
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        label.add(b2);








        setSize(1550,1000);
        setLocation(0,0);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String amount = textField.getText();
            Date date = new Date();
            if (e.getSource() == b1) {
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "PLEASE ENTER THE AMOUNT YOU WANT TO DEPOSIT");
                } else {
                    con c = new con();

                    c.statement.executeUpdate("insert into bank values('" + pin + "', '" + date + "', 'Deposit', '" + amount + "')");
                    JOptionPane.showMessageDialog(null, "$" + amount + " Deposited Succesfully");
                    setVisible(false);
                    new main_Class(pin);
                }
            } else if (e.getSource() == b2) {
                setVisible(false);
                new main_Class(pin);
            }
        }
        catch (Exception p)
        {
            p.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new deposit("");
    }
}
