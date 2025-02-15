import javax.swing.JPanel;
import java.awt.Graphics;

public class SpiralSquare extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width= getWidth();
        int height= getHeight();
        
        for (int i=0; i<10; i++){
            int widthplus= (i+1)*width/10;
            int heightplus= (i+1)*height/10;
            int x= width/2;
            int y= height/2;
            int down= y+heightplus;
            int up= y-heightplus;
            int left= x-widthplus;
            int right= x+widthplus;
            int x1= x+i*width/10;
            int y1= y-i*height/10;

            g.drawLine(x1, y1, x1, down);
            g.drawLine(x1, down, left, down);
            g.drawLine(left, down, left, up);
            g.drawLine(left, up, right, up);
        }
    }
}