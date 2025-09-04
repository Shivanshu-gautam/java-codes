package Stack;
import java.util.Scanner;
//import java.util.Stack;
class Stack{
    private int arr[];
    private int top;
    private int capacity;
    Stack(int size){
        arr=new int[size];
        capacity=size;
        top=-1;
    }
    public void push(int value){
        if(isfull()){
            System.out.println("Stack is full.");
            return;
        }
        System.out.println("Pushing: "+value);
        arr[++top]=value;
    }
    public int pop(){
        if(isempty()){
            System.out.println("Stack is empty.");
            return -1;
        }
        return arr[top--];
    }
    public boolean isempty(){
        return top==-1;
    }
    public boolean isfull(){
        return top==capacity-1;
    }
    public void display(){
        if(isempty()){
            System.out.println("Stack is empty.");
            return;
        }
        for(int i=0;i<=top;i++){
            System.out.println(arr[i]);
        }
    }
}
public class tackvalue_byuser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Stack Size: ");
        int n=sc.nextInt();
        Stack st=new Stack(n);
        System.out.println("Enter "+n+" elements to push onto the stack:");
        for(int i=0;i<n;i++){
            int element=sc.nextInt();
            st.push(element);
        }
        System.out.println("Enter Stack: ");
        st.display();
        System.out.println("Enter pop ele: "+st.pop());
        System.out.println("Atter pop stack: ");
        st.display();
    }
}
