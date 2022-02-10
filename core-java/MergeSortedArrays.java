public class MergeSortedArrays {

    static void printArray(int[] array) {
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void mergeArray(int[] a, int[] b, int[] c) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {

            if (a[i] < b[j])
                c[k++] = a[i++];
            else
                c[k++] = b[j++];
        }

        while (i < a.length)
            c[k++] = a[i++];

        while (j < b.length)
            c[k++] = b[j++];

        printArray(c);
    }

    public static void main(String[] args) {
        int[] a = new int[] { 2, 4, 6, 8 };
        printArray(a);
        int[] b = new int[] { 1, 3, 5, 7 };
        printArray(b);
        int[] c = new int[a.length + b.length];

        mergeArray(a, b, c);

    }

}
