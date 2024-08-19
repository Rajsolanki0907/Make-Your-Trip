import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class DashBoard  extends JFrame implements ActionListener{
    String username;
    JButton AddPersonalDetails , viewPersonalDetails , checkpackage ,
            updatePersonalDetails , bookpackage,viewpackage, viewhotels , destinations,
             bookhotel,viewbookedhotel,payments,totalpayments,notepad,about,deletePersonalDetails;

    DashBoard(String username){ 
        this.username = username;
       // setBounds(0, 0, 1600,1000);
       setTitle("MAKE YOUR TRIP");
        setExtendedState(JFrame.MAXIMIZED_BOTH); //in case of when you dont know the size of your screen
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0, 0, 1600, 60);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Project icons/logo3.png"));
        Image i2 = i1.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5, 0, 80, 80);
        p1.add(icon);

         

        JLabel heading = new JLabel("Dashboard");
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        heading.setBounds(80, 10, 300, 40);
        p1.add(heading);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0, 60, 300, 900);
        add(p2);

        AddPersonalDetails = new JButton("Add Personal Details");
        AddPersonalDetails.setBounds(0, 0, 300, 50);
        AddPersonalDetails.setBackground(new Color(0,0,102));
        AddPersonalDetails.setForeground( Color.WHITE);
        //AddPersonalDetails.setBorder(new LineBorder(new Color(131, 193, 233)));
        AddPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        AddPersonalDetails.setMargin(new Insets(0, 0, 0, 60));
        AddPersonalDetails.addActionListener(this);
        p2.add(AddPersonalDetails);

    
        updatePersonalDetails = new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0, 50, 300, 50);
        updatePersonalDetails.setBackground(new Color(0,0,102));
        updatePersonalDetails.setForeground(Color.WHITE);
        //AddPersonalDetails.setBorder(new LineBorder(new Color(131, 193, 233)));
        updatePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        updatePersonalDetails.setMargin(new Insets(0, 0, 0, 30));
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);

        viewPersonalDetails = new JButton("View Details");
        viewPersonalDetails.setBounds(0, 100, 300, 50);
        viewPersonalDetails.setBackground(new Color(0,0,102));
        viewPersonalDetails.setForeground(Color.WHITE);
        //AddPersonalDetails.setBorder(new LineBorder(new Color(131, 193, 233)));
        viewPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewPersonalDetails.setMargin(new Insets(0, 0, 0, 130));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);

        deletePersonalDetails = new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0, 150, 300, 50);
        deletePersonalDetails.setBackground(new Color(0,0,102));
        deletePersonalDetails.setForeground( Color.WHITE);
        //AddPersonalDetails.setBorder(new LineBorder(new Color(131, 193, 233)));
        deletePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        deletePersonalDetails.setMargin(new Insets(0, 0, 0, 40));
        deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);

        checkpackage = new JButton("Check Package");
        checkpackage.setBounds(0, 200, 300, 50);
        checkpackage.setBackground(new Color(0,0,102));
        checkpackage.setForeground( Color.WHITE);
        //AddPersonalDetails.setBorder(new LineBorder(new Color(131, 193, 233)));
        checkpackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        checkpackage.setMargin(new Insets(0, 0, 0, 110));
        checkpackage.addActionListener(this);
        p2.add(checkpackage);

        bookpackage = new JButton("Book Package");
        bookpackage.setBounds(0, 250, 300, 50);
        bookpackage.setBackground(new Color(0,0,102));
        bookpackage.setForeground( Color.WHITE);
        //AddPersonalDetails.setBorder(new LineBorder(new Color(131, 193, 233)));
        bookpackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookpackage.setMargin(new Insets(0, 0, 0, 120));
        bookpackage.addActionListener(this);
        p2.add(bookpackage);

         viewpackage = new JButton("View Package");
        viewpackage.setBounds(0, 300, 300, 50);
        viewpackage.setBackground(new Color(0,0,102));
        viewpackage.setForeground( Color.WHITE);
        //AddPersonalDetails.setBorder(new LineBorder(new Color(131, 193, 233)));
        viewpackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewpackage.setMargin(new Insets(0, 0, 0, 120));
        viewpackage.addActionListener(this);
        p2.add(viewpackage);

        viewhotels = new JButton("View Hotels");
        viewhotels.setBounds(0, 350, 300, 50);
        viewhotels.setBackground(new Color(0,0,102));
        viewhotels.setForeground( Color.WHITE);
        //AddPersonalDetails.setBorder(new LineBorder(new Color(131, 193, 233)));
        viewhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewhotels.setMargin(new Insets(0, 0, 0, 140));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);

        bookhotel = new JButton("Book Hotel");
        bookhotel.setBounds(0, 400, 300, 50);
        bookhotel.setBackground(new Color(0,0,102));
        bookhotel.setForeground( Color.WHITE);
        //AddPersonalDetails.setBorder(new LineBorder(new Color(131, 193, 233)));
        bookhotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookhotel.setMargin(new Insets(0, 0, 0, 140));
        bookhotel.addActionListener(this);
        p2.add(bookhotel);

        viewbookedhotel = new JButton("View Booked Hotel");
        viewbookedhotel.setBounds(0, 450, 300, 50);
        viewbookedhotel.setBackground(new Color(0,0,102));
        viewbookedhotel.setForeground( Color.WHITE);
        //AddPersonalDetails.setBorder(new LineBorder(new Color(131, 193, 233)));
        viewbookedhotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewbookedhotel.setMargin(new Insets(0, 0, 0, 70));
        viewbookedhotel.addActionListener(this);
        p2.add(viewbookedhotel);

        destinations = new JButton("Destinations");
        destinations.setBounds(0, 500, 300, 50);
        destinations.setBackground(new Color(0,0,102));
        destinations.setForeground( Color.WHITE);
        //AddPersonalDetails.setBorder(new LineBorder(new Color(131, 193, 233)));
        destinations.setFont(new Font("Tahoma", Font.PLAIN, 20));
        destinations.setMargin(new Insets(0, 0, 0, 125));
        destinations.addActionListener(this);
        p2.add(destinations);

         payments = new JButton("Payments");
        payments.setBounds(0, 550, 300, 50);
        payments.setBackground(new Color(0,0,102));
        payments.setForeground( Color.WHITE);
        //AddPersonalDetails.setBorder(new LineBorder(new Color(131, 193, 233)));
        payments.setFont(new Font("Tahoma", Font.PLAIN, 20));
        payments.setMargin(new Insets(0, 0, 0, 150));
        payments.addActionListener(this);
        p2.add(payments);
        
        //  totalpayments = new JButton(" Total Payments");
        // totalpayments.setBounds(0, 600, 300, 50);
        // totalpayments.setBackground(new Color(0,0,102));
        // totalpayments.setForeground( Color.WHITE);
        // //AddPersonalDetails.setBorder(new LineBorder(new Color(131, 193, 233)));
        // totalpayments.setFont(new Font("Tahoma", Font.PLAIN, 20));
        // totalpayments.setMargin(new Insets(0, 0, 0, 110));
        // totalpayments.addActionListener(this);
        // p2.add(totalpayments);

         notepad = new JButton("Notepad");
        notepad.setBounds(0, 600, 300, 50);
        notepad.setBackground(new Color(0,0,102));
        notepad.setForeground( Color.WHITE);
        //AddPersonalDetails.setBorder(new LineBorder(new Color(131, 193, 233)));
        notepad.setFont(new Font("Tahoma", Font.PLAIN, 20));
        notepad.setMargin(new Insets(0, 0, 0, 155));
        notepad.addActionListener(this);
        p2.add(notepad);

         about = new JButton("About");
        about.setBounds(0, 650, 300, 50);
        about.setBackground(new Color(0,0,102));
        about.setForeground( Color.WHITE);
        //AddPersonalDetails.setBorder(new LineBorder(new Color(131, 193, 233)));
        about.setFont(new Font("Tahoma", Font.PLAIN, 20));
        about.setMargin(new Insets(0, 0, 0, 175));
        about.addActionListener(this);
        p2.add(about);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("Project icons/front.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1550, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0, 0, 1550, 1000);
        add(image);


        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){

        if (ae.getSource() == AddPersonalDetails) {
            new AddCustomer(username);
       }else if (ae.getSource() == viewPersonalDetails) {
        new ViewCustomer(username);
        
       } else if (ae.getSource() == updatePersonalDetails) {
         new UpdateCustomer(username);
        
       }else if(ae.getSource() == checkpackage){
        new CheckPackages();

       }else if(ae.getSource() == bookpackage){
        new BookPackage(username);

       }else if (ae.getSource() == viewpackage) {
        new ViewPackage(username);
        
       }else if (ae.getSource() == viewhotels) {
        new CheckHotels();
       }else if (ae.getSource() == destinations) {
        new Destinations();
       }else if(ae.getSource() == bookhotel){
        new BookHotel(username);
       } else if(ae.getSource() == viewbookedhotel){
        new ViewBookedHotel(username);
       } else if(ae.getSource() == payments){
        new Payments();
    //    }else if (ae.getSource() == notepad) {
    //     try {
    //         Runtime.getRuntime().exec("notepad.exe");
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
        
       }else if (ae.getSource() == about) {
        new About();
        
       }else if (ae.getSource() == deletePersonalDetails) {
        new DeleteDetails(username);
       }

       } 
    
    public static void main(String[] args) {
        new DashBoard("");
        
    }
}
