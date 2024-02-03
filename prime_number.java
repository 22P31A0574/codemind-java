import java.util.Scanner;
public class Exam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=false;
        int i=2;
        while(i<=n/2)
        {
            if(n % i == 0)
            {
                flag=true;
                break;
            }
            i++;
        }
        if(!flag)
        System.out.println("prime");
        else
        System.out.println("not a prime");
    }
}