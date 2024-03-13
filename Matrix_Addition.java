import java.util.Scanner;
import java.util.Arrays;
public class Exam{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++){
                 arr[i][j]=sc.nextInt();
            }
        }
        int p=sc.nextInt();
        int r=sc.nextInt();
        int[][] ar=new int[p][r];
        for(int i=0;i<p;i++){
            for(int j=0;j<r;j++){
                 ar[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+ar[i][j]+" ");
            }
           System.out.println();
        }
    }
}