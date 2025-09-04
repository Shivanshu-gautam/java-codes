import java.io.FileInputStream;
public class exception {
    public static void main(String[] args) {
        System.out.println("hii");
        System.out.println("pappu");
        System.out.println("hello");
        try {
            System.out.println(200 / 0);
        }
        catch(ArithmeticException e){
            System.out.println(e.toString());
        }
        System.out.println("Shivanshu");
    }
}
