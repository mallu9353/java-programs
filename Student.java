public class Student {
    public Student(){
        System.out.println("Creating student project");
    }
    public void sayHello(){
        System.out.println("hello!!, I am Student");
    }
    public static void main(String[] args){
        Student st=new Student();
        st.sayHello();
    }
}
