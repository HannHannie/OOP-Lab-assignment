package Question1;
import java.util.Scanner;

public class Rectangle{
        private int width;
        private int height;
    //constructor
        Scanner sc = new Scanner(System.in);
        public Rectangle(){
            System.out.println("Enter width: ");
            int width = sc.nextInt();
            if (width>0){
                this.width= width;
            }
            else {
                System.out.println("Warning: input width is negative!");
                this.width=1;
            };
            System.out.println("Enter height: ");
            int height = sc.nextInt();
            if (height>0){
                this.height= height;
            }
            else {
                System.out.println("Warning: input height is negative!");
                this.height=1;
            }

        }
    //getter
        public int getWidth() {
            return this.width;
        }
        public int getHeight() {
            return this.height;
        }
    //Sketch
        public void sketch(){
            for (int i= 0; i<height; i++ ){
                for (int j=0; j<width; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
}

