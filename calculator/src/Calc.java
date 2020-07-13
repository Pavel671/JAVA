mport javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calc extends JFrame {
    Calc() {
        setBounds(300, 300, 300, 300);
        setLayout(new BorderLayout());
        setVisible(true);
        JTextArea display = new JTextArea();
        JPanel buttonPanel = new JPanel(new GridLayout(3, 5));
        JButton button0 = new JButton("0");
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton buttonSum = new JButton("+");
        JButton buttonBack = new JButton("C");
        JButton buttonDivide = new JButton("/");
        JButton buttonSub = new JButton("-");
        JButton buttonMul = new JButton("*");
        JButton buttonStart = new JButton("=");


        setBounds(300, 300, 300, 300);
        setLayout(new BorderLayout());
        add(display, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(buttonStart, BorderLayout.SOUTH);
        buttonPanel.add(button0);
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(buttonSum);
        buttonPanel.add(buttonSub);
        buttonPanel.add(buttonMul);
        buttonPanel.add(buttonBack);
        buttonPanel.add(buttonDivide);
        setVisible(true);

        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "0");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "1");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "2");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "3");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "4");
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "5");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "6");
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "7");
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "8");
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "9");
            }
        });

        buttonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = display.getText();
                display.setText(temp.substring(0, temp.length() - 1));
            }
        });

        final int[] firstValue = {0};
        final String[] operation = {"+"};

        buttonSum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue[0] = Integer.valueOf(display.getText());
                display.setText("");
                operation[0] = "+";
            }
        });
        buttonMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue[0] = Integer.valueOf(display.getText());
                display.setText("");
                operation[0] = "*";
            }
        });
        buttonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue[0] = Integer.valueOf(display.getText());
                display.setText("");
                operation[0] = "/";
            }
        });
        buttonSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue[0] = Integer.valueOf(display.getText());
                display.setText("");
                operation[0] = "-";
            }
        });

        buttonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int secondValue = Integer.valueOf(display.getText());
                switch (operation[0]) {
                    case "+":
                        display.setText((firstValue[0] + secondValue) + "");
                        break;
                }
                switch (operation[0]) {
                    case "-":
                        display.setText((firstValue[0] - secondValue) + "");
                        break;
                }
                switch (operation[0]) {
                    case "*":
                        display.setText((firstValue[0] * secondValue) + "");
                        break;
                }
                switch (operation[0]) {
                    case "/":
                        display.setText((firstValue[0] / secondValue) + "");
                        break;
                }
                firstValue[0] = 0;
                operation[0] = "+";
            }
        });
    }
}



