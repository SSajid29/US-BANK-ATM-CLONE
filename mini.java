package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class mini extends JFrame implements ActionListener {
    String pin;
    JButton button;

    mini(String pin)
    {
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/us-bank-4.png"));
        Image image = ((Image) i1.getImage()).getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(image);
        JLabel label = new JLabel(i2);
        label.setBounds(20, 20, 400, 100);
        setLayout(null);

        add(label);


        JLabel label1 = new JLabel();
        label1.setBounds(20,150,400,800);
        label1.setFont(new Font("Monospaced", Font.BOLD, 13));


        add(label1);

//        JLabel label2 = new JLabel("US BANK");
//        label2.setBounds(150,20,200,15);
//        label2.setFont(new Font("System", Font.BOLD,16));
//
//        add(label2);

        JLabel label3 = new JLabel();
        label3.setBounds(20,140,300,20);
        label3.setFont(new Font("System", Font.BOLD,16));

        add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(20,1000,300,20);
        label4.setFont(new Font("System", Font.BOLD,16));

        add(label4);

        try {
            con c = new con();
            ResultSet resultSet = c.statement.executeQuery("Select * from login where pin = '" + pin + "'");
            while (resultSet.next())
            {
                label3.setText("Card Number: " + resultSet.getString("card_number").substring(0,4) + "xxxxxxxx" + resultSet.getString("card_number").substring(12));

            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        try {

            con c = new con();

            ResultSet resultSet = c.statement.executeQuery("select * from bank where pin_no = '"+pin+"'");
            int balance = 0;
            while (resultSet.next())
            {
                label1.setText(label1.getText() + "<html>" + resultSet.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + resultSet.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + "$"+resultSet.getString("amount") + "<br><br><html>");

                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }

            }



            label4.setText("Your Total Balance is $ " + balance);

        }
        catch (Exception f)
        {
            f.printStackTrace();
        }

        button = new JButton("Exit");
        button.setBounds(20,1100,100,25);
        button.setFont(new Font("System", Font.BOLD,16));

        button.addActionListener(this);
        add(button);





        setSize(600,1200);
        setLocation(20,20);
        getContentPane().setBackground(new Color(215,252,252));
        setLayout(null);



        setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }

    public static void main(String[] args)
    {
        new mini("");

    }
}
