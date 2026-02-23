import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input:");
        String s=sc.nextLine();
        int n=s.length();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.charAt(i);
        }
        int left=0;
        int right=n-1;
        boolean a=true;
        while(left<right){
            System.out.println("Checking "+(char)arr[left]+" and "+(char)arr[right]);
            if ((char) arr[left] !=(char)arr[right]){
                a=false;
                System.out.println(s+" is not palindrome");
                break;
            }
            else{
                arr[left]=0;
                arr[right]=0;
                left++;
                right--;
            }
        }
        if(a){
            System.out.println(s+" is palindrome");
        }
    }
}
