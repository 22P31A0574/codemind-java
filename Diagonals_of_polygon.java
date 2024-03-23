import java.util.Scanner;
public class Exam
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>2){
            System.out.println((n*(n-3))/2);
        }
        else{
            System.out.println("0");
        }
    }
}