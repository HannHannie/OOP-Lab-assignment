import javax.swing.JFrame;
public class BarChartTest {
    public static void main(String[] args) {
        BarChart b= new BarChart();
        JFrame a= new JFrame();
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.add(b);
        a.setSize(500, 500);
        a.setVisible(true);
}
}
