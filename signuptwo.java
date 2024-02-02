package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signuptwo extends JFrame implements ActionListener {
    String formNumber;
    JComboBox jComboBox, jComboBox1, jComboBox2,jComboBox3,jComboBox4;
    JTextField jTextField;
    JPasswordField jTextField1;
    JRadioButton r1 , r2 ,r3 ,r4;
    JRadioButton next;

    signuptwo(String formNumber)
    {
        super("APPLICATION FORM");
        this.formNumber = formNumber;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/us-bank-4.png"));
        Image image = ((Image) i1.getImage()).getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(image);
        JLabel label = new JLabel(i2);
        label.setBounds(30, 20, 100, 100);
        setLayout(null);

        add(label);


        JLabel l2 = new JLabel("Additional Details");
        l2.setBounds(300,60,600,40);
        l2.setFont(new Font("Raleway", Font.BOLD,22));
        add(l2);

        JLabel l3 = new JLabel("Religion:");
        l3.setBounds(130,180,100,30);
        l3.setFont(new Font("Raleway", Font.BOLD,18));
        add(l3);

        String religion [] = {"CHRISTIAN","ISLAM", "HINDU", "SIKH","BUDDHISM", "Others"};
        jComboBox = new JComboBox(religion);
        jComboBox.setBounds(300,180,300,30);
        jComboBox.setFont(new Font("Raleway", Font.BOLD,18));
        jComboBox.setBackground(new Color(252,208,76));
        add(jComboBox);


        JLabel l4 = new JLabel("Legal Status:");
        l4.setBounds(130,230,200,30);
        l4.setFont(new Font("Raleway", Font.BOLD,18));
        add(l4);
        String category [] = {"U.S. Citizen", "Green Card Holder", "Non-Immigrant Visa Holder", "Refugee" , "Others"};
        jComboBox1 = new JComboBox(category);
        jComboBox1.setBounds(300,230,300,30);
        jComboBox1.setFont(new Font("Raleway", Font.BOLD,18));
        jComboBox1.setBackground(new Color(252,208,76));
        add(jComboBox1);

        JLabel l5 = new JLabel("Income:");
        l5.setBounds(130,270,100,30);
        l5.setFont(new Font("Raleway", Font.BOLD,18));
        add(l5);

        String income [] = {"Less than $10000", "Between $10000 to $40000", "Between $50000 to $100000", "More than $100000 "};

        jComboBox2 = new JComboBox(income);
        jComboBox2.setBounds(300,270,300,30);
        jComboBox2.setFont(new Font("Raleway", Font.BOLD,18));
        jComboBox2.setBackground(new Color(252,208,76));
        add(jComboBox2);

        JLabel l6 = new JLabel("Education:");
        l6.setBounds(130,310,200,30);
        l6.setFont(new Font("Raleway", Font.BOLD,18));
        add(l6);

        String education [] = {"Non-Graduate", "Graduate", "Post-Graduation", "Doctorate", "Others"};

        jComboBox3 = new JComboBox(education);
        jComboBox3.setBounds(300,310,300,30);
        jComboBox3.setFont(new Font("Raleway", Font.BOLD,18));
        jComboBox3.setBackground(new Color(252,208,76));
        add(jComboBox3);

        JLabel l7 = new JLabel("Occupation:");
        l7.setBounds(130,360,200,30);
        l7.setFont(new Font("Raleway", Font.BOLD,18));
        add(l7);

        String occu [] = {"Job-Holder", "Business-Owner", "Student", "Retired", "Others"};

        jComboBox4 = new JComboBox(occu);
        jComboBox4.setBounds(300,360,300,30);
        jComboBox4.setFont(new Font("Raleway", Font.BOLD,18));
        jComboBox4.setBackground(new Color(252,208,76));
        add(jComboBox4);

        JLabel l8 = new JLabel("Mobile Number:");
        l8.setBounds(130,410,200,30);
        l8.setFont(new Font("Raleway", Font.BOLD,18));
        add(l8);

        jTextField = new JTextField();
        jTextField.setBounds(300,410,300,30);
        jTextField.setFont(new Font("Raleway", Font.BOLD,18));
        jTextField.setBackground(new Color(252,208,76));
        jTextField.setForeground(Color.BLACK);
        add(jTextField);

        JLabel l9 = new JLabel("Social Security:");
        l9.setBounds(130,460,200,30);
        l9.setFont(new Font("Raleway", Font.BOLD,18));
        add(l9);

        jTextField1 = new JPasswordField();
        jTextField1.setBounds(300,460,300,30);
        jTextField1.setFont(new Font("Raleway", Font.BOLD,18));
        jTextField1.setBackground(new Color(252,208,76));
        jTextField1.setForeground(Color.BLACK);
        add(jTextField1);

        JLabel l10 = new JLabel("Senior Citizen:");
        l10.setBounds(130,510,200,30);
        l10.setFont(new Font("Raleway", Font.BOLD,18));
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setBounds(300,510,60,30);
        r1.setFont(new Font("Raleway", Font.BOLD,14));

        r1.setBackground(Color.WHITE);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setBounds(390,510,90,30);
        r2.setFont(new Font("Raleway", Font.BOLD,14));
        r2.setBackground(Color.white);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel l11 = new JLabel("Existing Account:");
        l11.setBounds(130,560,200,30);
        l11.setFont(new Font("Raleway", Font.BOLD,18));
        add(l11);

        r3 = new JRadioButton("Yes");
        r3.setBounds(300,560,60,30);
        r3.setFont(new Font("Raleway", Font.BOLD,14));

        r3.setBackground(Color.WHITE);
        add(r3);

        r4 = new JRadioButton("No");
        r4.setBounds(390,560,90,30);
        r4.setFont(new Font("Raleway", Font.BOLD,14));
        r4.setBackground(Color.white);
        add(r4);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r3);
        buttonGroup1.add(r4);

        JLabel l12 = new JLabel("Form Number: ");
        l12.setBounds(650,20,200,15);
        l12.setFont(new Font("Raleway", Font.BOLD,18));
        add(l12);

        JLabel l13 = new JLabel(formNumber);
        l13.setBounds(650,40,90,30);
        l13.setFont(new Font("Raleway", Font.BOLD,18));
        add(l13);

        next = new JRadioButton("Next");
        next.setBounds(660,660,60,30);
        next.setFont(new Font("Raleway", Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        add(next);
        next.addActionListener(this);


        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));
        setVisible(true);
        setResizable(false);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String religion = (String) jComboBox.getSelectedItem();
        String cate = (String) jComboBox1.getSelectedItem();
        String inc = (String) jComboBox2.getSelectedItem();
        String edu = (String) jComboBox3.getSelectedItem();
        String occ = (String) jComboBox4.getSelectedItem();
        String  num = jTextField.getText();
        String ssn = jTextField1.getText();
        String scitizen = "";
        if( r1.isSelected())
        {
            scitizen = "Yes";
        }
        else
        {
            scitizen = "No";
        }
        String eacc = "";
        if(r3.isSelected())
        {
            eacc = "Yes";
        }
        else {
            eacc = "No";
        }

        try
        {
            if(jTextField.getText().equals("") || jTextField1.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Number & SOCIAL SECURITY NUMBER ARE REQUIRED");
            }
            else
            {
             con c1 = new con();
             String q = "insert into signuptwo values('" + formNumber+"', '" + religion+"', '" + cate+"','" + inc+"', '" +edu+"', '" + occ+"', '" + num+"', '" + ssn+"', '" +scitizen+"', '" +eacc+"')";
              c1.statement.executeUpdate(q);
              new signup3(formNumber);
              setVisible(false);
            }

        }
        catch (Exception k)
        {
            k.printStackTrace();
        }

    }

    public static void main(String[] args)
    {
        new signuptwo("");
    }
}
