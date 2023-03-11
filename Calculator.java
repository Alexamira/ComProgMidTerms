package prog2.prelimgroup;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    JFrame frame;
    JTextField wholeNum1, num1, den1, wholeNum2, num2, den2, rNum, rDen, rWholeNum;
    JButton[] numberButtons = new JButton[10];
    JButton[] funcButtons = new JButton[8];
    JButton addButton, subButton, mulButton, divButton;
    JButton fracButton, equButton, delButton, clrButton;
    JPanel panel;
    int iNum1, iNum2, iDen1, iDen2, iWholeNum1, iWholeNum2;
    char operator;
    // JComboBox operator;

    public Calculator(){
        frame = new JFrame("Fraction Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550,250);
        frame.setLayout(null);
        frame.setResizable(false);

        wholeNum1 = new JTextField();
        wholeNum1.setBounds(20,100, 50,50);
        num1 = new JTextField();
        num1.setBounds(70,70, 50,50);
        den1 = new JTextField();
        den1.setBounds(70,120, 50,50);
        wholeNum2 = new JTextField();
        wholeNum2.setBounds(200,100, 50,50);
        num2 = new JTextField();
        num2.setBounds(250,70, 50,50);
        den2 = new JTextField();
        den2.setBounds(250,120, 50,50);
        rWholeNum = new JTextField();
        rWholeNum.setBounds(400,100, 50,50);
        rNum = new JTextField();
        rNum.setBounds(450,70, 50,50);
        rDen= new JTextField();
        rDen.setBounds(450,120, 50,50);


        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        delButton = new JButton("Delete");
        equButton = new JButton("=");
        clrButton = new JButton("Clear");

        panel = new JPanel();
        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(4,4,10,10));

        /*
        String[] ops = {"+", "-", "*", "/"};
        operator = new JComboBox(ops);
        operator.addActionListener(this);
        operator.setBounds(125, 50, 70, 150);
        */

        funcButtons[0] = addButton;
        funcButtons[1] = subButton;
        funcButtons[2] = mulButton;
        funcButtons[3] = divButton;
        funcButtons[4] = delButton;
        funcButtons[5] = equButton;
        funcButtons[6] = clrButton;

        for (int x = 0; x < 7; x++){
            funcButtons[x].addActionListener(this);
            funcButtons[x].setFocusable(false);
        }

        addButton.setBounds(0,0, 50, 50);
        equButton.setBounds(100,0, 50,50);

        frame.add(equButton);
        frame.add(addButton);
        frame.add(rNum);
        frame.add(rWholeNum);
        frame.add(rDen);
        frame.add(equButton);
        frame.add(addButton);
        frame.add(den2);
        frame.add(num2);
        frame.add(wholeNum2);
        // frame.add(operator);
        frame.add(num1);
        frame.add(den1);
        frame.add(wholeNum1);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        /*
        if (e.getSource() == operator){
            System.out.println(operator.getSelectedIndex());
            }
         */
        if (e.getSource() == addButton){
            operator = '+';
        }
        if (e.getSource() == equButton){
            iNum1= Integer.parseInt(num1.getText());
            iDen1 = Integer.parseInt(den1.getText());
            Fraction frac1 =  new Fraction(iNum1, iDen1);
            iNum2= Integer.parseInt(num2.getText());
            iDen2 = Integer.parseInt(den2.getText());
            Fraction frac2 =  new Fraction(iNum2, iDen2);
            Fraction sumFrac = new Fraction();
            sumFrac = sumFrac.addFraction(frac1, frac2);
            rNum.setText(String.valueOf(sumFrac.getNumerator()));
            rDen.setText(String.valueOf(sumFrac.getDenominator()));
        }


    }
}
