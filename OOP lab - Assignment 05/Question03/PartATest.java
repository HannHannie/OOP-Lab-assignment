import javax.swing.JFrame;
public class PartATest {
    public static void main(String[] args) {
        PartA p= new PartA();
        JFrame a= new JFrame();
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.add(p);
        a.setSize(200, 200);
        a.setVisible(true);
    }
}
