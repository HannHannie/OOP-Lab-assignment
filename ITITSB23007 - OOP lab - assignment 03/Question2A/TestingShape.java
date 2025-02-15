public class TestingShape {
    public static void main(String[] args) {
    
    //Shape
        Shape sh1= new Shape();
        System.out.println(sh1.toString());

        Shape sh2= new Shape("green", false);
        System.out.println(sh2.toString());
    //circle   
        Circle c1= new Circle();
        Circle c2= new Circle(12);
        Circle c3= new Circle(14, "green", false);
        System.out.println(c1.toString());
        System.out.printf("Perimeter: %.2f\n", c1.getPerimeter());
        System.out.printf("Area: %.2f\n", c1.getArea());

        System.out.println(c2.toString());
        System.out.printf("Perimeter: %.2f\n", c2.getPerimeter());
        System.out.printf("Area: %.2f\n", c2.getArea());

        System.out.println(c3.toString());
        System.out.printf("Perimeter: %.2f\n", c3.getPerimeter());
        System.out.printf("Area: %.2f\n", c3.getArea());
    //Rectangle
        Rectangle r1= new Rectangle();
        System.out.println(r1);
        System.out.println("Perimeter: "+r1.getPerimeter());
        System.out.println("Area: "+r1.getArea());

        Rectangle r2= new Rectangle(12, 23);
        System.out.println(r2);
        System.out.println("Perimeter: "+r2.getPerimeter());
        System.out.println("Area: "+r2.getArea());

        Rectangle r3= new Rectangle(15.5, 25, "pink", false);
        System.out.println(r3);
        System.out.println("Perimeter: "+r3.getPerimeter());
        System.out.println("Area: "+r3.getArea());
    //Square
        Square s1= new Square();
        System.out.println(s1);
        Square s2= new Square(10);
        System.out.println(s2);
        Square s3= new Square(20, "purple", false);
        System.out.println(s3);
    }
}
