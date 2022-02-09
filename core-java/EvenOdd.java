import java.util.Scanner;

public class EvenOdd {
    static void evenOrOdd(int a) {
        if (a % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        evenOrOdd(n);
        scanner.close();
    }

}
