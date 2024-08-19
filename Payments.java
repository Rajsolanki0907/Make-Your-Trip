import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Payments extends JFrame implements ActionListener {

    JButton pay, back;

    Payments() {

        setBounds(400, 150, 800, 600);
        setLayout(null);
        setTitle("MAKE YOUR TRIP");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Project icons/Payments.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 600);
        add(image);

        pay = new JButton("Pay");
        pay.setBounds(100, 450, 80, 40);
        pay.addActionListener(this);
        image.add(pay);

        back = new JButton("Back");
        back.setBounds(600, 450, 80, 40);
        back.addActionListener(this);
        image.add(back);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == pay) {
            setVisible(false);
            new Paytm();

        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Payments();
    }

}
