import java.util.Scanner;

public class Calc {
    public static void calculator(Scanner scanner, int a, int b) {
        System.out.println("Select operation \n 1.Add 2.Subtract 3.Multiply 4.Divide 5.Modulus");
        int choice;
        int result = 0;
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                result = a + b;

                break;
            case 2:
                result = a - b;

                break;

            case 3:
                result = a * b;

                break;
            case 4:
                if (b != 0) {
                    result = a / b;

                    break;
                } else {
                    System.out.println("Divide by zero not possible");
                    break;
                }
            case 5:
                if (b != 0) {
                    result = a % b;

                    break;
                } else {
                    System.out.println("Divide by zero not possible");
                    break;
                }

            default:

                System.out.println("Please select the appropriate operation");

                break;

        }

        System.out.println(result);
        System.out.println(
                "Do u want to continue to perform the calculation on current result? or Start over with new inputs or exit select 1 or 0");
        choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("enter value of num2");
            b = scanner.nextInt();
            calculator(scanner, result, b);
        } else {
            System.out.println("Final result is " + result);

        }
    }

    public static void main(String[] args) {
        System.out.println("Calculator");
        int num1;
        int num2;
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the numbers");
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
            calculator(scanner, num1, num2);
            System.out.println("press 1 to start over and 0 to exit");
            choice = scanner.nextInt();
        } while (choice == 1);
    }
}
