public class example1 {
    public static void main(String[] args) {
        climbStairs(46);
    }

    public static void climbStairs(int n) {
        if (n <= 45 && n >= 1) {
            int[] p = new int[46];
            p[0] = 0;
            p[1] = 1;
            p[2] = 2;
            for (int i = 3; i <= 45; i++) {
                p[i] = p[i - 1] + p[i - 2];
            }
            System.out.println("There are " + " " + p[n] + " ways to climb to the top");
        } else {
            System.out.println("You have exceeded the maximum value!!!!");
        }
    }
}
