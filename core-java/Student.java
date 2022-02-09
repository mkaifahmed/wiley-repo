import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Marks in physics chem and maths");
        int p = scanner.nextInt();
        int c = scanner.nextInt();
        int m = scanner.nextInt();
        int total = (p + c + m) / 3;
        if (total >= 90) {
            System.out.println("grade A");
        } else {
            if (total >= 80) {
                System.out.println("grade B");
            } else {
                if (total >= 70) {
                    System.out.println("grade C");
                } else {
                    if (total >= 60) {
                        System.out.println("grade D");
                    } else {
                        System.out.println("fail");
                    }
                }
            }
        }
        scanner.close();
    }
}
