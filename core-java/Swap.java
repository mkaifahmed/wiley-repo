public class Swap {
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value after swap a = " + a + " b = " + b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Value before swap a = " + a + " b = " + b);
        swap(a, b);

    }

}
