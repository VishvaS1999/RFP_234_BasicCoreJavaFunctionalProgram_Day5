package CoreJava;

import java.util.Scanner;

public class FlipCoinHeadTails_p1
{
    public static void main(String[] args)
    {
        int headsCount=0, tailsCount=0;

        System.out.println("Please Enter The number : ");
        Scanner sc=new Scanner(System.in);
        int numOfFlip=sc.nextInt();

        for(int i=1; i<=numOfFlip; i++)
        {
            double random=Math.random();
            System.out.print(i+" "+random);

            if(random<0.5)
            {
                tailsCount++;
                System.out.println(" Tails ");
            }
            else
            {
                headsCount++;
                System.out.println(" Heads ");

            }
        }
        System.out.println("Number Of Tails : " +tailsCount);
        System.out.println("Number Of Heads : " +headsCount);
        System.out.println("Percentage Of Tails : " +(double) tailsCount/numOfFlip*100);
        System.out.println("Percentage Of Heads : " +(double) headsCount/numOfFlip*100);

           }
}
