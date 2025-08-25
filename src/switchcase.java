import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {
        Scanner Color = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int a = Color.nextInt();
        switch (a) {
            case (1):
                System.out.println("Green");
                break;
            case (2):
                System.out.println("Blue");
                break;
            case (3):
                System.out.println("White");
                break;
            default:
                System.out.println("Invailid");
        }
    }
}
