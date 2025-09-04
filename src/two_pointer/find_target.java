package two_pointer;
import java.util.Scanner;
public class find_target {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("ENter your array size: ");
        int n=obj.nextInt();
        int[] arr=new int[n];
        System.out.println("Print unsorted array: ");
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        //for sorted array;
        System.out.println("Sorted array: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap values;
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        //find our target with sum in sorted array;
        System.out.println("Enter target: ");
        int target=obj.nextInt();
        int low=0;
        int high=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(arr[low]<arr[high]){
                int sum=arr[low]+arr[high];
                if(sum==target){
                    System.out.println("pair found: "+arr[low]+","+arr[high]);
                    break;
                }
                else if(sum<target){
                    low++;
                }else{
                    high--;
                }
            }
        }
    }
}
