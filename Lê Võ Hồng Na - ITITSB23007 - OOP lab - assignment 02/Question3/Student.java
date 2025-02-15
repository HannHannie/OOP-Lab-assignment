public class Student extends Person{
    private String program;
    private int year;
    private double fee;
    public Student(String name, String address, String program, int year, double fee){
        super(name, address); //calling constructor of the Person class
        this.program=program;
        this.year= year;
        this.fee=fee;
    }
    //input:
    public void input1(){
        System.out.println("Enter program: ");
        this.program= sc.nextLine();
        System.out.println("Enter year: ");
        this.year= sc.nextInt();
        System.out.println("Enter fee: ");
        this.fee= sc.nextDouble();
    }
    public String getProgram(){
        return program;
    }
    public void setProgram(String program){
        this.program= program;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year= year;
    }
    public double getFee(){
        return fee;
    }
    public void setFee(double fee){
        this.fee=fee;
    }
    public String toString(){
        //return  "name: " +super.getName()+
        //        ", address: "+ super.getAddress()+
        //        ", program: "+ this.program+
        //       ", year: "+ this.year+
        //        ", fee: "+ this.fee;
        return "Student["+super.toString()+", program: "+ this.program+", year: "+ this.year+", fee: "+ this.fee+"]";
    }
    
}
