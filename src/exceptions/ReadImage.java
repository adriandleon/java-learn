package exceptions;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ReadImage {

    public static void main(String[] args) {

        ImageFrame myFrame = new ImageFrame();
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class ImageFrame extends JFrame {

    ImageFrame() {
        setTitle("Frame with Image");
        setBounds(750, 300, 300, 200);

        ImagePanel myPanel = new ImagePanel();
        add(myPanel);
    }
}

class ImagePanel extends JPanel {

    private Image mImage;

    ImagePanel() {
        try {
            mImage = ImageIO.read(new File("src/grapdhics/images/plus5.png"));
        } catch (IOException e) {
            System.out.println("Image file not found");
        }
    }

    @Override
    protected void paintComponent(Graphics g) throws NullPointerException {
        super.paintComponent(g);

        try {
            int width = mImage.getWidth(this);
            int height = mImage.getHeight(this);

            for (int i = 0; i < 300; i++) {
                for (int j = 0; j < 200; j++) {
                    if (i + j > 0) {
                        g.copyArea(0, 0, width, height, width * i, height * j);
                    }
                }
            }

            g.drawImage(mImage, 0, 0, null);
        } catch (NullPointerException e) {
            g.drawString("Cannot show the image", 10, 20);
        }
    }
}