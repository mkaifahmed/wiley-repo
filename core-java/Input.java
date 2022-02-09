import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers or press q to exit ");
        int count = 0;
        while (!scanner.next().equals("q")) {
            count++;
        }
        System.out.println("No of Inputs " + count);
        scanner.close();
    }

}
