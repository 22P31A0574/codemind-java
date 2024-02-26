import java.util.Scanner;
public class Exam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t -->0)
        {
            int n=sc.nextInt();
            int i;
            int f=1;
            for(i=1;i<=n;i++)
            {
                f=f*i;
            }
            System.out.println(f);
        }
    }
}