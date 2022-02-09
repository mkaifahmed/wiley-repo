import java.util.Scanner;

public class Leap {

    static boolean isLeap(int year) {
        if (year % 4 == 0) {

            if (year % 100 == 0) {

                return (year % 400 == 0);

            } else
                return true;
        } else
            return false;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = scanner.nextInt();

        if (isLeap(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        scanner.close();

    }
}
