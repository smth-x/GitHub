package MVC.View;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {
    private JTextField text;

    public CalculatorView() {
        initializeUI();
    }

    private void initializeUI() {
        setSize(500, 350);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        text = new JTextField();
        text.setBounds(50, 0, 400, 50);
        add(text);

        JButton b1 = new JButton("1");
        b1.setBounds(50,200,100,50);
        add(b1);

        JButton b2 = new JButton("2");
        b2.setBounds(150,200,100,50);
        add(b2);

        JButton b3 = new JButton("3");
        b3.setBounds(250,200,100,50);
        add(b3);

        JButton b4 = new JButton("4");
        b4.setBounds(50,150,100,50);
        add(b4);

        JButton b5 = new JButton("5");
        b5.setBounds(150,150,100,50);
        add(b5);

        JButton b6 = new JButton("6");
        b6.setBounds(250,150,100,50);
        add(b6);

        JButton b7 = new JButton("7");
        b7.setBounds(50,100,100,50);
        add(b7);

        JButton b8 = new JButton("8");
        b8.setBounds(150,100,100,50);
        add(b8);

        JButton b9 = new JButton("9");
        b9.setBounds(250,100,100,50);
        add(b9);

        JButton b0 = new JButton("0");
        b0.setBounds(150,250,100,50);
        add(b0);

        JButton b10 = new JButton("*");
        b10.setBounds(350,100,100,50);
        add(b10);

        JButton b11 = new JButton("-");
        b11.setBounds(350,150,100,50);
        add(b11);

        JButton b12 = new JButton("+");
        b12.setBounds(350,200,100,50);
        add(b12);

        JButton b13 = new JButton("(");
        b13.setBounds(50,50,100,50);
        add(b13);

        JButton b14 = new JButton(")");
        b14.setBounds(150,50,100,50);
        add(b14);

        JButton b15 = new JButton("^");
        b15.setBounds(250,50,100,50);
        add(b15);

        JButton b16 = new JButton("/");
        b16.setBounds(350,50,100,50);
        add(b16);

        JButton bDel = new JButton("←");
        bDel.setBounds(250,250,100,50);
        add(bDel);

        JButton bClear = new JButton("C");
        bClear.setBounds(50,250,100,50);
        add(bClear);

        JButton bRav= new JButton("=");
        bRav.setBounds(350,250,100,50);
        add(bRav);

        setVisible(true);
    }

    public JTextField getTextField() {
        return text;
    }

    public void setDisplay(String value) {
        text.setText(value);
    }

    public void addActionListenerToButton(String buttonText, ActionListener listener) {
        for (java.awt.Component component : getContentPane().getComponents()) {
            if (component instanceof JButton && ((JButton) component).getText().equals(buttonText)) {
                ((JButton) component).addActionListener(listener);
            }
        }
    }
}