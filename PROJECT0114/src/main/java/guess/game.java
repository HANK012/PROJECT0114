package guess;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
public class game {
    public static void main(String[] args) {
        Random random=new Random();
        int secret=random.nextInt(10)+1;
        System.out.println(secret);
        Scanner scn = new Scanner(System.in);
        int number = 0;
        while (number != secret) {                 //while(BOOLEAN)
            System.out.println("please enter an number");
            number = scn.nextInt();
            if (number<secret)
            {
                System.out.println("higher");
            } else if (number>secret){
                System.out.println("lower");
            }
            else {
                System.out.println("great! the number is "+ number);
            }
        }
        int i=0;
        do {
            System.out.println(i);
            i++;
        } while (i<3);


    }

}