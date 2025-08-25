import java.util.Scanner;
public class factorial {
    public static long factorial_sum(int n,Scanner sc){
        long fact=1;
        for (int i=n;i>0;i--){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Sum of factorial "+n+" is "+factorial_sum(n,sc));
    }
}