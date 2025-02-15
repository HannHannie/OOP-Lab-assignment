import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args) {
        Account account1= new Account(50.00);
        Account account2= new Account(-7.53);
        System.out.println("account1 balance: $" +account1.getBalance());
        System.out.println("account2 balance: $" +account2.getBalance());

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter deposit amount for account1:");
        double amount= sc.nextDouble();
        account1.Credit(amount);
        System.out.println("adding " +amount+ " to account1 balance");
        System.out.println("account1 balance: $" +account1.getBalance());
        System.out.println("account2 balance: $" +account2.getBalance());

        System.out.println("Enter deposit amount for account2:");
        double amount2= sc.nextDouble();
        account2.Credit(amount2);
        System.out.println("adding " +amount2+ " to account1 balance");
        System.out.println("account1 balance: $" +account1.getBalance());
        System.out.println("account2 balance: $" +account2.getBalance());

        sc.close();
    }
}
