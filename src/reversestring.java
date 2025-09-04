import java.util.Scanner;
public class reversestring {
    public static void main(String[] args){
        Scanner ne=new Scanner(System.in);
        String str=ne.nextLine();
        System.out.println(str);
        String manualy="";
        for(int i=str.length()-1;i>=0;i--){
            manualy+=str.charAt(i);
        }System.out.print(manualy);
    }
}
