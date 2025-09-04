package Stack;
import java.util.Scanner;
class Stack1{
    private int top;
    private int capacity;
    private int[] arr;
    public Stack1(int n){
        capacity=n;
        arr=new int[n];
        top=-1;
    }
    public void push(int x){
        if(isfull()){
            System.out.println("Stack is full.");
        }
        System.out.println("Pushing "+x+" to stack.");
        arr[++top]=x;
    }
    public boolean isfull(){
        return top==capacity-1;
    }
    public void display(){
        if(top==-1){
            System.out.println("Stack is empty.");
        }
        for(int i=0;i<=top;i++){
            System.out.println(arr[i]);
        }
    }
}
public class  Next_Greater_Element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Eter Size: ");
        int n=sc.nextInt();
        Stack1 stack=new Stack1(n);
        for(int i=0;i<n;i++){
            int ele=sc.nextInt();
            stack.push(ele);
        }
        stack.display();
    }
}
