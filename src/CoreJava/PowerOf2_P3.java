package CoreJava;

public class PowerOf2_P3
{
    public static void main(String[] args)
    {
        int number, mul = 1;

        number = Integer.parseInt(args[0]);
        for (int i = 1; i <= number; i++)
            {
                mul = mul * 2;
                System.out.println(mul);
            }
    }
}
