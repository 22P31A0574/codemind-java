import java.util.Scanner;
public class Exam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String x="";
        for(int i=s.length()-1;i>=0;i--)
        {
          x += s.charAt(i);  
        }
        if(x.equals(s))
        System.out.println("Palindrome");
        else
        System.out.println("Not Palindrome");
    }
}