public class Shape{
    private String color= "red";
    private boolean filled= true;
    public Shape(){
        //constructor mac dinh
    }
    public Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public String toString(){
        return "A Shape with color of "+color+" and filled/Not filled "+filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public boolean isFilled(){
        return true;
    }
}