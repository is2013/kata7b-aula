package kata7b;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel{

    private BufferedImage image;
    
    public void setImage(String filename){
        try {
            image = ImageIO.read(new File(filename));
            repaint();
        } catch (IOException ex) {
        }
    }

    @Override
    public void paint(Graphics graphics) {
        if(image == null) return;
        graphics.drawImage(image, 0, 0, null);
    }
    
}
