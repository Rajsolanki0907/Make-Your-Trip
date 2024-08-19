import java.awt.*;

import javax.swing.*;

public class Loading extends JFrame implements Runnable {

    Thread t;
    JProgressBar bar;
    String username;

    public void run() {

        try {

            for (int i = 0; i < 101; i++) {
                int max = bar.getMaximum();
                int value = bar.getValue();

                if (value < max) {
                    bar.setValue(bar.getValue() + 1);

                } else {
                    setVisible(false);
                    // new DashBoard(username);
                    new Home(username);
                }

                Thread.sleep(20);

            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    Loading(String username) {
        this.username = username;

        t = new Thread(this);

        setBounds(500, 200, 650, 400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setTitle("MAKE YOUR TRIP");

        JLabel text = new JLabel("MAKE YOUR TRIP");
        text.setBounds(150, 20, 600, 40);
        text.setForeground(Color.BLUE);
        text.setFont(new Font("Railway", Font.CENTER_BASELINE, 35));
        add(text);

        bar = new JProgressBar();
        bar.setBounds(150, 100, 300, 35);
        bar.setStringPainted(true);
        add(bar);

        JLabel loading = new JLabel("Loading please wait.....");
        loading.setBounds(200, 140, 180, 30);
        loading.setForeground(Color.red);
        loading.setFont(new Font("Railway", Font.BOLD, 16));
        add(loading);

        JLabel lblusername = new JLabel("Welcome " + username);
        lblusername.setBounds(30, 300, 400, 40);
        lblusername.setForeground(Color.RED);
        lblusername.setFont(new Font("Railway", Font.BOLD, 25));
        add(lblusername);

        t.start();

        setVisible(true);

    }

    public static void main(String[] args) {
        new Loading(" ").setVisible(true);
    }
}
