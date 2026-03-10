import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input:");
        String s=sc.nextLine();
        String s1="";
        int n=s.length();
        boolean a=true;
        for(int i=n-1;i>=0;i--){
            s1+=s.charAt(i);
        }
        if(s.equals(s1)){
            System.out.println(s+" is a palindrome");
        }
        else {
            a = false;
            System.out.println(s + " is not palindrome");
        }
    }
}
