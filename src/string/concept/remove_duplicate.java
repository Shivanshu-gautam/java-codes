package string.concept;
import java.util.Scanner;
public class remove_duplicate {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String name=str.nextLine();
        System.out.println(name);
        char hh;
        String result="";
        for(int i=0;i<name.length();i++){
            hh=name.charAt(i);
            if(result.indexOf(hh)==-1){
                result=result+hh;
            }
        }
        System.out.println(result);
    }
}
