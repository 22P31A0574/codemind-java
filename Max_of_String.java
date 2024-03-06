import java.util.Scanner;
public class Exam{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char result = s.charAt(0);
        for(int i = 1; i < s.length(); i++)
         result = result > s.charAt(i) ? result : s.charAt(i);
         System.out.println(result);
    }
}