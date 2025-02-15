import javax.swing.JPanel;
import java.awt.Graphics;
public class Circle extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int width= getWidth();
        int height= getHeight();
        for(int i=0; i<12; i++){
        int changeWidth= width*(i+1)/12;
        int changeHeight= height*(i+1)/12;
        int changeX=(width/2)-width*(i+1)/24;
        int changeY=(height/2)-height*(i+1)/24;
        g.drawArc(changeX, changeY, changeWidth, changeHeight, 0, 360);
    }
}
}
