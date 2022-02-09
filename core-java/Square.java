import java.util.Scanner;

public class Square {

    static void sqofn(int a) {
        System.out.println(a * a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        sqofn(n);
        scanner.close();

    }

}
