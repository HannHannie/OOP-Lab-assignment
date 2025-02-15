import javax.swing.JFrame;
public class Question04Test {
    public static void main(String[] args) {
        Question04A panel = new Question04A();
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230, 250);
        application.setVisible(true);
}
}
