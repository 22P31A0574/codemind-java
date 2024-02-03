import java.util.Scanner;
public class Exam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        boolean l,m,n;
        l=a>50;
        m=b>60;
        n=c>100;
        if(l&&m&&n)
        System.out.println("10");
        else if(l&&m)
        System.out.println("9");
        else if(m&&n)
        System.out.println("8");
        else if(l&&n)
        System.out.println("7");
        else if(l||m||n)
        System.out.println("6");
        else
        System.out.println("5");
    }
}