public class PrimeRange {
    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }

            return true;

        }
    }

    static boolean isArmStrong(int n) {
        int temp;
        int rem;
        int result = 0;

        temp = n;

        while (temp > 0) {
            rem = temp % 10;
            result += Math.pow(rem, 3);
            temp /= 10;
        }
        return (result == n);

    }

    public static void main(String[] args) {
        int n = 153;
        for (int i = 0; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime");
            } else if (isArmStrong(i)) {
                System.out.println(i + " is a armstrong");
            }
        }

    }
}
