package CoreJava;

import java.util.Scanner;

public class HarmonicNthNumber_P4
{
    public static void main(String[] args)
    {
        double result=0;
        System.out.println("Enter The Number :");
        Scanner sc=new Scanner(System.in);
        double number=sc.nextDouble();
        for(double i=1; i<=number; i++)
        {
            result=result+1/i;
            System.out.println(result);
        }

    }
}
