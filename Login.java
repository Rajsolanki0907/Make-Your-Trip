
//import java.awt.Color;
//import java.awt.Font;
//import javax.swing.BorderFactory;
// import javax.swing.ImageIcon;
// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JPanel;
// import javax.swing.text.AttributeSet.ColorAttribute;
// import javax.swing.JTextField;
//import javax.swing.border.LineBorder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.border.*;

public class Login extends JFrame implements ActionListener {

    JButton login, signUp, password;
    JTextField tfusername, tfpassword;

    Login() {

        setSize(900, 400);
        setLocation(350, 200);
        setLayout(null);
        setTitle("MAKE YOUR TRIP");

        getContentPane().setBackground(Color.WHITE);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(131, 193, 233));
        // p1.setBackground(Color.gray);

        p1.setBounds(0, 0, 400, 400);
        p1.setLayout(null);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Project icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(70, 70, 250, 250);
        p1.add(image);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(400, 30, 450, 300);
        add(p2);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(60, 20, 100, 25);
        lblusername.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        p2.add(lblusername);

        tfusername = new JTextField();
        tfusername.setBounds(60, 60, 300, 30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfusername);

        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(60, 110, 100, 25);
        lblpassword.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        p2.add(lblpassword);

        tfpassword = new JTextField();
        tfpassword.setBounds(60, 150, 300, 30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfpassword);

        // for login Button....

        login = new JButton("Login");
        login.setBounds(60, 200, 130, 30);
        login.setBackground(new Color(131, 193, 233));
        login.setForeground(Color.WHITE);
        login.setBorder(new LineBorder(new Color(131, 193, 233)));
        login.addActionListener(this);

        p2.add(login);

        // for Sign in button.....
        signUp = new JButton("Sign up");
        signUp.setBounds(230, 200, 130, 30);
        signUp.setBackground(new Color(131, 193, 233));
        signUp.setForeground(Color.WHITE);
        signUp.setBorder(new LineBorder(new Color(131, 193, 233)));
        signUp.addActionListener(this);

        p2.add(signUp);

        // for forgot password button....

        password = new JButton(" Forget Password");
        password.setBounds(130, 250, 130, 30);
        password.setBackground(new Color(131, 193, 233));
        password.setForeground(Color.WHITE);
        password.setBorder(new LineBorder(new Color(131, 193, 233)));
        password.addActionListener(this);

        p2.add(password);

        JLabel text = new JLabel("Trouble in login...");
        text.setBounds(300, 250, 150, 20);
        text.setForeground(Color.red);
        p2.add(text);

        setVisible(true); // to visible the FRAME....

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login) {
            try {

                String username = tfusername.getText();
                String pass = tfpassword.getText();

                String query = "select * from account Where username = '" + username + "'AND password ='" + pass + "'";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);

                if (rs.next()) {
                    setVisible(false);
                    new Loading(username);

                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect username or password");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == signUp) {
            setVisible(false);
            new Signup();

        } else {
            setVisible(false);
            new ForgetPassword();

        }
    }

    public static void main(String[] args) {
        new Login();

    }

}
