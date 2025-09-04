package string.concept;
import java.util.Scanner;
public class count_vowel_consonent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println(name);
        char bhool;
        int vowel=0,consonent=0;
        for(int i=0;i<name.length()-1;i++){
            bhool=name.charAt(i);
            if(bhool>='a'||bhool<='z'){
                if(bhool=='a'||bhool=='o'||bhool=='i'||bhool=='e'||bhool=='u'){
                    vowel++;
                }else{
                    consonent++;
                }
            }
        }
        System.out.println("Vowel "+vowel+" Consonant "+consonent);
    }
}
