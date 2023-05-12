class Student {
    private String firstName;
    private String lastName;
    private int year;
    private String branch;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}

public class gettersetter {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setFirstName("Ahmed");
        s1.setLastName("aaa");
        s1.setYear(2019);
        s1.setBranch("CSE");

        String firstName = s1.getFirstName();
        String lastName = s1.getLastName();
        int year = s1.getYear();
        String branch = s1.getBranch();

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(year);
        System.out.println(branch);
    }
}
