import java.util.Scanner;

public class ValueOfN {
    public static void main(String[] args) {
        System.out.println("Enter m: ");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        if (m > 0) {
            System.out.println("ValueOf n is 1");
        } else {
            if (m == 0) {
                System.out.println("ValueOf n is 0");
            } else {
                System.out.println("ValueOf n is -1");
            }
        }
        scanner.close();
    }

}
