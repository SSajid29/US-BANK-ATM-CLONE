package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class withdrawl extends JFrame implements ActionListener
{

    JButton b1,b2;
    TextField textField;
    String pin;
    withdrawl(String pin)
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


        JLabel label1 = new JLabel("MAXIMUM WITHDRAWAL IS $10000");
        label1.setBounds(440,180,700,35);
        label1.setFont(new Font("System", Font.BOLD,16));
        label1.setForeground(Color.WHITE);
        label.add(label1);

        JLabel label2 = new JLabel("PLEASE ENTER YOUR AMOUNT");
        label2.setBounds(440,220,700,35);
        label2.setFont(new Font("System", Font.BOLD,16));
        label2.setForeground(Color.WHITE);
        label.add(label2);

        textField = new TextField();
        textField.setBounds(440,260,380,25);
        textField.setFont(new Font("System", Font.BOLD,22));
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.WHITE);
        label.add(textField);

        b1 = new JButton("WITHDRAWAL");
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
        if (e.getSource() == b1) {
            try {
                String amount = textField.getText();
                Date date = new Date();
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Enter The amount You Want To WITHDRAW ");
                } else {
                    con c = new con();
                    ResultSet resultSet = c.statement.executeQuery("Select * from bank where pin_no = '" + pin + "'");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    }
                    else {
                        c.statement.executeUpdate("insert into bank values('" + pin + "', '" + date + "', 'Withdrawl', '" + amount + "')");
                        JOptionPane.showMessageDialog(null, "$" + amount + " Debited Successfully");
                        setVisible(false);
                        new main_Class(pin);
                    }
                }

            } catch (Exception k) {
                k.printStackTrace();
            }
        }
        else
    {
        setVisible(false);
        new main_Class(pin);

    }
    }

    public static void main(String[] args)
    {
     new withdrawl("");
    }

}
