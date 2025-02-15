public class Staff extends Person{
    private String school;
    private double pay;
    public Staff(String name, String address, String school, double pay){
        super(name, address);
        this.school=school;
        this.pay=pay;
    }
    //input
    public void input2(){
        System.out.println("Enter school: ");
        this.school= sc.nextLine();
        System.out.println("Enter pay: ");
        this.pay= sc.nextDouble();
    }
    public String getSchool(){
        return school;
    }
    public void setSchool(String school){
        this.school= school;
    }
    public double getPay(){
        return pay;
    }
    public void setPay(double pay){
        this.pay= pay;
    }
    public String toString(){
        return "Staff["+super.toString()+", school= "+school+", pay= "+pay+"]";
    }
}
