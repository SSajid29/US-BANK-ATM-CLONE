package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class checkBalance extends JFrame implements ActionListener {

    JLabel label1 , label2;
    JButton b1;
    String pin;
    checkBalance(String pin)
    {
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image image = ((Image) i1.getImage()).getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
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

        label1 = new JLabel("YOUR CURRENT BALANCE IS");
        label1.setBounds(430,180,700,35);
        label1.setFont(new Font("System", Font.BOLD,16));
        label1.setForeground(Color.WHITE);
        label.add(label1);

        label2 = new JLabel("");
        label2.setBounds(430,220,700,35);
        label2.setFont(new Font("System", Font.BOLD,16));
        label2.setForeground(Color.WHITE);
        label.add(label2);

        b1 = new JButton("BACK");
        b1.setBounds(700,406,150,35);
        b1.setFont(new Font("System", Font.BOLD,16));
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        label.add(b1);

        int balance = 0;
        try {
            con c = new con();
            ResultSet resultSet = c.statement.executeQuery("Select * from bank where pin_no = '" + pin + "'");
            while (resultSet.next()) {
                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        label2.setText("$"+ balance);


        setSize(1550,1000);
        setLocation(0,0);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
       if (e.getSource() == b1)
        setVisible(false);
        new main_Class(pin);

    }

    public static void main(String[] args) {
        new checkBalance("");
    }

}
