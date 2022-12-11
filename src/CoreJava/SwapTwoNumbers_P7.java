package CoreJava;

import java.util.Scanner;

public class SwapTwoNumbers_P7
{
    public static void main(String[] args)
    {
        System.out.println("Swap Two Numbers ");
        int c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number :-");
        int a=sc.nextInt();
        System.out.println("Enter Second Number :-");
        int b= sc.nextInt();

        System.out.println("Before Swapping Numbers :" + " a = " +a + ", b = " + b);
        c = a;  //Hear c=4
        a = b;  //Hear a=2
        b = c;  //Hear b=2
        System.out.println("After Swapping Numbers  :" + " a = " +a + ", b = " +b);

    }
}
