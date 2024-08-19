import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.Image;
//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
//import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Paytm extends JFrame implements ActionListener {
    Paytm(){
        setBounds(400, 150, 800, 600);
        JEditorPane pane = new JEditorPane();
        pane.setEditable(false);
        try {
             
        // ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Project icons/Payments.jpg"));
        // Image i2 = i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        // ImageIcon i3 = new ImageIcon(i2);
        // JLabel image = new JLabel(i3);
        // image.setBounds(0,0,800,600);
        // add(image);
        pane.setPage("https://paytm.com/rent-payment");
        JButton back = new JButton("Back");
        back.setBounds(610, 20, 80, 40);
        back.addActionListener(this);
        pane.add(back);
        } catch (Exception e) {
            pane.setContentType("text/html");
            pane.setText("<html>Could not load , error 4400</html>");
        }

        JScrollPane sp = new JScrollPane(pane);
        getContentPane().add(sp);
        // JButton back = new JButton("Back");
        // back.setBounds(610, 20, 80, 40);
        // back.addActionListener(this);
        // image.add(back);

        setVisible(true);


    }
    public void actionPerformed(ActionEvent ae){

        setVisible(false);
        new Payments();
    }

    public static void main(String[] args) {
        new Paytm();
        
    }

}
