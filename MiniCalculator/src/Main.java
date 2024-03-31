import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    Button btnOne,btnTwo,btnThree,btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero;
    NonDigitButton btnPlus,btnSub,btnMul,btnDiv,btnDot,btnEqu;

    Other btnAllZero,btnErase,btnPOM,btnPercentage;

    JLabel text;
    double numberOne, numberTwo, result;
    String operator;

    ImageIcon logo = new ImageIcon("logo.png");

    public Main(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Calculator");
        getContentPane().setBackground(Color.black);
        setIconImage(logo.getImage());
        setUndecorated(false);
        setResizable(false);

        text = new JLabel();
        text.setBounds(25,25,185,50);
        text.requestFocusInWindow();
        text.setHorizontalAlignment(JLabel.RIGHT);
        text.setFont(new Font("Times New Romen",Font.BOLD,50));
        text.setForeground(Color.WHITE);

        btnAllZero = new Other("C");
        btnAllZero.setBounds(25,100,45,45);
        btnAllZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
            }
        });

        btnErase = new Other("<");
        btnErase.setBounds(75,100,45,45);
        btnErase.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = text.getText();
                if(!(number.isEmpty())) {
                    text.setText(number.substring(0, number.length() - 1));
                }else{
                    text.setText("");
                }
            }
        });

        btnPOM = new Other("+/-");
        btnPOM.setBounds(125,100,45,45);
        btnPOM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = text.getText();
                if(number.substring(0,1).equals("-")){
                    text.setText(number.substring(1,number.length()));
                }else{
                    text.setText("-"+number);
                }
            }
        });

        btnPercentage = new Other("%");
        btnPercentage.setBounds(175,100,45,45);
        btnPercentage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double number = Double.parseDouble(text.getText());
                number /=100;
                text.setText(Double.toString(number));
            }
        });


        btnOne = new Button("1");
        btnOne.setBounds(25,150,45,45);
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                text.setText(text.getText() + btnOne.getText());
            }
        });

        btnTwo = new Button("2");
        btnTwo.setBounds(75,150,45,45);
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + btnTwo.getText());
            }
        });

        btnThree = new Button("3");
        btnThree.setBounds(125,150,45,45);
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + btnThree.getText());
            }
        });

        btnPlus = new NonDigitButton("+");
        btnPlus.setBounds(175,150,45,45);
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberOne = Double.parseDouble(text.getText());
                text.setText("");
                operator = "+";
                btnPlus.setBackground(Color.WHITE);
                btnPlus.setForeground(Color.ORANGE);
            }
        });

        btnFour = new Button("4");
        btnFour.setBounds(25,200,45,45);
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + btnFour.getText());
            }
        });


        btnFive = new Button("5");
        btnFive.setBounds(75,200,45,45);
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + btnFive.getText());
            }
        });


        btnSix = new Button("6");
        btnSix.setBounds(125,200,45,45);
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + btnSix.getText());
            }
        });


        btnSub = new NonDigitButton("-");
        btnSub.setBounds(175,200,45,45);
        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberOne = Double.parseDouble(text.getText());
                text.setText("");
                operator = "-";
                btnSub.setBackground(Color.WHITE);
                btnSub.setForeground(Color.ORANGE);
            }
        });


        btnSeven = new Button("7");
        btnSeven.setBounds(25,250,45,45);
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + btnSeven.getText());
            }
        });

        btnEight = new Button("8");
        btnEight.setBounds(75,250,45,45);
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + btnEight.getText());
            }
        });


        btnNine = new Button("9");
        btnNine.setBounds(125,250,45,45);
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + btnNine.getText());
            }
        });


        btnMul = new NonDigitButton("*");
        btnMul.setBounds(175,250,45,45);
        btnMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberOne = Double.parseDouble(text.getText());
                text.setText("");
                operator = "*";
                btnMul.setBackground(Color.WHITE);
                btnMul.setForeground(Color.ORANGE);
            }
        });


        btnZero = new Button("0");
        btnZero.setBounds(25,300,45,45);
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + btnZero.getText());
            }
        });

        btnDot = new NonDigitButton(".");
        btnDot.setBounds(75,300,45,45);
        btnDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + btnDot.getText());
            }
        });


        btnDiv = new NonDigitButton("/");
        btnDiv.setBounds(125,300,45,45);
        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberOne = Double.parseDouble(text.getText());
                text.setText("");
                operator = "/";
                btnDiv.setBackground(Color.WHITE);
                btnDiv.setForeground(Color.ORANGE);
            }
        });


        btnEqu = new NonDigitButton("=");
        btnEqu.setBounds(175,300,45,45);
        btnEqu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String answer;
                numberTwo = Double.parseDouble(text.getText());

                if(operator.equals("+")){
                    result = numberOne + numberTwo;
                    answer = String.format("%.2f", result);

                    if(result != (int)result)
                        text.setText(answer);
                    else {
                        text.setText(Integer.toString((int)result));
                    }
                    btnPlus.setBackground(Color.ORANGE);
                    btnPlus.setForeground(Color.WHITE);
                }

                if(operator.equals("-")){
                    result = numberOne - numberTwo;
                    answer = String.format("%.2f", result);
                    if(result != (int)result)
                        text.setText(answer);
                    else {
                        text.setText(Integer.toString((int)result));
                    }
                    btnSub.setBackground(Color.ORANGE);
                    btnSub.setForeground(Color.WHITE);
                }

                if(operator.equals("*")){
                    result = numberOne * numberTwo;
                    answer = String.format("%.2f", result);
                    if(result != (int)result)
                        text.setText(answer);
                    else {
                        text.setText(Integer.toString((int)result));
                    }
                    btnMul.setBackground(Color.ORANGE);
                    btnMul.setForeground(Color.WHITE);
                }

                if(operator.equals("/")){
                    result = numberOne / numberTwo;
                    answer = String.format("%.2f", result);
                    if(result != (int)result)
                        text.setText(answer);
                    else {
                        text.setText(Integer.toString((int)result));
                    }
                    btnDiv.setBackground(Color.ORANGE);
                    btnDiv.setForeground(Color.WHITE);
                }


            }
        });

        add(btnOne);add(btnTwo);add(btnThree);add(btnFour);add(btnFive);add(btnSix);add(btnSeven);
        add(btnEight);add(btnNine);add(btnPlus);add(btnSub);add(btnMul);add(btnDiv);add(btnZero);
        add(btnDot);add(btnEqu);add(text);add(btnAllZero);add(btnErase);add(btnPOM);add(btnPercentage);


        setSize(265,410);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Main();
    }
}