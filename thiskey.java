class Demo1{
    int i;
    Demo1(int i){
        this.i=1;
    }
    void show(){
        System.out.println(i);
    }
}
public class thiskey{
    public static void main(String[] args) {
        Demo1 d1=new Demo1(1);
        d1.show();
    }
}