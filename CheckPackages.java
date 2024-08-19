
import javax.swing.*;
import java.awt.*;


public class CheckPackages extends JFrame {

    CheckPackages(){

   setBounds(400, 150, 900, 600);
   setTitle("MAKE YOUR TRIP");

    String[] package1 = {"GOLD PACKAGE","4 Days Goa Trip","Round Trip Flights","4 Star Hotel","Airport Transfers","5 Activities","Selected Meals ","DJ night","Book Now","Winter Special"," Only Rs 25000/-","Package.jpg"};

    String[] package2 = {"SILVER PACKAGE","3 Days Laddak","Airport Assistent","Selected Meal","Clubing","Provide Bike","Welcome Drinks On Arrival","Guider","Book Now","Winter Special","Only Rs 20000/-","Package2.jpg"};

    String[] package3 = {"BRONIE PACKAGE","3 Days Kerala Tour","Return Airfare","2 Day City Tour","Boating","Welcome Drink","Guider","Special Kerala Dish","Book Now","Winter Special","Only Rs 15000/-","Package3.jpg"};


     JTabbedPane tab = new JTabbedPane();
     JPanel p1 = createPackage(package1);
     tab.addTab("Package 1", null, p1);

     JPanel p2 = createPackage(package2);
     tab.addTab("Package 2", null, p2);

    JPanel p3 = createPackage(package3);
     tab.addTab("Package 3", null, p3);
   

   
   add(tab);


   setVisible(true);
    
    }
    public JPanel createPackage(String [] pack){
        
   JPanel p1 = new JPanel();
   p1.setBackground(Color.WHITE);
   p1.setLayout(null);
   add(p1);

   JLabel l1 = new JLabel(pack[0]);
   l1.setBounds(110, 10, 300, 30);
   l1.setForeground(Color.ORANGE);
   l1.setFont(new Font ("Tahoma",Font.BOLD,30));
   p1.add(l1);

   JLabel l2 = new JLabel(pack[1]);
   l2.setBounds(30, 60, 300, 30);
   l2.setForeground(Color.BLACK);
   l2.setFont(new Font ("Tahoma",Font.BOLD,20));
   p1.add(l2);

   JLabel l3 = new JLabel(pack[2]);
   l3.setBounds(30, 110, 300, 30);
   l3.setForeground(Color.BLACK);
   l3.setFont(new Font ("Tahoma",Font.BOLD,20));
   p1.add(l3);

   JLabel l4 = new JLabel(pack[3]);
   l4.setBounds(30, 160, 300, 30);
   l4.setForeground(Color.BLACK);
   l4.setFont(new Font ("Tahoma",Font.BOLD,20));
   p1.add(l4);

   JLabel l5 = new JLabel(pack[4]);
   l5.setBounds(30, 210, 300, 30);
   l5.setForeground(Color.BLACK);
   l5.setFont(new Font ("Tahoma",Font.BOLD,20));
   p1.add(l5);

   JLabel l6 = new JLabel(pack[5]);
   l6.setBounds(30, 260, 300, 30);
   l6.setForeground(Color.BLACK);
   l6.setFont(new Font ("Tahoma",Font.BOLD,20));
   p1.add(l6);
     
   JLabel l7 = new JLabel(pack[6]);
   l7.setBounds(30, 310, 300, 30);
   l7.setForeground(Color.BLACK);
   l7.setFont(new Font ("Tahoma",Font.BOLD,20));
   p1.add(l7);

   JLabel l8 = new JLabel(pack[7]);
   l8.setBounds(30, 360, 350, 30);
   l8.setForeground(Color.BLACK);
   l8.setFont(new Font ("Tahoma",Font.BOLD,20));
   p1.add(l8);

   JLabel l9 = new JLabel(pack[8]);
   l9.setBounds(60, 430, 300, 30);
   l9.setForeground(Color.ORANGE);
   l9.setFont(new Font ("Tahoma",Font.BOLD,25));
   p1.add(l9);

   JLabel l10 = new JLabel(pack[9]);
   l10.setBounds(80, 480, 300, 30);
   l10.setForeground(Color.ORANGE);
   l10.setFont(new Font ("Tahoma",Font.BOLD,25));
   p1.add(l10);

   JLabel l11 = new JLabel(pack[10]);
   l11.setBounds(500, 480, 300, 32);
   l11.setForeground(Color.RED);
   l11.setFont(new Font ("Tahoma",Font.BOLD,30));
   p1.add(l11);

   ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Project icons/"+pack[11]));
   Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
   ImageIcon i3 = new ImageIcon(i2);
   JLabel i12 = new JLabel(i3);
   i12.setBounds(350, 20, 500, 400);
   p1.add(i12);

   return p1;

    }
    public static void main(String[] args) {
        new CheckPackages();
    
    }
}
