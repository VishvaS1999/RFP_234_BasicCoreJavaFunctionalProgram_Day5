package CoreJava;

import java.util.Scanner;

public class LeapYearOrNot_P2
{
    public static void main(String[] args)
    {
        System.out.println("Enter Your Choice Year :-");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();

        if((year % 4== 0) && (year % 100 != 0)||(year % 400 == 0))
        {
            System.out.println("year is Leap Year");
        }
        else
        {
            System.out.println("year is Not Leap Year");
        }
    }
}
