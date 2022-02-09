import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int lcm = (n1 > n2) ? n1 : n2;
        while (true) {
            if (lcm % n1 == 0 && lcm % n2 == 0) {
                System.out.println("The LCM of " + n1 + " and " + n2 + " is " + lcm);
                break;
            }
            lcm++;
        }
        scanner.close();
    }

}
