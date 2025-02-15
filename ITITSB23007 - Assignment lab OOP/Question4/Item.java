package Question4;
import java.util.Scanner;
public class Item {
    private int id;
    private int id2;
    private String name;
    private double price;
    private int numofitem;
    double money=0;
    
    Scanner sc4= new Scanner(System.in);
    public Item(){
    System.out.printf("Enter a new number ID for order:");
    int id = sc4.nextInt();
    this.id=id;
    System.out.printf("How many items in the order: ");
    int numofitem= sc4.nextInt();
    this.numofitem =numofitem;
    for (int i=0; i < numofitem; i++){
        System.out.printf("Please enter the ID for item %d:", (i+1));
        int id2 = sc4.nextInt();
        this.id2=id2;
        System.out.printf("Please enter the name for item %d:", (i+1));
        String name= sc4.next();
        this.name=name;
        System.out.printf("Please enter the price for item %d:", (i+1));
        double price= sc4.nextDouble();
        this.price=price;
        money=money+price;
    }}

    public int getNumofitem() {
        return numofitem;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getId2(){
        return id2;
    }

    public void bill(){
        System.out.printf("You have a new order with ID:" + this.id);
        System.out.printf("\nIn the order, you have %d items", getNumofitem());
        System.out.printf("\nThe average price in the order is:%.2f\n", money/getNumofitem());
    }
   
}