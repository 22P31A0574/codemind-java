import java.util.Scanner;
public class Exam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int  x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        double m=Math.pow(x,y);
        double n=m%z;
        System.out.printf("%.0f",n);
    }
}