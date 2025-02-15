import javax.swing.JFrame;
public class SpiralCircleTest {
    public static void main(String[] args) {
        SpiralCircle c= new SpiralCircle();
        JFrame b= new JFrame();
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.add(c);
        b.setSize(500, 500);
        b.setVisible(true);
    }
}
