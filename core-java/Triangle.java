import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        System.out.println("enter sides of triangle: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a == b && b == c) {
            System.out.println("equilateral");
        } else {
            if (a != b && b != c) {
                System.out.println("scalen");
            } else {
                System.out.println("isosceles");
            }
        }
        scanner.close();
    }

}
