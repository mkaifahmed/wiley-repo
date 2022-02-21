package Week4.Monday;

import java.util.Scanner;

public class ExceptionTask {

    static int divide(int a, int b, int c) {
        try {
            int res;
            try {
                res = a / b;
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero");
                return 0;
            }
            return res / c;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
    }

    static int arrayelement(int[] arr) {
        try {
            return arr[2];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array index out of bound");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int res = divide(a, b, c);

        System.out.println("Result  is" + res);
        int[] arr = new int[res];
        for (int i = 0; i < res; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(arrayelement(arr));
        scanner.close();
    }
}
