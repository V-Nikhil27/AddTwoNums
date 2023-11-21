import java.util.Scanner;
public class EvenNums
{
    public static void main(String args[])
    {
        System.out.println("Enter a num upto where you want to print odd numbers :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 0; i < a; i++)
        {
            if(i % 2 != 0)
            {
                System.out.println(i);
            }
        }
    }
}
