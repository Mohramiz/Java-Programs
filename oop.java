class circle1{
   double radius;
   double area;
   void setradius (double x){
    radius = x;
   }
double calculatearea(){
    return 3.14*radius*radius;
    }
}
public class oop{
    public static void main(String[] args) {
      circle ob = new circle();
      ob.setradius(1.2);
      double a = ob.calculatearea();
      System.out.println("Area is"+a);  
    }
}