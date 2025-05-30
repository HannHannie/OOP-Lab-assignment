public class Circle extends Shape {
    private double radius=1.0;
    public Circle(){
        // gan gia tri mac dinh
    }
    public Circle(double radius){
        this.radius= radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius=radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    public String toString(){
        return "A Circle with radius= "+radius+", which is a subclass of "+super.toString()+"";
    }
}
