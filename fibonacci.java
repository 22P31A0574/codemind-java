import java.util.Scanner;
public class Exam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=0;
        int n2=1;
        int i,n3;
        int n4=sc.nextInt();
        int count=n4;
        System.out.print(n1+" "+n2);
        for(i=2;i<count;i++)
        {
            n3=n1+n2;
            System.out.printf(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}