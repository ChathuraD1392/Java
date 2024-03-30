import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends Frame {
    JLabel display;

    public Main(String appName){
        super(appName);

        display = new JLabel();
        display.setText("Myabldlb");
        display.setBounds(30,50,240,30);
        display.setBackground(Color.BLUE);
        display.setForeground(Color.WHITE);
        add(display);


        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setLayout(null);
        setSize(325,325);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main("My Calculator");
    }
}