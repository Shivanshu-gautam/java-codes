package hash_diagram;
import java.util.HashMap;
public class hash_normal {
    public static void main(String[] args){
        HashMap<Integer,String> h=new HashMap<>();
        h.put(1,"apple");
        h.put(2,"orange");
        System.out.println("In first position fruit: "+h.get(1));
    }
}
