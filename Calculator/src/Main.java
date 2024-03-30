import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends Frame {

    String digitButtonText[] = {"7", "8", "9", "4", "5", "6", "1", "2", "3", "0", "+/-", "." };

    JLabel display;
    DigitButton digitButton[]=new DigitButton[digitButtonText.length];
    public boolean setClear=true;

    final int FRAME_WIDTH=325,FRAME_HEIGHT=325;
    final int HEIGHT=30, WIDTH=30, H_SPACE=10,V_SPACE=10;
    final int TOPX=30, TOPY=50;



    public Main(String appName){
        super(appName);

        int tempX=TOPX, y=TOPY;

        display = new JLabel("0");
        display.setBounds(30,50,240,30);
        display.setBackground(Color.BLUE);
        display.setForeground(Color.WHITE);
        add(display);


        int digitX=TOPX+WIDTH+H_SPACE;
        int digitY=TOPY+2*(HEIGHT+V_SPACE);
        tempX=digitX;  y=digitY;
        for(int i=0;i<digitButton.length;i++)
        {
            digitButton[i]=new DigitButton(tempX,y,WIDTH,HEIGHT,digitButtonText[i], this);
            digitButton[i].setForeground(Color.BLUE);
            tempX+=WIDTH+H_SPACE;
            if((i+1)%3==0){tempX=digitX; y+=HEIGHT+V_SPACE;}
    }



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