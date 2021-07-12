package utils;

import java.awt.Image;
import java.awt.MediaTracker;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author ahnitam
 */
public class Imagem {
    @SuppressWarnings("empty-statement")
    public static ImageIcon resize(String url) throws MalformedURLException{
        URL imageUrl = new URL(url);
        ImageIcon originalImage = new ImageIcon(imageUrl);
        
        while(originalImage.getImageLoadStatus() == MediaTracker.LOADING);
        
        Image image = originalImage.getImage().getScaledInstance(200, 300, Image.SCALE_SMOOTH);
        
        return new ImageIcon(image);
    }
}
