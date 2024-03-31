import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;

public class Other extends JButton implements ActionListener {

    final int radius = 45;

    public Other(String title){
        setBackground(Color.RED);
        setForeground(Color.WHITE);
        setText(title);
        setFont(new Font("Times New Romen",Font.BOLD,15));
        Border customBoder = BorderFactory.createLineBorder(Color.GRAY,2);
        setBorder(customBoder);
        setFocusable(false);
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Paint the background
        g2.setColor(getBackground());
        g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), radius, radius));

        // Paint the text
        super.paintComponent(g2);

        g2.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
