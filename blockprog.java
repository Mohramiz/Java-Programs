class Demo1{
    Demo1(){
        System.out.println("Constructor called");
    }
    {
        System.out.println("instant block");
    }
    static{
        System.out.println("Static");
    }
}
public class blockprog{
    public static void main(String[] args) {
        Demo1 t1=new Demo1();
        Demo1 t2=new Demo1();
        Demo1 t3=new Demo1();
    }
}