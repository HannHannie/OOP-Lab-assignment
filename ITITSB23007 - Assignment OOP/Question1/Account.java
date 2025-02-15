public class Account{
    private double balance;

    public Account(double initialBalance){
        if (initialBalance>0){
            this.balance= initialBalance;
        }
        else 
            this.balance=0;
    }
    //setter
    public void Credit(double amount){
        balance +=amount;
    }
    //getter
    public double getBalance(){
        return balance;
    }
}