import java.util.Scanner;

public class MaxnMin {
    static int largest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else {
            if (b >= a && b >= c) {
                return b;
            } else {
                return c;
            }
        }
    }

    static int smallest(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else {
            if (b <= a && b <= c) {
                return b;
            } else {
                return c;
            }
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers :");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        System.out.println("largest no : " + largest(first, second, third) + "\n" + "smallest no : "
                + smallest(first, second, third));
        scanner.close();
    }

}