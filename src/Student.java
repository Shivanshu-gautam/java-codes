public class Student {
    String name;
    long roll_no;
    String branch="CS";
    char section='D';
    // methods
    void checkResult(){
        System.out.print("Hello");
    }
    public static void main(String[] args){
        //creating an object
        Student st1=new Student();
        Student st2=new Student();
        st1.name="Shivanshu";
        Student st3=new Student();
        st2.name="Harsh";
        st3.name="Kapil";
        System.out.println("Student 1: " + st1.name);
        System.out.println("Student 2: " + st2.name);
        System.out.println("Student 3: " + st3.name);
        st1.checkResult();


    }
}
