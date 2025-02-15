public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius){
        super(radius);
    }
    @Override
    public void resize(int percent){
        System.out.printf("%.2f\n",radius*= percent/100.0);
    }
}
