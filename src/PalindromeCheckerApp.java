import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input:");
        String s=sc.nextLine();
        int n=s.length();
        boolean a=true;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.charAt(i);
        }
        int count=0;
        for(int i=n-1;i>=0;i--){
            if(arr[i]!=s.charAt(count)){
                System.out.println(s+" is not a palindrome");
                a=false;
                break;
            }
            else{
                count++;
            }
        }
        if(a){
            System.out.println(s+" is palindrome");
        }
    }
}
