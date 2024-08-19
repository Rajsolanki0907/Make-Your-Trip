
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Home extends JFrame {
    String username;

    public Home(String username) {
        super("MAKE YOUR TRIP");
        this.username = username;
        setForeground(Color.BLACK);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Project icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1550, 1000);

        add(image);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBounds(0, 0, 1550, 40);
        image.add(menuBar);


        JMenu customer = new JMenu("CUSTOMER");
        customer.setForeground(Color.BLUE);
        customer.setFont(new Font("Tahoma", Font.BOLD, 20));
        customer.setBounds(0, 0, 40, 20);
        menuBar.add(customer);

        JMenuItem addcustomer = new JMenuItem("ADD CUSTOMER");
        addcustomer.setFont(new Font("Tahoma", Font.BOLD, 15));
        customer.add(addcustomer);

        JMenuItem updatecustomer = new JMenuItem("UPDATE CUSTOMER DETAIL");
        updatecustomer.setFont(new Font("Tahoma", Font.BOLD, 15));
        customer.add(updatecustomer);

        JMenuItem viewcustomer = new JMenuItem("VIEW CUSTOMER DETAILS");
        viewcustomer.setFont(new Font("Tahoma", Font.BOLD, 15));
        customer.add(viewcustomer);

        JMenuItem deletecustomer = new JMenuItem("DELETE CUSTOMER DETAILS");
        deletecustomer.setFont(new Font("Tahoma", Font.BOLD, 15));
        customer.add(deletecustomer);

        addcustomer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new AddCustomer(username).setVisible(true);
                } catch (Exception e) {
                }
            }
        });

        updatecustomer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new UpdateCustomer(username).setVisible(true);
                } catch (Exception e) {
                }
            }
        });

        viewcustomer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new ViewCustomer(username).setVisible(true);
                } catch (Exception e) {
                }
            }
        });

        deletecustomer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new DeleteDetails(username).setVisible(true);
                } catch (Exception e) {
                }
            }
        });

        JMenu packages = new JMenu("PACKAGES");
        packages.setFont(new Font("Tahoma", Font.BOLD, 20));
        packages.setBounds(200, 0, 40, 20);
        packages.setForeground(Color.RED);
        menuBar.add(packages);

        JMenuItem checkpackage = new JMenuItem("CHECK PACKAGE");
        checkpackage.setFont(new Font("Tahoma", Font.BOLD, 15));
        packages.add(checkpackage);

        JMenuItem bookpackage = new JMenuItem("BOOK PACKAGE");
        bookpackage.setFont(new Font("Tahoma", Font.BOLD, 15));
        packages.add(bookpackage);

        JMenuItem viewpackage = new JMenuItem("VIEW PACKAGE");
        viewpackage.setFont(new Font("Tahoma", Font.BOLD, 15));
        packages.add(viewpackage);

        checkpackage.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new CheckPackages().setVisible(true);
                } catch (Exception e) {
                }
            }
        });

        bookpackage.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new BookPackage(username).setVisible(true);
                } catch (Exception e) {
                }
            }
        });

        viewpackage.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new ViewPackage(username).setVisible(true);
                } catch (Exception e) {
                }

            }
        });

        JMenu hotels = new JMenu("HOTELS");
        hotels.setForeground(Color.BLUE);
        hotels.setFont(new Font("Tahoma", Font.BOLD, 20));
        menuBar.add(hotels);

        JMenuItem bookhotel = new JMenuItem("BOOK HOTELS");
        bookhotel.setFont(new Font("Tahoma", Font.BOLD, 15));
        hotels.add(bookhotel);

        JMenuItem viewhotel = new JMenuItem("VIEW HOTELS");
        viewhotel.setFont(new Font("Tahoma", Font.BOLD, 15));
        hotels.add(viewhotel);

        JMenuItem viewbookedhotel = new JMenuItem("VIEW BOOKED HOTEL");
        viewbookedhotel.setFont(new Font("Tahoma", Font.BOLD, 15));
        hotels.add(viewbookedhotel);

        bookhotel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                new BookHotel(username).setVisible(true);
            }
        });

        viewhotel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new CheckHotels().setVisible(true);
                } catch (Exception e) {
                }
            }
        });

        viewbookedhotel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new ViewBookedHotel(username).setVisible(true);
                } catch (Exception e) {
                }
            }
        });

        JMenu destination = new JMenu("DESTINATION");
        destination.setFont(new Font("Tahoma", Font.BOLD, 20));
        destination.setForeground(Color.RED);
        menuBar.add(destination);

        JMenuItem destination1 = new JMenuItem("DESTINATION");
        destination1.setFont(new Font("Tahoma", Font.BOLD, 15));
        destination.add(destination1);

        destination1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                new Destinations().setVisible(true);
            }
        });

        JMenu payments = new JMenu("PAYMENT");
        payments.setFont(new Font("Tahoma", Font.BOLD, 20));
        payments.setForeground(Color.BLUE);
        menuBar.add(payments);

        JMenuItem paytm = new JMenuItem("PAY USING PAYTM");
        paytm.setFont(new Font("Tahoma", Font.BOLD, 15));
        payments.add(paytm);

        paytm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                new Payments().setVisible(true);
            }
        });

        JMenu about = new JMenu("ABOUT");
        about.setFont(new Font("Tahoma", Font.BOLD, 20));
        about.setForeground(Color.RED);
        menuBar.add(about);

        JMenuItem about1 = new JMenuItem("ABOUT");
        about1.setFont(new Font("Tahoma", Font.BOLD, 15));
        about.add(about1);

        about1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                new About().setVisible(true);
            }
        });

        JMenu signout = new JMenu("SIGNOUT");
        signout.setForeground(Color.BLUE);
        signout.setFont(new Font("Tahoma", Font.BOLD, 20));
        signout.setBounds(0, 0, 40, 20);
        menuBar.add(signout);

         JMenuItem signout1 = new JMenuItem("SIGNOUT");
        signout1.setFont(new Font("Tahoma", Font.BOLD, 15));
        signout.add(signout1);

        signout1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                new Login().setVisible(true);
                
            }
        });  



        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }

    public static void main(String[] args) {
        new Home("").setVisible(true);
    }
}
