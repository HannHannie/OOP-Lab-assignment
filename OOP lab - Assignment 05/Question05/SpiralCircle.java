import javax.swing.JPanel;
import java.awt.Graphics;
public class SpiralCircle extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int width= getWidth();
        int height= getHeight();
        for (int i = 0; i < 20; i++) { 
            int changeWidth = i * width / 10;
            int changeHeight = i * height / 10;
            
            int changeX = (width / 2) - (changeWidth / 2);
            int changeY = (height / 2) - (changeHeight / 2)-height/20;
            int changeX2 = (width / 2) - (changeWidth / 2)+width/20;
            if(i%2==0){
            g.drawArc(changeX, changeY, changeWidth, changeHeight, 0, -180);
            }
            else {
            g.drawArc(changeX2, changeY, changeWidth, changeHeight, 0, 180);
            }
        }
    }
}