public class Square extends Rectangle {
    private double side=1.0;
    public Square(){
        //gan gia tri mac dinh
    }
    public Square (double side){
        super(side, side);
        this.side=side;
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
        this.side=side;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    //set length = width = side
    @Override
    public void setWidth(double side) {
        this.side=side;
        super.setWidth(side);
    }
    @Override
    public void setLength(double side) {
        this.side=side;
        super.setLength(side);
    }
    @Override
    public String toString() {
        return "A Square with side= "+side+", which is a subclass of "+super.toString();
    }
}
