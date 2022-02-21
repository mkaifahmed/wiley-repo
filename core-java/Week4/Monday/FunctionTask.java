package Week4.Monday;

import java.util.Scanner;

public class FunctionTask {

    static int arrayelement(int[] arr) {
        return arr[4];
    }

    static int divide(int a, int b) {

        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter array Elemnts");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Fifth element in array is " + arrayelement(arr));
        System.out.println("Enter 2 numbers to divide");
        System.out.println(divide(scanner.nextInt(), scanner.nextInt()));
        scanner.close();
    }
}
