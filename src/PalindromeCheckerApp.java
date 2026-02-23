import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        String s="madam";
        int n=s.length();
        int right=0;
        int left=n-1;
        boolean a=true;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                System.out.println("It is not a palindrome");
                a=false;
                break;
            }
        }
        if(a){
            System.out.println(s+" Is is a palindrome");
        }
    }
}
