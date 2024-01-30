import java.util.Scanner;
public class Exam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i;
        for(i=a;i<=b;i++)
        {
            System.out.printf("%d x %d = %d
",n,i,n*i);
        }
    }
}