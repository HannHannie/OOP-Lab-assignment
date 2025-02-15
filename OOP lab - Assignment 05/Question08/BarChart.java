import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Graphics;

public class BarChart extends JPanel {
    private int[] number= new int[5];

    public BarChart() {
        for (int i = 0; i < 5; i++) {
            String lengthInput = JOptionPane.showInputDialog("Enter the length of the bar " + (i + 1));
            number[i] = Integer.parseInt(lengthInput);
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Random random = new Random();
        int width = getWidth();
        int height = getHeight();
        for (int i = 0; i < 5; i++) {
            // Generate a random color
            int comp1 = random.nextInt(256);
            int comp2 = random.nextInt(256);
            int comp3 = random.nextInt(256);
            Color randomColor = new Color(comp1, comp2, comp3);
             //do dai bar chart
            int y= height/12;
            if (number[i]<=width){
            int x= number[i];
            // toa do
            int coorY= height/12+2*height*i/12;
            g.setColor(randomColor);
            g.fillRect(0, coorY, x, y);
            }
        }
    }
}