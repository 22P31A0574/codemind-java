import java.util.Scanner;
public class Exam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double f=sc.nextDouble();
        double c;
        c=((f-32)*5)/9;
        System.out.printf("%.2f",c);
    }
}