class A {
    A() {
        System.out.println("In A class");
    }
}

class B extends A {
    B() {
        System.out.println("In B class");
    }
}

class C extends B {
    C() {
        System.out.println("In C class");
    }
}

public class constructorchaining {
    public static void main(String[] args) {
        C c = new C();
    }
}
