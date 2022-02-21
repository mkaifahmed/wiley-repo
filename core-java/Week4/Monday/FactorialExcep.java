package Week4.Monday;

import java.util.Scanner;

public class FactorialExcep {

    public static int factorial(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("negative no factorial is not possible");
        }
        if (n > 16) {
            throw new IllegalArgumentException("value cannot be greater than 16");
        }

        int fac = 1;
        for (int i = n; i > 0; i--)
            fac *= i;
        return fac;
    }

    public static void main(String[] args) throws IllegalArgumentException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        try {
            System.out.println("Factorial of no :" + factorial(n));

        } catch (IllegalArgumentException e) {
            System.out.println(e);

        }
        sc.close();
    }

}