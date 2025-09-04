package string.concept;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your palindrome name: ");
        String name=sc.nextLine();
        System.out.println(name);
        String opposite="";
        for(int i=name.length()-1;i>=0;i--){
            opposite+=name.charAt(i);
        }
            System.out.println(opposite);

    }


}
