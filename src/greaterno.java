import java.util.Scanner;
public class greaterno {
    int numbers;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter Second number: ");
        int b=sc.nextInt();
        System.out.print("Enter third number: ");
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("Greater number is: "+a);
        } else if (b>c) {
            System.out.println("Greater number is: "+b);

        }else{
            System.out.println("Greater number is: "+c);
        }
    }
}
