import javax.management.RuntimeErrorException;

class student {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int x) {
        if (x < 0) {
            throw new RuntimeErrorException(null, "Id cannot be negative");
        }
        id = x;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void setYear(int i) {
    }

    public void setBranch(String string) {
    }

    public int getyear() {
        return 0;
    }

    public String getbranch() {
        return null;
    }
}

public class getset {
    public static void main(String[] args) {
        student s1=new student();
        s1.setId(12);
        s1.setName("abc");
        int x = s1.getId();
        String y = s1.getName();
        System.out.println(x);
        System.out.println(y);
    }
}
