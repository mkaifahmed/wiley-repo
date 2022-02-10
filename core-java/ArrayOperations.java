import java.util.Scanner;
import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 1;
        }
        Arrays.sort(array);
        System.out.println("Best Scores");
        for (int i = array.length - 1; i > 4; i--) {
            System.out.println(array[i]);
        }
        scanner.close();
    }

}
