package leetCodequestions;

import java.util.Arrays;

public class example5 {
    public static void main(String[] args) {


        int[] cashHole = new int[100];
        for (int i = 0; i < cashHole.length; i++) {
            int randomNum = (int) ((Math.random() * 399)) + 1;
            cashHole[i] = randomNum;
        }
        int probability1 = 0;
        int probability2 = 0;
        for (int i = 0; i < cashHole.length; i += 2) {
            probability1 += cashHole[i];
        }
        for (int j = 1; j < cashHole.length; j += 2) {
            probability2 += cashHole[j];
        }
        System.out.println(Arrays.toString(cashHole));
        System.out.println("Max total = " + Math.max(probability1, probability2));
    }
}
