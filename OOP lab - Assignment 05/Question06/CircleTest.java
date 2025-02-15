import javax.swing.JFrame;
public class CircleTest {
    public static void main(String[] args) {
        Circle c= new Circle();
        JFrame b= new JFrame();
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.add(c);
        b.setSize(100, 100);
        b.setVisible(true);
    }
}
