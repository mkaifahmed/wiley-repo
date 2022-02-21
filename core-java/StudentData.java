class Studentss {
    static int rollNoinc = 1;
    private int rollNo;
    private String name;
    static final String university = "JNTU";
    private String hometown;

    Studentss() {

        rollNo = rollNoinc++;
    }

    Studentss(String name) {
        this();
        this.name = name;
    }

    Studentss(String hometown, String name) {
        this();
        this.hometown = hometown;
        this.name = name;
    }

    protected void displays() {
        System.out.println("\nUniversity :" + university + "\nRoll Number : " + rollNo + "\nStudent Name : " + name
                + "\n HomeTown :" + hometown);
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

}

public class StudentData {
    public static void main(String[] args) {
        Studentss s1 = new Studentss();
        Studentss s3 = new Studentss("Kaif");
        Studentss s4 = new Studentss("Kurnool", "Bhaavana");
        s1.setName("Bhaavs");
        s1.setHometown("Kurnool");
        s1.displays();
        s3.setHometown("Hyderabad");
        s3.displays();
        s4.displays();
    }
}
