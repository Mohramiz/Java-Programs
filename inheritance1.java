class A {
    void show() {
        System.out.println("in A");
    }
}

class B extends A {
    void disp() {
        System.out.println("in B");
    }
}

public class inheritance1 {
    public static void main(String[] args) {
        B ob = new B();
        ob.show();
        ob.disp();
    }
}
