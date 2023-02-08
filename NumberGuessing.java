//AKSHAT SHRIVASTAVA//

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {

    NumberGuessing x= new NumberGuessing();
    static int count = 2;
    static Random r = new Random();
    static int num2 = r.nextInt(100);

    public static void main(String[] args) {
        guess();
    }

    public static void guess() {

        Scanner sc = new Scanner(System.in);
        //System.out.println(num2);
        System.out.println("Guess the Number : ");
        int num1 = sc.nextInt();

        while (count < 3) {
            if (count == 0) {
                System.out.println("Chances exhausted");
                System.exit(0);
            }
            if (num1 == num2) {
                System.out.println("Right guess !! ");
                calculation();
            }
            else if(num1>num2){
                System.out.println("Number you guessed is greater than the generated number");
                calculation();
            }
            else if(num1<num2){
                System.out.println("Number you guessed is smaller than the generated number");
                calculation();
            }

            else {
                System.out.println("You have " + count + " chances left");
                calculation();
            }
        }
    }

    public static void calculation() {
        count--;
        Scanner k = new Scanner(System.in);
        System.out.println("Do you want to continue: yes/no? ");
        char ch = k.next().charAt(0);
        int c=(int)ch;

        switch (c) {
            case 121:
                guess();
                break;
            case 110: {
                System.out.println("Thank you for playing.");
                System.exit(0);
                break;
            }
            default:
                System.out.println("Invalid Input.");
                System.exit(0);
        }

    }
}