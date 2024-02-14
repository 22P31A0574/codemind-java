import java.util.Scanner;
public class ReverseOnlyVowels
{
    static boolean isVowel(char ch){
        String v="aeiouAEIOU";
        if(v.contains(""+ch))
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] str=s.toCharArray();
        int i=0;
        int j=str.length-1;
        while(i<j){
            if(isVowel(str[i])&&isVowel(str[j])){
            char temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
            }
            else if(isVowel(str[i])){
            j--;
            }
            else if(isVowel(str[j])){
            i++;
            }
            else{
            i++;
            j--;
            }
        }
        System.out.println(str);

    }
}