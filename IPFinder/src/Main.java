import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main extends JFrame implements ActionListener {

    JLabel label;
    JTextField text;
    JButton btn, btnClose;

    Main(){
        super("IP Finder");
        label = new JLabel("Enter URL:");
        label.setBounds(50,70,150,20);

        text = new JTextField();
        text.setBounds(50,100,200,20);

        btn = new JButton("Find");
        btn.setBounds(50,150,80,30);
        btn.addActionListener(this);

        btnClose = new JButton("Close");
        btnClose.setBounds(170,150,80,30);
        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        add(label);
        add(text);
        add(btn);
        add(btnClose);

        setSize(300,300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String url = text.getText();

        try {
            InetAddress inetAddress = InetAddress.getByName(url);
            String ip = inetAddress.getHostAddress();
            JOptionPane.showMessageDialog(this,ip);
            System.out.println(ip);
        } catch (UnknownHostException ex) {
            JOptionPane.showMessageDialog(this,ex.toString());
        }
    }
}