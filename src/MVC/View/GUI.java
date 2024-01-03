package MVC.View;

import javax.swing.*;

public class GUI extends JFrame {
    DarthPanel darthPanel;
    public GUI(DarthPanel panel){
        this.darthPanel = panel;
        settings();
        initComponent();
    }
    public void settings(){
        setSize(300,200);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Animation");
    }
    public void initComponent() {
        darthPanel.setBounds(30,25,97,110);
        darthPanel.repaint();
        darthPanel.setVisible(true);
        add(darthPanel);
    }
}
