public class GivenNumber_primeorNot {
    static void loop(int n) {
        int x = n;
        if (x <= 1) {
            System.out.println(" Not Prime");
        }
        for (int i = 2; i <= x; i++) {
            if (x % i == 0) {
                System.out.print(n + " is not Prime Number");
                break;

            } else {
                System.out.println(n + " Is Prime");
                break;
            }
        }
        System.out.println();
    }

    // recursion

    public static void recursion(int n, int i) {

        if (n <= 1) {
            System.out.println(n + " Not Prime");
            return;
        }
        if (n == 2) {
            System.out.println(n + " Is Prime");
            return;
        }
        if (n % i == 0) {
            System.out.println(n + "  not prime");
            return;
        }
        if (i * i > n) {
            System.out.println(n + " Prime");
            return;
        }
        recursion(n, i + 1);
    }

    // Recursion

    static int recursion1(int n, int i) {
        if (n <= 1) {
            return 1; // true prime
        }
        if (n % i == 0) {
            return 0; // false not prime
        }
        return recursion1(n, i + 1);
    }

    public static void main(String[] args) {
        loop(19);

        int number1 = 11;
        recursion(number1, 2);

        int n = 10;
        int p = recursion1(n, n / 2);
        if (p == 1) {
            System.out.println(n + " Prime Number");
        } else {
            System.out.println(n + " Not Prime Number");
        }

    }
}