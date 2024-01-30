import java.util.Scanner;
public class Exam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String p=sc.nextLine();
        String q=sc.nextLine();
        int n=sc.nextInt();
        double c,s,t;
        if(n<199)
        c=1.2*n;
        else if(n>=200 && n<400)
        c=1.5*n;
        else if(n>=400 && n<600)
        c=1.8*n;
        else
        c=2*n;
        if(n>400)
        s=0.15*c;
        else
        s=100.00;
        t=c+s;
        System.out.printf("%.2f",t);
        
    }
}