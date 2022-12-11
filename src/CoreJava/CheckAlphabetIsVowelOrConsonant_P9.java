package CoreJava;

import java.util.Scanner;

public class CheckAlphabetIsVowelOrConsonant_P9
{
    public static void main(String[] args)
    {
        System.out.println("Enter Any Character");
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);

        switch(ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':

                System.out.println(ch+ " is Vowel");
                break;
            default:
                System.out.println(ch+ " is Constant");
        }
    }
}
