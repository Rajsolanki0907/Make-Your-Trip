import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

public class AddCustomer extends JFrame implements ActionListener {
    JLabel labelusername, labelname;

    Choice id;
    JTextField tfnumber, tfcountry, tfaddress, tfemail, tfphone;
    JRadioButton rmale, rfemale;
    JButton add, back;

    static String username;

    AddCustomer(String username) {

        setBounds(400, 150, 850, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setTitle("MAKE YOUR TRIP");

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30, 50, 150, 25);
        add(lblusername);

        labelusername = new JLabel();
        labelusername.setBounds(220, 50, 150, 25);
        add(labelusername);

        JLabel lblid = new JLabel("Id");
        lblid.setBounds(30, 90, 150, 25);
        add(lblid);

        id = new Choice();
        id.add("Passport");
        id.add("Adhar Card");
        id.add("Pan Card");
        id.add("Voter Id");
        id.add("Driving License");
        id.setBounds(220, 90, 150, 25);
        id.setBackground(Color.WHITE);
        add(id);

        JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(30, 130, 150, 25);
        add(lblnumber);

        tfnumber = new JTextField();
        tfnumber.setBounds(220, 130, 150, 25);
        add(tfnumber);

        JLabel lblname = new JLabel("Name");
        lblname.setBounds(30, 170, 150, 25);
        add(lblname);

        labelname = new JLabel();
        labelname.setBounds(220, 170, 150, 25);
        add(labelname);

        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(30, 210, 150, 25);
        add(lblgender);

        rmale = new JRadioButton("Male");
        rmale.setBounds(220, 210, 70, 25);
        rmale.setBackground(Color.WHITE);
        add(rmale);

        rfemale = new JRadioButton("Female");
        rfemale.setBounds(300, 210, 70, 25);
        rfemale.setBackground(Color.WHITE);
        add(rfemale);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rmale);
        bg.add(rfemale);

        JLabel lblcountry = new JLabel("Country");
        lblcountry.setBounds(30, 250, 150, 25);
        add(lblcountry);

        tfcountry = new JTextField();
        tfcountry.setBounds(220, 250, 150, 25);
        add(tfcountry);

        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(30, 290, 150, 25);
        add(lbladdress);

        tfaddress = new JTextField();
        tfaddress.setBounds(220, 290, 150, 25);
        add(tfaddress);

        JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(30, 330, 150, 25);
        add(lblemail);

        tfemail = new JTextField();
        tfemail.setBounds(220, 330, 150, 25);
        add(tfemail);

        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(30, 370, 150, 25);
        add(lblphone);

        tfphone = new JTextField();
        tfphone.setBounds(220, 370, 150, 25);
        add(tfphone);

        add = new JButton("Add");
        add.setBounds(70, 430, 100, 25);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);

        back = new JButton("Back");
        back.setBounds(220, 430, 100, 25);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Project icons/addcustomerpic.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400, 40, 450, 420);
        add(image);

        try {
            // Conn c = new Conn();
            // c.s.executeQuery("select * from account where username");

            Conn c = new Conn();
            // ResultSet rs = c.s.executeQuery("select * from account Where username
            // ='"+lblusername.getText()+"'AND name = '"+labelname.getText()+"'");
            ResultSet rs = c.s.executeQuery("select * from account Where username ='" + username + "'");
            // String query ="select * from acount Where username ='"+username+"'";
            // Conn c = new Conn();
            // ResultSet rs = c.s.executeQuery(query);

            while (rs.next()) {
                labelusername.setText(rs.getString("username"));
                labelname.setText(rs.getString("name"));

            }
        } catch (Exception e) {
            e.printStackTrace();

        }

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            String username = labelusername.getText();
            String myid = id.getSelectedItem();
            String number = tfnumber.getText();
            String name = labelname.getText();
            String gender = null;
            if (rmale.isSelected()) {
                gender = "Male";

            } else {
                gender = "Female";

            }
            String country = tfcountry.getText();
            String address = tfaddress.getText();
            String email = tfemail.getText();
            String phone = tfphone.getText();
            try {
                Conn c = new Conn();
                String query = "insert into customer values('" + username + "','" + myid + "','" + number + "','" + name
                        + "','" + gender + "','" + country + "','" + address + "','" + email + "','" + phone + "')";
                c.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Customer Details added successfully");
                setVisible(false);

            } catch (Exception e) {
                e.getStackTrace();
            }

        } else {
            setVisible(false);

        }
    }

    public static void main(String[] args) {
        new AddCustomer("" + username);

    }
}
