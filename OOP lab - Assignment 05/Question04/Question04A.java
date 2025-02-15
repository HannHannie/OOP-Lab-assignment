import java.awt.Graphics;
import javax.swing.JPanel;
public class Question04A extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int width= getWidth();
        int height= getHeight();
        for(int i=0; i<15; i++){
            int a= height*i/15;
            int b= width*i/15;
            g.drawLine(0, a, b, height);

        // Part B
            int e= height - height*i/15;
            int f= width - width*i/15;
            g.drawLine(width, a, f, height);

            g.drawLine(width, e, f, 0);
            g.drawLine(0, e, b, 0);
        }
    }
}