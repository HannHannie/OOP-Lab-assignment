import javax.swing.JFrame;
public class SpiralSquareTest{
    public static void main(String[] args) {
        SpiralSquare s = new SpiralSquare();
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(s);
        application.setSize(250, 250);
        application.setVisible(true);
    }
}