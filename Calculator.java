package prog2.prelimgroup;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    JFrame frame;
    JTextField wholeNum1, num1, den1, wholeNum2, num2, den2;
    JButton[] numberButtons = new JButton[10];
    JButton[] funcButtons = new JButton[8];
    JButton addButton, subButton, mulButton, divButton;
    JButton fracButton, equButton, delButton, clrButton;
    JPanel panel;
    JComboBox operator;

    public Calculator(){
        frame = new JFrame("Fraction Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
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

        /*
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        fracButton = new JButton("n/n");
        delButton = new JButton("Delete");
        equButton = new JButton("=");
        clrButton = new JButton("Clear");
         */

        String[] ops = {"+", "-", "*", "/"};
        operator = new JComboBox(ops);
        operator.addActionListener(this);
        operator.setBounds(125, 50, 70, 150);

        /*
        funcButtons[0] = addButton;
        funcButtons[1] = subButton;
        funcButtons[2] = mulButton;
        funcButtons[3] = divButton;

        for (int x = 0; x < 4; x++){
            funcButtons[x].addActionListener(this);
            funcButtons[x].setFocusable(false);
        }
         */

        frame.add(den2);
        frame.add(num2);
        frame.add(wholeNum2);
        frame.add(operator);
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
        if (e.getSource() == operator){
            System.out.println(operator.getSelectedIndex());
        }

    }
}
