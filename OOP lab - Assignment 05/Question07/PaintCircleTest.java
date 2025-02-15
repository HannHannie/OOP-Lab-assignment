import javax.swing.JFrame;
public class PaintCircleTest {
    public static void main(String[] args) {
        PaintCircle c= new PaintCircle();
        JFrame b= new JFrame();
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.add(c);
        b.setSize(100, 100);
        b.setVisible(true);
    }
}
