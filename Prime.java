import java.util.Scanner;
public class Exam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        boolean flag = false;
        for(i=2;i<=n/2;i++)
        {
            if(n % i == 0)
            {
                flag = true;
                break;
            }
        }
        if(!flag)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }
    }
}