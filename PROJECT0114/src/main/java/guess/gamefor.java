package guess;

import java.util.Random;
import java.util.Scanner;

public class gamefor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int secret= new Random().nextInt(10)+1;
        System.out.println(secret);

        for (int i=1;i<=4;i++)
        {
            System.out.println("please enter the number:("+i+"/4):");
            int number=scanner.nextInt();
            System.out.println("the "+i+" time: "+number);
          if (number>secret)
          {
              System.out.println("lower");
          }
          else if (number<secret)
              System.out.println("higher");
          else {
              System.out.println("great! the secret is "+number);
          }break;

        }
        System.out.println("end");
    }
}
   // int sum=0;
//        for (int i=0;i<=50;i++)
//        {
//            sum=sum+i;
//        }
//        System.out.println(sum);
//        Scanner scanner=new Scanner(System.in);
