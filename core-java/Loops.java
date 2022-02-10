public class Loops {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            System.out.println(sum);
        }
        System.out.println("***********************");
        sum = 0;
        for (int i = 1; sum <= 100; i++) {
            sum = sum + i;
            System.out.println(sum);
        }
    }
}
