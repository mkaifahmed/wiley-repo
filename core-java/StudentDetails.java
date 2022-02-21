class Students {
    private int rollNo;
    private String name;

    Students() {
        rollNo = 0;
        name = " ";
    }

    Students(int rollNo) {
        this.rollNo = rollNo;
        name = " ";
    }

    Students(String name) {
        rollNo = 0;
        this.name = name;
    }

    Students(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    protected void display() {
        System.out.println("\nRoll Number : " + rollNo + "\nStudent Name : " + name);
    }

    int getRollNo() {
        return this.rollNo;
    }

    String getName() {
        return this.name;
    }

    void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    void setName(String name) {
        this.name = name;
    }
}

public class StudentDetails {

    public static void main(String[] args) {
        Students s1 = new Students();
        Students s2 = new Students(20);
        Students s3 = new Students("Kaif");
        Students s4 = new Students(24, "Bhaavs");
        s1.display();
        s2.display();
        s3.display();
        s4.display();
        System.out.println(s2.getRollNo());
        System.out.println(s3.getName());
        s2.setName("GG");
        s3.setRollNo(15);
        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}