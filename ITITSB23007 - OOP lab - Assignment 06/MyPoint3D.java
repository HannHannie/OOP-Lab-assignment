public class MyPoint3D{
    private int x;
    private int y;
    private int z;
    public MyPoint3D(){
        this.x=0;
        this.y=0;
        this.z=0;
    }
    public MyPoint3D(int x, int y, int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public String toString(){
        return "("+x+", "+y+", "+z+")";
    }
    //setter & getter
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getZ() {
        return z;
    }
    public void setZ(int z) {
        this.z = z;
    }
}