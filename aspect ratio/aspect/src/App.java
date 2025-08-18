import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class App {
    public static void main(String[] args) throws Exception {
        obtenerAspect_simplificado("src/1.jpg");
        obtenerAspect_simplificado("src/2.png");
        obtenerAspect_simplificado("src/3.png");
        obtenerAspect_simplificado("src/4.jpg");
        obtenerAspect_simplificado("src/5.jpg");
    }

    public static void obtenerAspect_simplificado(String ruta) throws IOException {
        BufferedImage img = ImageIO.read(new File(ruta));
        if (img == null) {
            throw new IOException("No se pudo leer la imagen desde " + ruta);
        }
        int width = img.getWidth();
        int height = img.getHeight();
        System.out.println("width: " + width + " height: " + height);

        aspect_ratio(width, height);
    }

    public static void aspect_ratio(int a, int b) {
        int num1 = a, num2 = b, r = 0;
        while(b != 0){
            r = a % b;
            a = b;
            b = r;
        }
        //System.out.println("maximo comun divisor de " + "(" + num1 + "," + num2 + ")" + " = " + a);
        int w = num1 / a;        
        int h = num2 / a;        
        System.out.println("Simplificada: " + w + ":" + h + "\n");
    }
}
