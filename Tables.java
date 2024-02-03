import java.util.Scanner;
public class EXam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int i;
        for(i=1;i<=a;i++)
        {
            if(i % 2 != 0)
            System.out.printf("%d x %d = %d
",n,i,n*i);
        }
    }
}