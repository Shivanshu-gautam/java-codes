package string.concept;
import java.util.Scanner;
public class String_Substring {
    public static void main(String[] args) {
        boolean found=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str=sc.nextLine();
        System.out.println("Enter your substring: ");
        String substr=sc.nextLine();
        for(int i=0;i<=str.length()-substr.length();i++){
            if(str.substring(i,i+substr.length()).equals(substr)){
                found=true;
                break;
            }

        }if(found){
            System.out.println("Substring found");
        }else{
            System.out.println("Substring not found");
        }
    }
}
