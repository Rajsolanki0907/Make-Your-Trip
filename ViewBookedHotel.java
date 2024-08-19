import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;


public class ViewBookedHotel  extends JFrame implements ActionListener{

    JButton back;
    static String username;

    ViewBookedHotel(String username){
        
        setBounds(350, 150, 1000, 600);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setTitle("MAKE YOUR TRIP");

        JLabel text = new JLabel("VIEW BOOKED HOTEL DETAILS");
         text.setFont(new Font("Tahoma",Font.BOLD,20));
         text.setBounds(60, 0, 400, 30);
         add(text);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30, 50, 150, 25);
        add(lblusername);

        JLabel labelusername = new JLabel();
        labelusername.setBounds(220, 50, 150, 25);
        add(labelusername);

        JLabel lblid = new JLabel("Hotel Name");
        lblid.setBounds(30, 90, 150, 25);
        add(lblid);

        JLabel labelid = new JLabel();
        labelid.setBounds(220, 90, 150, 25);
        add(labelid);

        JLabel lblpersons = new JLabel("Total Persons");
        lblpersons.setBounds(30, 130, 150, 25);
        add(lblpersons);

        JLabel labelpersons = new JLabel();
        labelpersons.setBounds(220, 130, 150, 25);
        add(labelpersons);

        JLabel lbldays = new JLabel("Total Days");
        lbldays.setBounds(30, 170, 150, 25);
        add(lbldays);

        JLabel labeldays = new JLabel();
        labeldays.setBounds(220, 170, 150, 25);
        add(labeldays);

        JLabel lblac = new JLabel("AC/NON-AC");
        lblac.setBounds(30, 210, 150, 25);
        add(lblac);

        JLabel labelac = new JLabel();
        labelac.setBounds(220, 210, 150, 25);
        add(labelac);

        JLabel lblfood = new JLabel("Food Included ?");
        lblfood.setBounds(30, 250, 150, 25);
        add(lblfood);

        JLabel labelfood = new JLabel();
        labelfood.setBounds(220, 250, 150, 25);
        add(labelfood);


        JLabel lblname = new JLabel("ID");
        lblname.setBounds(30, 290, 150, 25);
        add(lblname);

        JLabel labelname = new JLabel();
        labelname.setBounds(220, 290, 150, 25);
        add(labelname);


        JLabel lblgender = new JLabel("Number");
        lblgender.setBounds(30, 330, 150, 25);
        add(lblgender);

        JLabel labelgender = new JLabel();
        labelgender.setBounds(220, 330, 150, 25);
        add(labelgender);

        JLabel lblcountry = new JLabel("Phone");
        lblcountry.setBounds(30, 370, 150, 25);
        add(lblcountry);

        JLabel labelcountry = new JLabel();
        labelcountry.setBounds(220, 370, 150, 25);
        add(labelcountry);

       
        JLabel lbladdress = new JLabel("Total Cost");
        lbladdress.setBounds(30, 410, 150, 25);
        add(lbladdress);

        JLabel labeladdress = new JLabel();
        labeladdress.setBounds(220, 410, 150, 25);
        add(labeladdress);


        back = new JButton("Back");
        back.setBounds(130, 460, 100, 25);
        back.setBackground(Color .BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Project icons/viewpackage.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(450, 20, 500, 400);
        add(image);

        
        try {

            Conn conn = new Conn();
            String query = "select * from bookhotel  where username ='"+username+"'";
            ResultSet rs = conn.s.executeQuery(query);
            while (rs.next()) {
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("Name"));
                labelpersons.setText(rs.getString("persons"));
                labelfood.setText(rs.getString("food"));
                labelac.setText(rs.getString("ac"));
                labeldays.setText(rs.getString("days"));
                labelname.setText(rs.getString("id"));
                labelgender.setText(rs.getString("number"));
                labelcountry.setText(rs.getString("phone"));
                labeladdress.setText(rs.getString("price"));

                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        setVisible(true);
   }
   public void actionPerformed(ActionEvent ae){
    setVisible(false);
   }
    public static void main(String[] args) {
        new ViewBookedHotel(""+username);
    }
}
