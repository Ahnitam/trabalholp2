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
    public static ImageIcon resize(String url, int largura, int altura) throws MalformedURLException{
        URL imageUrl = new URL(url);
        ImageIcon originalImage = new ImageIcon(imageUrl);
        
        while(originalImage.getImageLoadStatus() == MediaTracker.LOADING);
        
        Image image = originalImage.getImage().getScaledInstance(largura, altura, Image.SCALE_SMOOTH);
        
        return new ImageIcon(image);
    }
    public static ImageIcon resize(ImageIcon originalImage, int largura, int altura) throws MalformedURLException{
        Image image = originalImage.getImage().getScaledInstance(largura, altura, Image.SCALE_SMOOTH);
        
        return new ImageIcon(image);
    }
}
