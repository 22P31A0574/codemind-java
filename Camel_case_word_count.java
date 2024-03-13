import java.util.Scanner;
public class Exam{
    public static int countWords(String s){
        int count=1;
        for(int i=1;i<s.length()-1;i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(countWords(s));
    }
}