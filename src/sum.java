import java.util.Scanner;
public class sum {
    public static int numbersum(int n,Scanner sc){
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }for(int i=0;i<n;i++){
            sum+=arr[i];
        }return sum;
    }public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Sun of no.: "+ numbersum(n,sc));
    }
}
