public class Task2 {
    static boolean condit(int a, int b) {
        return (a < 50 || a < b);

    }

    public static void main(String[] args) {
        int a = 55;
        int b = 70;
        System.out.println("one of the condition is " + condit(a, b));
    }

}
