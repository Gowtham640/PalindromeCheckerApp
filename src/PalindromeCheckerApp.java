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
        System.out.println("Enter to pop-1 or dequeue-2");
        int choice=sc.nextInt();
        int count=0;
        if(n==1){
            System.out.println("Popping: " + (char)arr[choice- 1]);
            arr[n-1]=0;
        }
        else{
            System.out.println("Dequing: " + (char)arr[count]);
            arr[count]=0;
            count++;
        }
    }
}
