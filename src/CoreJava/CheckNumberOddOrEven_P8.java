package CoreJava;

import java.util.Scanner;

public class CheckNumberOddOrEven_P8
{
    public static void main(String[] args)
    {
        System.out.println("Check Number is Odd Or Even");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number :-");
        int number=sc.nextInt();

        if(number % 2 == 0)
        {
            System.out.println(number+ " Number is Even ");
        }
        else
        {
            System.out.println(number+ " Number is Odd ");
        }


    }
}
