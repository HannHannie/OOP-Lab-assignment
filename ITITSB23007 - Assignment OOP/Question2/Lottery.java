import java.util.Scanner;
import java.util.Random;
public class Lottery {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Random random = new Random();
        System.out.println("How many games do you want to play?");
    // var bonus homework
        int times = sc.nextInt();
        int sum=0;
        int[] money = new int[times];
        int fullywin = 0;
        int win=0;
        {
            
            for (int n=0; n<times; n++ ){

            if ( times > 0)
            {
            System.out.println("Do you want to pick your own ticket numbers (true/false)?");
            boolean yesno = sc.nextBoolean();
            int count=0;

    // case 1: pick your own numbers
                if (yesno)
                {
                    int[] num = new int[6];
                System.out.println("Enter 6 numbers of your ticket (1-49)");
                for (int z = 0; z<6; z++){
                    num[z] = sc.nextInt();
                }
                
                System.out.println("The winning ticket is: ");
                int[] randomnumber = new int[6];
                for (int i=0;i<6;i++){
                    randomnumber[i] = random.nextInt(49)+1;
                    System.out.printf("%d ", randomnumber[i] );
                }
    //compare 2 dãy số
                    for (int z=0; z <6; z++){
                        for (int i=0; i<6; i++) {
                            if (num[z]== randomnumber[i]){
                                count++;
                            }
                        }
                    }
                }

    // case 2: pick random numbers
                else {
                    System.out.println("You have picked the ticket: ");
                    int[] num1 = new int[6];
                for (int j=0;j<6;j++){
                    num1[j] = random.nextInt(49)+1;
                    System.out.printf("%d ", num1[j]);
                }
                System.out.printf("\nThe winning ticket is: ");
                int[] num2 = new int[6];
                for (int k=0;k<6;k++){
                    num2[k] = random.nextInt(49) +1;
                    System.out.printf("%d ", num2[k]);
                }
    //compare 2 dãy số
                    for (int j=0; j <6; j++){
                        for (int k=0; k<6; k++) {
                            if (num1[j]== num2[k]){
                                count++;
                            }
                        }
                    }
                }
                System.out.printf("\nYour ticket has matched %d number(s) \n",count);
    
    //Reward
                if (count>0 && count<=2){
                    System.out.println("You have won $10");
                    money[n]= money[n]+10;
                }
                else if (count ==3){
                    System.out.println("You have won $100");
                    money[n]= money[n]+100;
                }
                else if (count==4){
                    System.out.println("You have won $1000");
                    money[n]= money[n]+1000;
                }
                else if (count==5){
                    System.out.println("You have won $5000");
                    money[n]= money[n]+5000;
                }
                else if (count ==6){
                    System.out.println("You have won $5 million");
                    money[n]= money[n]+5000000;
                    fullywin++;
                }
                else if (count == 0){
                    System.out.println("Better luck next time!");
                }
    //BONUS HOMEWORK
            if(money[n]>0) {win++;};
            sum= sum+ money[n];
            }
    }
    System.out.printf("\nThe number of games won any money: %d", win );
    System.out.printf("\nTotal money won: $%d \n", sum );
    System.out.printf("The number of games matched all 6 numbers: %d", fullywin);
    System.out.printf("\nTotal ticket cost: $%d", times*4 );
    System.out.printf("\nProfit/Loss (won-cost): $%d \n", sum-times*4 );
    sc.close();
}
}
}
