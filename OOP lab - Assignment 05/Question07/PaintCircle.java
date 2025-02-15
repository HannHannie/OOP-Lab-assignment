import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Random;
public class PaintCircle extends JPanel{
    Random r= new Random();
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        // this.setBackground(Color.WHITE);

        int width= getWidth();
        int height= getHeight();
       
        for(int i=0; i<5; i++){
            //random color's components
            int comp1= r.nextInt(256);
            int comp2= r.nextInt(256);
            int comp3= r.nextInt(256);

        Color randomColor= new Color(comp1, comp2, comp3);
            //Position and size
            int changeWidth= width-i*width/5;
            int changeHeight= height-i*height/5;
            int changeX=width*i/10;
            int changeY=height*i/10;
            g.setColor(randomColor);
            g.fillOval(changeX, changeY, changeWidth, changeHeight);
        }
    }
}