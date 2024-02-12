import java.util.Scanner;
public class Exam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String m=sc.nextLine();
        char[] s=m.toCharArray();
        int i=0;
        int j=s.length-1;
        while(i<j)
        {
            char t=s[i];
            s[i]=s[j];
            s[j]=t;
            i++;
            j--;
        }
        System.out.println(s);
        
    }
}