import java.util.Scanner;

public class nums
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a num upto where you want to print :");
        int a = sc.nextInt();
        for(int i = 0; i < a; i++)
        {
            System.out.println(i);
        }
    }
}
