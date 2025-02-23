public class example7 {
    public static void main(String[] args) {

        int mRandom = (int) ((Math.random() * 10)) + 1;
        int nRandom = (int) ((Math.random() * 10)) + 1;
        System.out.println("Road Length = ("+mRandom+","+nRandom+")");
        UniqePaths(mRandom, nRandom);


    }






    public static void UniqePaths(int m, int n) {

        int permutation = factoriel(m + n - 2) / ((factoriel(n - 1)) * (factoriel(m - 1)));
        System.out.println("The Robot can go "+permutation+ " different ways");
    }

    public static int factoriel(int i) {

        int multip = 1;
        for (int j = 1; j <= i; j++) {
            multip *= j;
        }
        return multip;
    }

}
