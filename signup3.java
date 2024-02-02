package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signup3 extends JFrame implements ActionListener {

  String formNumber;
  JRadioButton r1, r2 , r3, r4;
  JButton s,c;

  JCheckBox c1, c2,c3,c4,c5,c6;
    signup3(String formNumber)
    {
        super("");
        this.formNumber = formNumber;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/us-bank-4.png"));
        Image image = ((Image) i1.getImage()).getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(image);
        JLabel label = new JLabel(i2);
        label.setBounds(30, 20, 100, 100);
        setLayout(null);
        add(label);

        JLabel l2 = new JLabel("ACCOUNT DETAILS");
        l2.setBounds(300,60,600,40);
        l2.setFont(new Font("Raleway", Font.BOLD,22));
        add(l2);

        JLabel l3 = new JLabel("ACCOUNT TYPE: ");
        l3.setBounds(100,140,200,30);
        l3.setFont(new Font("Raleway", Font.BOLD,20));
        add(l3);

        r1 = new JRadioButton("Saving Account",true);
        r1.setBounds(100,180,160,40);
        r1.setFont(new Font("Raleway", Font.BOLD,15));
        r1.setBackground(new Color(215,252,252));
        r1.setForeground(Color.BLACK);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setBounds(350,180,300,40);
        r2.setFont(new Font("Raleway", Font.BOLD,15));
        r2.setBackground(new Color(215,252,252));
        r2.setForeground(Color.BLACK);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setBounds(350,220,250,40);
        r3.setFont(new Font("Raleway", Font.BOLD,15));
        r3.setBackground(new Color(215,252,252));
        r3.setForeground(Color.BLACK);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setBounds(100,220,250,40);
        r4.setFont(new Font("Raleway", Font.BOLD,15));
        r4.setBackground(new Color(215,252,252));
        r4.setForeground(Color.BLACK);
        add(r4);

        ButtonGroup b = new  ButtonGroup();
        b.add(r1);
        b.add(r2);
        b.add(r3);
        b.add(r4);

        JLabel l4 = new JLabel("Card Number: ");
        l4.setBounds(100,300,200,30);
        l4.setFont(new Font("Raleway", Font.BOLD,18));
        add(l4);

        JLabel l5 = new JLabel("(Your 16 digit Card Number)");
        l5.setBounds(100,330,220,20);
        l5.setFont(new Font("Raleway", Font.BOLD,12));
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX- 4841");
        l6.setBounds(300,300,250,30);
        l6.setFont(new Font("Raleway", Font.BOLD,18));
        add(l6);

        JLabel l7 = new JLabel("(It would appear on atm card/cheque Book and Statements)");
        l7.setBounds(300,330,500,20);
        l7.setFont(new Font("Raleway", Font.BOLD,12));
        add(l7);

        JLabel l8 = new JLabel("PIN:");
        l8.setFont(new Font("Raleway", Font.BOLD,18));
        l8.setBounds(100,370,200,20);
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Raleway", Font.BOLD,18));
        l9.setBounds(300,370,200,20);
        add(l9);

        JLabel l10 = new JLabel("(Your 4 digit Password)");
        l10.setFont(new Font("Raleway", Font.BOLD,12));
        l10.setBounds(100,395,200,20);
        add(l10);

        JLabel l11 = new JLabel("Services Required:");
        l11.setFont(new Font("Raleway", Font.BOLD,18));
        l11.setBounds(100,460,200,20);
        add(l11);

        c1 = new JCheckBox("ATM CARD");
        c1.setFont(new Font("Raleway", Font.BOLD,15));
        c1.setBounds(100,500,200,30);
        c1.setBackground(new Color(215,252,252));
        add(c1);
        c2 = new JCheckBox("INTERNET BANKING");
        c2.setFont(new Font("Raleway", Font.BOLD,15));
        c2.setBounds(350,500,200,30);
        c2.setBackground(new Color(215,252,252));
        add(c2);
        c3 = new JCheckBox("MOBILE BANKING");
        c3.setFont(new Font("Raleway", Font.BOLD,15));
        c3.setBounds(100,550,200,30);
        c3.setBackground(new Color(215,252,252));
        add(c3);
        c4 = new JCheckBox("EMAIL ALERTS");
        c4.setFont(new Font("Raleway", Font.BOLD,15));
        c4.setBounds(350,550,200,30);
        c4.setBackground(new Color(215,252,252));
        add(c4);
        c5 = new JCheckBox("CHEQUE BOOK");
        c5.setFont(new Font("Raleway", Font.BOLD,15));
        c5.setBounds(100,600,200,30);
        c5.setBackground(new Color(215,252,252));
        add(c5);

        c6 = new JCheckBox("E - STATEMENT");
        c6.setFont(new Font("Raleway", Font.BOLD,15));
        c6.setBounds(350,600,200,30);
        c6.setBackground(new Color(215,252,252));
        add(c6);

        JCheckBox c7 = new JCheckBox("I hereby declare that the details provided above are accurate to the best of my knowledge.", true);
        c7.setFont(new Font("Raleway", Font.BOLD,15));
        c7.setBounds(100,650,780,30);
        c7.setBackground(new Color(215,252,252));
        add(c7);

        JLabel l12 = new JLabel(formNumber);
        l12.setBounds(650,40,90,30);
        l12.setFont(new Font("Raleway", Font.BOLD,18));
        add(l12);

        JLabel l13 = new JLabel("Form Number: ");
        l13.setBounds(650,20,200,20);
        l13.setFont(new Font("Raleway", Font.BOLD,18));
        add(l13);

        s = new JButton("Submit");
        s.setFont(new Font("Raleway", Font.BOLD,15));
        s.setBounds(250,720,100,30);
        s.setBackground(Color.BLACK);
        s.setForeground(Color.WHITE);
        s.addActionListener(this);
        add(s);


        c = new JButton("Cancel");
        c.setFont(new Font("Raleway", Font.BOLD,15));
        c.setBounds(420,720,100,30);
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        c.addActionListener(this);
        add(c);







        setSize(850,800);
        setLocation(400,20);
        setLayout(null);
        setResizable(false);
        getContentPane().setBackground(new Color(215,252,252));
        setResizable(false);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    String artype = null;
    if(r1.isSelected())
    {
        artype = "Saving Account";
             }
    else if (r2.isSelected()) {
        artype = "Fixed Deposit Account";
    }
    else if (r3.isSelected())
    {
        artype = "Current Account";
    }
    else if (r4.isSelected())
    {
     artype = "Recurring Deposit Account";
    }

        Random ran = new Random();
    long first7 = (ran.nextLong() % 90000000l) + 1409963000000000l;
        String cardnumber = String.valueOf(Math.abs(first7));
    long first3 = (ran.nextLong() % 9000l) + 1000l;
        String pin = String.valueOf(Math.abs(first3));

    String fac = "";
        if(c1.isSelected())
        {
            fac = "ATM CARD";
        }
        else if (c2.isSelected())
        {
            fac = "INTERNET BANKING";
        }
        else if (c3.isSelected())
        {
          fac = "MOBILE BANKING";
        }
        else if (c4.isSelected())
        {
            fac = "EMAIL ALERTS";
        }
        else if (c5.isSelected())
        {
            fac = "CHEQUE BOOK";
        }
        else if (c6.isSelected())
        {
            fac = "E - STATEMENT";
        }

        try
        {
          if(e.getSource() == s)
          {
              if(artype.equals(""))
              {
                  JOptionPane.showMessageDialog(null, "Fill all the fields");
              }
              else
              {
                  con c1 = new con();
                  String q1 = "insert into signupthree values('" + formNumber+"', '" + artype+"', '" + cardnumber+"','" + pin+"', '" +fac+"')";
                  String q2 = "insert into login values('" + formNumber+"',  '" + cardnumber+"','" + pin+"')";
                  c1.statement.executeUpdate(q1);
                  c1.statement.executeUpdate(q2);
                  JOptionPane.showMessageDialog(null,"Card Number: " + cardnumber + "\n Pin : " + pin);
                  new deposit(pin);
                  setVisible(false);
              }
          }
          else if (e.getSource() == c)
          {
            System.exit(0);
          }
        }
        catch (Exception t)
        {
            t.printStackTrace();
        }
    }



    public static void main(String[] args) {
        new  signup3("");




    }
}
