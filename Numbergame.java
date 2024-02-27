//**********NUMBER GAME**********
import java.util.Random;
import java.util.Scanner;
public class Numbergame {
    public static void main(String args[]){
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        int ran_num = ran.nextInt(1,100);
        int guess_num;
        System.out.println("************ WELCOME WELCOME WELCOME ************");
        System.out.println("   **********          TO           **********   ");
        System.out.println("*****************  NUMBER GAME  *****************");
        System.out.println("Enter Correct Number to match with Random Number Created...");
        System.out.println("You will Have Three Chance to Enter Correct Number...");
        for(int i=1;i<4;i++){
            System.out.println("Your Guess Number is ? : ");
            guess_num = sc.nextInt();
            System.out.println(ran_num);
            if(guess_num == ran_num)
                System.out.println("Congratulation..!! Choice is Great...");
            else{
                if(guess_num>100 || guess_num<1){
                    System.out.println("Please Chosoe between '1 and 100' :");
                    break;
                }
                if(i==3 && guess_num != ran_num){
                    System.out.print("\nAll Three Enetered Number were Wrong..");
                    System.out.println("\n\nRandom Number is : "+ran_num);
                }
                else{
                    System.out.println("Guessed : "+guess_num+"\nChoose Another Number..\n");
                    if(((ran_num)>0 && (ran_num)<20) && ((guess_num)>0 && (guess_num)<=20)){
                        System.out.println("Hint :: You Are in range Between 1 & 20\n");
                    }
                    if(((ran_num)>20 && (ran_num)<=40) && ((guess_num)>20 && (guess_num)<=40)){
                        System.out.println("Hint :: You Are in range Between 21 & 40\n");
                    }
                    if(((ran_num)>40 && (ran_num)<=60) && ((guess_num)>40 && (guess_num)<=60)){
                        System.out.println("Hint :: You Are in range Between 41 & 60\n");
                    }
                    if(((ran_num)>60 && (ran_num)<=80) && ((guess_num)>60 && (guess_num)<=80)){
                        System.out.println("Hint :: You Are in range Between 61 & 80\n");
                    }
                    if(((ran_num)>80 && (ran_num)<=100) && ((guess_num)>80 && (guess_num)<=100)){
                        System.out.println("Hint :: You Are in range Between 80 & 100\n");
                    }
                }
            }
        }
    }
}
