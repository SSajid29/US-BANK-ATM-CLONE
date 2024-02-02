package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class fastCash extends JFrame implements ActionListener {
    String pin;
    JButton b1, b2, b3, b4, b5, b6 , b7;
    fastCash(String pin)
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

        JLabel label1 = new JLabel("PLEASE SELECT WITHDRAWL AMOUNT");
        label1.setBounds(430,180,400,35);
        label1.setFont(new Font("System", Font.BOLD,20));
        label1.setForeground(Color.WHITE);
        label.add(label1);

        b1 = new JButton("$100");
        b1.setBounds(410,274,150,35);
//        b1.setFont(new Font("System", Font.BOLD,20));
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(65,125,128));
        b1.addActionListener(this);
        label.add(b1);

        b2 = new JButton("$500");
        b2.setBounds(700,274,150,35);
//        b2.setFont(new Font("System", Font.BOLD,20));
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(65,125,128));
        b2.addActionListener(this);
        label.add(b2);

        b3 = new JButton("$1000");
        b3.setBounds(700,318,150,35);
//        b2.setFont(new Font("System", Font.BOLD,20));
        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(65,125,128));
        b3.addActionListener(this);
        label.add(b3);

        b4 = new JButton("$2000");
        b4.setBounds(410,318,150,35);
//        b2.setFont(new Font("System", Font.BOLD,20));
        b4.setForeground(Color.WHITE);
        b4.setBackground(new Color(65,125,128));
        b4.addActionListener(this);
        label.add(b4);

        b5 = new JButton("$5000");
        b5.setBounds(410,362,150,35);
//        b2.setFont(new Font("System", Font.BOLD,20));
        b5.setForeground(Color.WHITE);
        b5.setBackground(new Color(65,125,128));
        b5.addActionListener(this);
        label.add(b5);

        b6 = new JButton("$10000");
        b6.setBounds(700,362,150,35);
//        b2.setFont(new Font("System", Font.BOLD,20));
        b6.setForeground(Color.WHITE);
        b6.setBackground(new Color(65,125,128));
        b6.addActionListener(this);
        label.add(b6);

        b7 = new JButton("BACK");
        b7.setBounds(700,412,150,35);
//        b2.setFont(new Font("System", Font.BOLD,20));
        b7.setForeground(Color.WHITE);
        b7.setBackground(new Color(65,125,128));
        b7.addActionListener(this);
        label.add(b7);



        setSize(1550, 1080);
        setLocation(0,0);
        setResizable(false);
        setVisible(true);
        setLayout(null);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == b7)
        {
            setVisible(false);
            new main_Class(pin);

        }
        else
        {
            String amount = ((JButton)e.getSource()).getText().substring(1);
            con c = new con();
            Date date = new Date();
            try
            {
                ResultSet resultSet = c.statement.executeQuery("select * from bank where pin_no = '"+pin+"'");
                int balance = 0;
                while (resultSet.next()) {
                    if (resultSet.getString("type").equals("Deposit")) {
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    } else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }

                }String num = "17";

                     if (e.getSource() != b7 && balance < Integer.parseInt(amount)) {
                         JOptionPane.showMessageDialog(null, "Insufficient Balance");
                         return;
                     }

                     else {
                         c.statement.executeUpdate("insert into bank values('" + pin + "', '" + date + "', 'Withdrawl', '" + amount + "')");
                         JOptionPane.showMessageDialog(null, "$" + amount + " Debited Successfully");
                         setVisible(false);
                         new main_Class(pin);
                     }






            }
            catch (Exception f)
            {
                f.printStackTrace();
            }
            setVisible(false);
            new main_Class(pin);
        }

    }

    public static void main(String[] args) {
        new  fastCash("");
    }
}
