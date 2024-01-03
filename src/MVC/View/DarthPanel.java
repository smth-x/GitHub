package MVC.View;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class DarthPanel extends JPanel {
    private int xPos = -96;
    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        BufferedImage image;
        try {
            image = ImageIO.read(new File("res/DarthVader.png"));
            System.out.println("panel >>>");
            g.drawImage(image, xPos, -22, null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}
