import java.util.Scanner;

public class Quads {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter coordinates x and y");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("1st q");
        } else {
            if (x < 0 && y > 0) {
                System.out.println("2nd q");
            } else {
                if (x < 0 && y < 0) {
                    System.out.println("3rd q");
                } else {
                    if (x > 0 && y < 0) {
                        System.out.println("4th q");
                    } else {
                        System.out.println("origin");
                    }
                }
            }
        }
        scanner.close();
    }
}
