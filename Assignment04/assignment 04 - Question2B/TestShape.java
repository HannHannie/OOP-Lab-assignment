public class TestShape {
    public static void main(String[] args) {
    Shape s1 = new Circle(5.5, "red", false); // Upcast Circle to Shape
System.out.println(s1); //Circle
System.out.println(s1.getArea()); //Circle
System.out.println(s1.getPerimeter()); //Circle
System.out.println(s1.getColor());// Shape
System.out.println(s1.isFilled());// Shape
//System.out.println(s1.getRadius()); - error because Shape does not have a getRadius() method

Circle c1 = (Circle)s1; // Downcast back to Circle
System.out.println(c1); //Circle
System.out.println(c1.getArea());//Circle
System.out.println(c1.getPerimeter());//Circle
System.out.println(c1.getColor());//Shape
System.out.println(c1.isFilled());//Shape
System.out.println(c1.getRadius());//Circle

//Shape s2 = new Shape(); - error because Shape is an abstract class and cannot be instantiated directly

Shape s3 = new Rectangle(1.0, 2.0, "red", false); // Upcast
System.out.println(s3);//Rectangle
System.out.println(s3.getArea());//Rectangle
System.out.println(s3.getPerimeter());//Rectangle
System.out.println(s3.getColor());//Shape
//System.out.println(s3.getLength()); - error because s3 is of type Shape, getLength() isn’t accessible here

Rectangle r1 = (Rectangle)s3; // downcast
System.out.println(r1); //Rectangle
System.out.println(r1.getArea());//Rectangle
System.out.println(r1.getColor());//Shape
System.out.println(r1.getLength());//Rectangle

Shape s4 = new Square(6.6); // Upcast
System.out.println(s4);//Square
System.out.println(s4.getArea());//Square
System.out.println(s4.getColor());
//System.out.println(s4.getSide()); - error because s4 is of type Shape, which does not have getSide()
// Take note that we downcast Shape s4 to Rectangle,
// which is a superclass of Square, instead of Square
Rectangle r2 = (Rectangle)s4;
System.out.println(r2);//Square
System.out.println(r2.getArea());//Square
System.out.println(r2.getColor());
//System.out.println(r2.getSide()); - error because Rectangle does not have a getSide() method
System.out.println(r2.getLength());//Square

// Downcast Rectangle r2 to Square
Square sq1 = (Square)r2;
System.out.println(sq1);//Square
System.out.println(sq1.getArea());//Square
System.out.println(sq1.getColor());
System.out.println(sq1.getSide());//Square
System.out.println(sq1.getLength());//Square
}
}