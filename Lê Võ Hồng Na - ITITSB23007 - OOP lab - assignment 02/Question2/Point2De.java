public class Point2De {
    private int x;
    private int y;
    public Point2De(){
        this.x=0;
        this.y=0;
    }
    public Point2De(int x, int y){
        this.x=x;
        this.y=y;
    }
    //copy constructor
    public Point2De(Point2De a){
        this.x= a.x;
        this.y= a.y;
    }
    public String toString(){
        return "("+this.x+","+this.y+")";
    }
    public static double distance1(Point2De a1, Point2De a2){
        return Math.sqrt(Math.pow(a1.x - a2.x, 2) + Math.pow(a1.y - a2.y, 2));
    }
    public double distance2(Point2De a3) {
        return Math.sqrt(Math.pow(this.x - a3.x, 2) + Math.pow(this.y - a3.y, 2));
    }
    public double perimeter(Point2De p1, Point2De p2, Point2De p3){
        double d1= distance1(p2, p3);
        double d2= p1.distance2(p3);
        double d3= p1.distance2(p3);
        return (d1+d2+d3);
    }
    public double area(Point2De p1, Point2De p2, Point2De p3){
        double d1= distance1(p2, p3);
        double d2= p1.distance2(p3);
        double d3= p1.distance2(p3);
        double C1= d1+d2+d3;
        return Math.sqrt(C1*(C1-d1)*(C1-d2)*(C1-d2));
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
