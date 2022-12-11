package CoreJava;

import java.util.Scanner;

public class FindTheLargestAmongThreeNumbers_P10
{
    public static void main(String[] args)
    {
        System.out.println("The Largest Among Three Numbers");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number Value :- ");
        int num1=sc.nextInt();

        System.out.println("Enter Second Number Value :- ");
        int num2=sc.nextInt();

        System.out.println("Enter Third Number Value :- ");
        int num3=sc.nextInt();

        if((num1>num2)&&(num1>num3))
        {
            System.out.println(num1+ " Number1 is Maximum :");
        }
        else if ((num2>num1)&&(num2>num3))
        {
            System.out.println(num2+ " Number2 is Maximum :");
        }
        else
        {
            System.out.println(num3+ " Number3 is Maximum");
        }
    }
}
