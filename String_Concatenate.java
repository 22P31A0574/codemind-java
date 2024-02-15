import java.util.Scanner;
import java.util.Arrays;
public class Exam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String s3=s1.concat(s2);
        char[] arr=s3.toCharArray();
        Arrays.sort(arr);
        System.out.println(new String(arr));
    }
}