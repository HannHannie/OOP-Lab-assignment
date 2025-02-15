public class MyCuboid {
    private MyPoint3D vertex1;
    private MyPoint3D vertex2;

    //đảm bảo rằng đối tượng luôn ở trạng thái hợp lệ ngay sau khi được tạo.
    public MyCuboid(){
        this.vertex1= new MyPoint3D(0,0,0);
        this.vertex2= new MyPoint3D(1,1,1);
    }
    public MyCuboid(int x1, int y1, int z1,
                    int x2, int y2, int z2){
        this.vertex1= new MyPoint3D(x1, y1, z1);
        this.vertex2= new MyPoint3D(x2, y2, z2);
    }

    public String toString(){
        return "["+vertex1+"; "+vertex2+"]";
    }

    //setter & getter
    public MyPoint3D getVertex1() {
        return vertex1;
    }
    public void setVertex1(MyPoint3D vertex1) {
        this.vertex1 = vertex1;
    }
    public MyPoint3D getVertex2() {
        return vertex2;
    }
    public void setVertex2(MyPoint3D vertex2) {
        this.vertex2 = vertex2;
    }
}
