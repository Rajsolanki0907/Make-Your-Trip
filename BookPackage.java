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

public class BookPackage extends JFrame implements ActionListener{

    Choice cpackage;
    JTextField tfpersons;
    static String username;
    JLabel labelusername,labelid ,labelphone,labelprice,labelnumber;
    JButton checkprice , bookpackage,back;
    


    BookPackage(String username){

        setBounds(300, 150, 1100, 500);
        setLayout(null);
          getContentPane().setBackground(Color.WHITE);
          setTitle("MAKE YOUR TRIP");

        JLabel text = new JLabel("BOOK PACKAGE");
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

        JLabel lblpackage = new JLabel("Select Package");
        lblpackage.setBounds(40, 110, 150, 25);
        lblpackage.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblpackage);

        cpackage = new Choice();
        cpackage.add("Gold Package");
        cpackage.add("Silver Package");
        cpackage.add("Bronie Package");
        cpackage.setBounds(250, 110, 200, 25);
        add(cpackage);

        JLabel lblpersons = new JLabel("Total persons");
        lblpersons.setBounds(40, 150, 200, 25);
        lblpersons.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblpersons);

        tfpersons = new JTextField();
        tfpersons.setBounds(250, 150, 200, 25);
        add(tfpersons);

         JLabel lblid = new JLabel("Id");
        lblid.setBounds(40, 190, 200, 25);
        lblid.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblid);

         labelid = new JLabel();
        labelid.setBounds(250, 190, 200, 25);
        add(labelid);

         JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(40, 230, 200, 25);
        lblnumber.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblnumber);

         labelnumber = new JLabel();
        labelnumber.setBounds(250, 230, 200, 25);
        add(labelnumber);

        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(40, 270, 200, 25);
        lblphone.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblphone);

         labelphone = new JLabel();
        labelphone.setBounds(250, 270, 200, 25);
        add(labelphone);
 
        JLabel lblprice = new JLabel("Total Price");
        lblprice.setBounds(40, 310, 200, 25);
        lblprice.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblprice);

         labelprice = new JLabel();
        labelprice.setBounds(250, 310, 200, 25);
        add(labelprice);


         try {

            Conn conn = new Conn();
            String query = "select * from customer  where username ='"+username+"'";
            ResultSet rs = conn.s.executeQuery(query);
            while (rs.next()) {
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("Id"));
                labelnumber.setText(rs.getString("Number"));
                labelphone.setText(rs.getString("Phone"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
         
        checkprice = new JButton("Check Price");
        checkprice.setBounds(60, 380, 120, 25);
        checkprice.setBackground(Color.BLACK);
        checkprice.setForeground(Color.WHITE);
        checkprice.addActionListener(this);
        add(checkprice);

        bookpackage = new JButton("Book Package");
        bookpackage.setBackground(Color.BLACK);
         bookpackage.setBounds(200, 380, 120, 25);
         bookpackage.setForeground(Color.WHITE);
         bookpackage.addActionListener(this);
         add(bookpackage);
      
         back = new JButton("Back");
        back.setBounds(340, 380, 120, 25);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Project icons/bookpackage.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(550, 50, 500, 300);
        add(image);


        setVisible(true);
   }
   public void actionPerformed(ActionEvent ae){
     if (ae.getSource()== checkprice) {
        String pack= cpackage.getSelectedItem();
        int cost = 0;
        if (pack.equals("Gold Package")) {
          cost += 25000;
            
        }else if (pack.equals("Silver Package")) {
            cost += 20000;
            
        }else{
            cost += 15000;
        }

        int persons = Integer.parseInt(tfpersons.getText());
        cost *= persons;
        labelprice.setText("Rs "+cost);


        
     }else if (ae.getSource() == bookpackage) {
        try {
            Conn c = new Conn();
            c.s.executeUpdate("insert into bookpackage values ('"+labelusername.getText()+"','"+cpackage.getSelectedItem()+"','"+tfpersons.getText()+"','"+labelid.getText()+"','"+labelnumber.getText()+"','"+labelphone.getText()+"','"+labelprice.getText()+"')");

            JOptionPane.showMessageDialog(null, "Package Booked Successfully");

            setVisible(false);
            
        } catch (Exception e) {

           e.printStackTrace();
        }

        
     }else{
        setVisible(false);
     }
   }
    
    public static void main(String[] args) {
        new BookPackage(""+username);
    }
}
