import java.util.Scanner;
public class array {
    int[] arr;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("ENter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    for(int i=0;i<n;i++){
            System.out.print(" "+arr[i] );
        }
    int max=arr[0];
    int min=arr[0];
    for(int i=0;i<n;i++){
        if(arr[i]>max){
            max=arr[i];
        }if(arr[i]<min){
            min=arr[i];
        }}

        System.out.println("Max: "+max+"Min: "+min);

    }
}
