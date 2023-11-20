import java.util.Scanner;

public class EvenNums
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number upto where you want to print even numbers :");
        int a = sc.nextInt();
        for(int i = 0; i < a; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println(i);
            }
        }
    }
}