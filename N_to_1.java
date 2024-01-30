import java.util.Scanner;
public class Exam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        for(i=n;i>=1;i--)
        {
            System.out.printf("%d ",i);
        }
    }
}