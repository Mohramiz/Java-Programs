public class Eincp {
 private int a;
 private int b;
 int aa=10;
 int bb=20;
 int sum = aa+bb;
 void setA(){
     a=100;
 }
 void setB(){
     b=200;
 }
int getA(){
     return a;
 }
 int getB(){
     return b;
 }
 
    public static void main(String args[]) {
       Eincp ob=new Eincp();
       ob.setA();
       ob.setB();
       // System.out.println(ob.getA());
       int Ret = ob.getA();
       int Ret2= ob.getB();
        System.out.println("Return Value is:- " + Ret);
        System.out.println("Return Value is:- " + Ret2);

    }
}