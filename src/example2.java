public class example2 {
    public static void main(String[] args) {
        fibonacci(5);
    }

    public static void fibonacci(int n) {

        if (n >= 0 && n <= 30) {
            int[] F = new int[31];
            F[0] = 0;
            F[1] = 1;
            for (int i = 2; i <= 30; i++) {
                F[i] = F[i - 1] + F[i - 2];
            }
            if (n == 0) {
                System.out.println("F[0] = 0");
            } else if (n == 1) {
                System.out.println("F[1] = 1");
            } else
                System.out.println("F[" + n + "] = F[" + (n - 1) + "] + F[" + (n - 2) + "] = " + F[n]);
        } else {
            System.out.println("Values should be selected between 0 and 30");
        }

    }
}
