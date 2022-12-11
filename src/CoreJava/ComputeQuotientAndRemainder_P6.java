package CoreJava;

import java.util.Scanner;

public class ComputeQuotientAndRemainder_P6
{
    public static void main(String[] args)
    {
        System.out.println("Enter Any Number for dividend : ");

        Scanner sc=new Scanner(System.in);
        int dividend=sc.nextInt();

        System.out.println("Enter Any Number For Divisor : ");
        int divisor=sc.nextInt();

        int quotient=dividend/divisor;
        System.out.println("quotient is " +dividend+ " / " +divisor+ " = " +quotient);

        int remainder=dividend % divisor;
        System.out.println("Remainder is " +dividend+ " % " +divisor+ " = " +remainder);
    }
}
