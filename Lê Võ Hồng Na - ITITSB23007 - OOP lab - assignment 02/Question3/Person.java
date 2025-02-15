import java.util.Scanner;
public class Person {
    private String name;
    private String address;
    public Person(String name, String address){
        this.name=name;
        this.address=address;
    }

    //input
    Scanner sc= new Scanner(System.in);
    public void input(){
        System.out.println("Enter name: ");
        this.name= sc.nextLine();
        System.out.println("Enter address: ");
        this.address= sc.nextLine();
    }
    //setter and getter
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String toString(){
        return "Person[name="+ this.name+", address="+ this.address+"]";
    }
}
