public class example3 {
    public static void main(String[] args) {
        Tribonacci(-1);
    }

    public static void Tribonacci(int n) {

        if (n >= 0 && n <= 37) {
            int[] tB = new int[38];
            tB[0] = 0;
            tB[1] = 1;
            tB[2] = 1;
            for (int i = 0; i <= 34; i++) {

                tB[i + 3] = tB[i] + tB[i + 1] + tB[i + 2];

            }
            switch (n) {
                case 0: System.out.println("T[0] = 0");break;
                case 1: System.out.println("T[1] = 1");break;
                case 2: System.out.println("T[2] = 1");break;
                default: System.out.println("T[" + (n) + "] = " + tB[n - 3] + " + " + tB[n - 2] + " + " + tB[n - 1] + " = " + tB[n]);
            break;}

        } else {
            System.out.println("Values should be selected between 0 and 37.");
        }
    }
}
