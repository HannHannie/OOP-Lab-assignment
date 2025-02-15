import java.util.Scanner;
public class Point2D{
    private int x;
    private int y;
    Scanner sc= new Scanner(System.in);
    public Point2D(){
        this.x=0;
        this.y=0;
    }
    public Point2D(int x, int y){
        this.x=x;
        this.y=y;
    }
    public Point2D(Point2D p){
//create the copy constructor
        this.x= p.x;
        this.y= p.y;
    }
    public void input(){
        System.out.println("Enter x coordinate:");
        this.x =sc.nextInt();
        System.out.println("Enter y coordinate:");
        this.y =sc.nextInt();
    }
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    public void move(int x, int y) {
        this.x=x;
        this.y=y;
    }

    public boolean isOrigin() {
        System.out.println("Is point x at the origin?:");
        if(this.x==0 && this.y==0){
            System.out.println("true");
        }
        else System.out.println("false");
        return true;
    }

    public double distance(Point2D p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }
    public static double distance(Point2D p1, Point2D p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }
// setter X
    public void setX(int x) {
        this.x = x;
    }
//getter X
    public int getX() {
        return x;
    }
//setter Y
    public void setY(int y) {
        this.y = y;
    }
//getter Y
    public int getY() {
        return y;
    }
}