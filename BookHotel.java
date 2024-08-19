import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class BookHotel extends JFrame implements ActionListener{

    Choice chotel,cac,cfood;
    JTextField tfpersons,tfdays;
    static String username;
    JLabel labelusername,labelid ,labelphone,labelprice,labelnumber;
    JButton checkprice , bookpackage,back;
    


    BookHotel(String username){
    
        setBounds(300, 150, 1100, 600);
        setLayout(null);
          getContentPane().setBackground(Color.WHITE);
          setTitle("MAKE YOUR TRIP");

        JLabel text = new JLabel("BOOK HOTEL");
        text.setBounds(100, 10, 200, 30);
        text.setFont(new Font("Tahoma",Font.BOLD,20));
        add(text);


        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40, 70, 200, 25);
        lblusername.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblusername);

        labelusername = new JLabel();
        labelusername.setBounds(250, 70, 100, 25);
        add(labelusername);

        JLabel lblpackage = new JLabel("Select Hotel");
        lblpackage.setBounds(40, 110, 150, 25);
        lblpackage.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblpackage);

        chotel = new Choice();
        chotel.setBounds(250, 110, 200, 25);
        add(chotel);

        try {
            Conn c = new Conn();
            ResultSet rs =c.s.executeQuery("Select * from hotel");
            while (rs.next()) {
                chotel.add(rs.getString("name"));
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel lblpersons = new JLabel("Total persons");
        lblpersons.setBounds(40, 150, 200, 25);
        lblpersons.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblpersons);

        tfpersons = new JTextField();
        tfpersons.setBounds(250, 150, 200, 25);
        add(tfpersons);

        JLabel lbldays = new JLabel("no. of days");
        lbldays.setBounds(40, 190, 200, 25);
        lbldays.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lbldays);

        tfdays = new JTextField();
        tfdays.setBounds(250, 190, 200, 25);
        add(tfdays);

        JLabel lblac = new JLabel("AC / NON-AC");
        lblac.setBounds(40, 230, 200, 25);
        lblac.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblac);

         cac = new Choice();
         cac.add("AC");
         cac.add("NON-AC");
        cac.setBounds(250, 230, 200, 25);
        add(cac);

        
        JLabel lblfood = new JLabel("Food included");
        lblfood.setBounds(40, 270, 200, 25);
        lblfood.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblfood);

         cfood = new Choice();
         cfood.add("Yes");
         cfood.add("No");
        cfood.setBounds(250, 270, 200, 25);
        add(cfood);

        JLabel lblid = new JLabel("Id");
        lblid.setBounds(40, 310, 200, 25);
        lblid.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblid);

         labelid = new JLabel();
        labelid.setBounds(250, 310, 200, 25);
        add(labelid);

         JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(40, 350, 200, 25);
        lblnumber.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblnumber);

         labelnumber = new JLabel();
        labelnumber.setBounds(250, 350, 200, 25);
        add(labelnumber);

        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(40, 390, 200, 25);
        lblphone.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblphone);

         labelphone = new JLabel();
        labelphone.setBounds(250, 390, 200, 25);
        add(labelphone);
 
        JLabel lblprice = new JLabel("Total Price");
        lblprice.setBounds(40, 430, 200, 25);
        lblprice.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblprice);

         labelprice = new JLabel();
        labelprice.setBounds(250, 430, 200, 25);
        add(labelprice);


         try {

            Conn conn = new Conn();
            String query = "select * from customer  where username ='"+username+"'";
            ResultSet rs = conn.s.executeQuery(query);
            while (rs.next()) {
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("number"));
                labelphone.setText(rs.getString("phone"));
            
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ttt");
        }
         
        checkprice = new JButton("Check Price");
        checkprice.setBounds(60, 490, 120, 25);
        checkprice.setBackground(Color.BLACK);
        checkprice.setForeground(Color.WHITE);
        checkprice.addActionListener(this);
        add(checkprice);

        bookpackage = new JButton("Book Hotel");
        bookpackage.setBackground(Color.BLACK);
         bookpackage.setBounds(200, 490, 120, 25);
         bookpackage.setForeground(Color.WHITE);
         bookpackage.addActionListener(this);
         add(bookpackage);
      
         back = new JButton("Back");
        back.setBounds(340, 490, 120, 25);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Project icons/BookHotel.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(500, 50, 600, 400);
        add(image);


        setVisible(true);
   }
   public void actionPerformed(ActionEvent ae){
     if (ae.getSource() == checkprice) {

       try {
        
       
        Conn c = new Conn();
        ResultSet rs = c.s.executeQuery("select * from hotel where name = '"+chotel.getSelectedItem()+"'");
        while (rs.next()) {
            
            int cost = Integer.parseInt(rs.getString("costperperson"));
            int food = Integer.parseInt(rs.getString("foodincluded"));
            int ac = Integer.parseInt(rs.getString("acroom")); 

            int persons = Integer.parseInt(tfpersons.getText());
            int days = Integer.parseInt(tfdays.getText());
            
            String acselected = cac.getSelectedItem();
            String foodselected = cfood.getSelectedItem();
        if (persons * days > 0) {
            int total = 0;
            total += acselected.equals("AC") ? ac : 0;
            total += foodselected.equals("Yes") ? food :0;
            total += cost;
            total = total * persons * days;
            labelprice.setText("Rs" +total);
        

        } else {
            JOptionPane.showMessageDialog(null, "Please enter a Valid Number");
        
        
        }
    }
}       catch (Exception e) {
         e.printStackTrace();
         

       }


        
     }else if (ae.getSource() == bookpackage) {
        try {
            Conn c = new Conn();
            c.s.executeUpdate("insert into bookhotel values ('"+labelusername.getText()+"','"+chotel.getSelectedItem()+"','"+tfpersons.getText()+"','"+tfdays.getText()+"','"+cac.getSelectedItem()+"','"+cfood.getSelectedItem()+"','"+labelid.getText()+"','"+labelnumber.getText()+"','"+labelphone.getText()+"','"+labelprice.getText()+"')");

            JOptionPane.showMessageDialog(null, "Hotel Booked Successfully");

            setVisible(false);
            
        } catch (Exception e) {

           e.printStackTrace();
        }

        
     }else{
        setVisible(false);
     }
   }
    
    public static void main(String[] args) {
        new BookHotel(""+username);
    }
}

