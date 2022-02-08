import java.util.*;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Calculator:");
        double num1;
        double num2;
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Enter the numbers : ");
            num1 = sc.nextDouble();
            num2 = sc.nextDouble();
            System.out.println("Choose the operation you want to perform 1.Add 2.Sub 3.Multiply 4.Divide 5.Modulus ");
            int op = sc.nextInt();

            double result = 0;

            switch (op) {
                case 1:
                    result = num1 + num2;
                    System.out.println(result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println(result);
                    break;

                case 3:
                    result = num1 * num2;
                    System.out.println(result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println(result);
                        break;
                    } else {
                        System.out.println("Divide by zero not possible");
                        break;
                    }
                case 5:
                    if (num2 != 0) {
                        result = num1 % num2;
                        System.out.println(result);
                        break;
                    } else {
                        System.out.println("Divide by zero not possible");
                        break;
                    }

                default:

                    System.out.println("Please select the appropriate operation");

                    break;

            }
            System.out.println("press 1 to continue 0 to exit");
            choice = sc.nextInt();
        } while (choice == 1);
        sc.close();

    }

}
