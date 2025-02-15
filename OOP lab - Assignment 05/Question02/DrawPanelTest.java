import javax.swing.JFrame;
public class DrawPanelTest {
    public static void main(String[] args) {
        DrawPanel panel = new DrawPanel();
        JFrame application = new JFrame();
//Đối tượng JFrame có tên application được tạo. JFrame là cửa sổ chính trong Swing, trong đó bạn có thể thêm các thành phần như JPanel.
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230, 250);
        application.setVisible(true);
    }
}
