public class TriangleTesting {
    public static void main(String[] args) {
        Point2De t1= new Point2De();
        Point2De t2= new Point2De(2, 3);
        Point2De t3= new Point2De(5, 6);

        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());
        System.out.printf("The perimeter is %.2f\n", t1.perimeter(t1,t2,t3));
        System.out.printf("The area is %.2f\n", t1.area(t1, t2, t3));
    }
}
