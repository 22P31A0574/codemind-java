import java.util.Scanner;
public class Exam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=0;
        b=n%10;
        while(n!=0)
        {
            a=n%10;
            n/=10;
        }
        System.out.println(a+b);
    }
}