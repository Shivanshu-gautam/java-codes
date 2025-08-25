import java.util.Scanner;
public class sumofnumbers {
    int n;

    public static void main(String[] args) {
        Scanner sum = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sum.nextInt();
        int count =0;
        for (int i = 0; i < n; i++) {
            count = count + i;
        }
        System.out.println("Sum n numbers: " + count);
    }
}