import java.util.Scanner;
public class Exam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double c=sc.nextDouble();
        double f;
        f=32+(c*9/5);
        System.out.printf("%.2f",f);
    }
}