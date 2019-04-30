import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class main {

    public static void readImage(File picture) throws IOException {

        BufferedImage pic = ImageIO.read(picture);
        int picWidth = pic.getWidth();
        int picHeight = pic.getHeight();
        Color c = new Color(pic.getRGB(8, 4));
        System.out.print(pic.getWidth() + " wide and " + pic.getHeight() + " tall\n" + c.getRed());
        int pixel[][] = new int[picWidth][picHeight];
//gray value means all three in rgb are same value, just grab
//one color value, to detranslate just set all three to same color
//check if encoded in hex or 0-255 int

    }

    public static void main(String[] Args) {
        File image1 = new File("images/blackwhite.jpg");
        File image2 = new File("images/Grayscale-Arial-City-View-square.jpg");
        File image3 = new File("images/8-bit-256-x-256-Grayscale-Lena-Image.png");

        try {
            readImage(image1);
        }
        catch(Exception e) {
            System.out.println("Image no worky!");
        }
    }
}
