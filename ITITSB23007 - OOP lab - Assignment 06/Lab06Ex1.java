import java.util.Scanner;

public class Lab06Ex1 {
    public static void main (String [] args)  {
      Scanner scanner = new Scanner(System.in);

      MyCuboid cuboid1 = readCuboid("Enter 1st cuboid: ", scanner);
      MyCuboid cuboid2 = readCuboid("Enter 2nd cuboid: ", scanner);

      System.out.println("1st cuboid: " + cuboid1);
      System.out.println("2nd cuboid: " + cuboid2);

      int volume = commonVolume(cuboid1, cuboid2);
      System.out.println("Volume of common space = " + volume);

   }

      //-----------------------------------------------------
      // Read inputs for a new cuboid
      //-----------------------------------------------------
   public static MyCuboid readCuboid (String prompt, Scanner scan) {
         System.out.println(prompt); //để output ra được đoạn prompt, vd như "Enter 1st cuboid"
         // 1st point
         int x1= scan.nextInt();
         int y1= scan.nextInt();
         int z1= scan.nextInt();
         // 2nd point
         int x2= scan.nextInt();
         int y2= scan.nextInt();
         int z2= scan.nextInt();
         return new MyCuboid(x1, y1, z1, x2, y2, z2);
   }

      //-----------------------------------------------------
      // Returns the volume of common space of two cuboids
      //-----------------------------------------------------
   public static int commonVolume(MyCuboid cuboid1, MyCuboid cuboid2){
      // so sanh 2 cai cuboid co giao nhau khong, khong giao thi output bang 0, neu giao thi lay gia tri...

      //xac dinh vi tri cua tung vertex
      //vertex 1 cua cuboid 1
      int x1Min= Math.min(cuboid1.getVertex1().getX(),cuboid1.getVertex2().getX());
      int y1Min= Math.min(cuboid1.getVertex1().getY(),cuboid1.getVertex2().getY());
      int z1Min= Math.min(cuboid1.getVertex1().getZ(),cuboid1.getVertex2().getZ());
      //vertex 2 cua cuboid 1
      int x1Max= Math.max(cuboid1.getVertex1().getX(),cuboid1.getVertex2().getX());
      int y1Max= Math.max(cuboid1.getVertex1().getY(),cuboid1.getVertex2().getY());
      int z1Max= Math.max(cuboid1.getVertex1().getZ(),cuboid1.getVertex2().getZ());

      //vertex 1 cua cuboid 2
      int x2Min= Math.min(cuboid2.getVertex1().getX(),cuboid2.getVertex2().getX());
      int y2Min= Math.min(cuboid2.getVertex1().getY(),cuboid2.getVertex2().getY());
      int z2Min= Math.min(cuboid2.getVertex1().getZ(),cuboid2.getVertex2().getZ());
      //vertex 2 cua cuboid 2
      int x2Max= Math.max(cuboid2.getVertex1().getX(),cuboid2.getVertex2().getX());
      int y2Max= Math.max(cuboid2.getVertex1().getY(),cuboid2.getVertex2().getY());
      int z2Max= Math.max(cuboid2.getVertex1().getZ(),cuboid2.getVertex2().getZ());

      //Overlap
      int xOverlap= Math.max(0, Math.min(x1Max, x2Max)-Math.max(x1Min, x2Min));
      int yOverlap= Math.max(0, Math.min(y1Max, y2Max)-Math.max(y1Min, y2Min));
      int zOverlap= Math.max(0, Math.min(z1Max, z2Max)-Math.max(z1Min, z2Min));

      return xOverlap*yOverlap*zOverlap;
   }
}