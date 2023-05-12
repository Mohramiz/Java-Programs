class demo1{
    int i,j;
    void set(int x,int y){
        i = x;
        j = y;
    }
    void add(){
        System.out.println(i+j);
    }
}
public class objectofclass{
    public static void main(String[] args) {
        demo1 ob = new demo1();
        ob.set(10, 20);
        ob.add();
        ob.set(30, 40);
        ob.add();
    }
}