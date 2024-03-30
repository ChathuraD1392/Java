import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DigitButton extends Button implements ActionListener {

    Main cal;

    DigitButton(int x, int y, int width, int height, String cap, Main cal){
        super(cap);
        setBounds(x,y,width,height);
        this.cal = cal;
        this.cal.add(this);
        addActionListener(this);
    }

    static boolean isInString(String name, char charactor){
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)==charactor)
                return true;
        }
        return false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String text = ((DigitButton)e.getSource()).getLabel();

        if(text.equals(".")){
            if(cal.setClear){
                cal.display.setText("0.");
                cal.setClear = false;
            } else if (!isInString(cal.display.getText(),'.')) {
                cal.display.setText(cal.display.getText() + ".");
            }
            return;
        }

        int index =0;
        try{
            index = Integer.parseInt(text);
        }catch (NumberFormatException ex){
            return;
        }

        if(index ==0 && cal.display.getText().equals("0"))
            return;
        if(cal.setClear) {
            cal.display.setText("" + index);
            cal.setClear = false;
        }
        else
            cal.display.setText(cal.display.getText() + index);
    }
}
