class Main {
    static byte b;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static boolean bl;
    static char c;

    public static void main(String[] args) {
        System.out.println("before assigning");
        System.out.println(b + " " + s + " " + i + " " + l + " " + f + " " + d + " " + bl + " " + c + " ");
        b = 11;
        s = 33;
        i = 45;
        l = 566;
        f = 45.4f;
        d = 69.69;
        bl = true;
        c = 'a';
        System.out.println("after assigning");
        System.out.println(b + " " + s + " " + i + " " + l + " " + f + " " + d + " " + bl + " " + c + " ");
    }

}