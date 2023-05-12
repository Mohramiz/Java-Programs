class A{
    protected int i;
    A(){
        i = 10;
    }
}
class B extends A{
    int j;
    B(){
        j = 20;
    }
    void add(){
        System.out.println(i+j);
    }
}
public class protectedinheritance{
    public static void main(String[] args){
        B b = new B();
        b.add();
    }
}