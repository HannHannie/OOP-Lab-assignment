package Question3;
import java.util.Scanner;
import java.lang.Math;
public class Point {
    // variable
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double distance;

    Scanner sc3= new Scanner(System.in);
    //point
    public Point(){
        System.out.println("Enter the first point x and y:");
        double x1 = sc3.nextDouble();
        this.x1=x1;
        double y1= sc3.nextDouble();
        this.y1=y1;
        System.out.println("Enter the second point x and y:");
        double x2 = sc3.nextDouble();
        this.x2=x2;
        double y2= sc3.nextDouble();
        this.y2=y2;
        double distance= Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        this.distance=distance;
    }
    
    //getter
    public double getX1(){
        return x1;
    }
    public double getY1(){
        return y1;
    }
    public double getX2(){
        return x2;
    }
    public double getY2(){
        return y2;
    }
    public double getDistance(){
        return distance;
    }

    public void distance(){
        System.out.printf("The distance between X and Y is: %.2f", getDistance());
    }

    
}
