import java.awt.Graphics;
import javax.swing.JPanel;

public class PartA extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int width= getWidth();
        int height= getHeight();
        for(int i=0; i<15; i++){
            int x2= width*i/15;
            int y2= height-height*i/15;
            g.drawLine(0, 0, x2, y2);
        //Part B
            g.drawLine(width, height, x2, y2);
            int y3= height*i/15;
            g.drawLine(width, 0, x2, y3);
            g.drawLine(0, height, x2, y3);
        }
    }
}