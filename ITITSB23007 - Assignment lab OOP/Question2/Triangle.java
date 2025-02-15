package Question2;
import java.util.Scanner;
public class Triangle {
    private int x;
    private int y;
    private int z;
    //scanner:
    Scanner sc2= new Scanner(System.in);
    public Triangle(){
        System.out.println("Please enter 3 numbers for the sides of a triangle:");
        int x = sc2.nextInt();
        int y = sc2.nextInt();
        int z = sc2.nextInt();
        if (x>0 && y>0 && z>0){
            this.x= x;
            this.y= y;
            this.z= z;
        }
    }
            public int getX(){
                return this.x;
            }
            public int getY(){
                return this.y;
            }
            public int getZ(){
                return this.z;
            }
    
        public void type(){
        if (x+y<z || x+z<y || y+z<x){
            System.out.println("Not Triangle");
        }
        else if (x==y && y==z){
            System.out.println("Equilateral Triangle");
        }
        else if (x==y || x==z || y==z){
            System.out.println("Isosceles Triangle");
        }
        else if ((x * x + y * y == z * z) || (x * x + z * z == y * y) || (z * z + y * y == x * x)){
            System.out.println("Scalene Triangle");
        }
        }

}