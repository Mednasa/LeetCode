public class example4 {
    public static void main(String[] args) {
        int[] cost = {1, 15, 50, 2, 40, 6, 25, 30, 100, 2, 50};
        int totalCost = calculateMinCost(cost);
        System.out.println("Total Cost: " + totalCost);
    }

    public static int calculateMinCost(int... cost) {
        int firstCost = cost[0];
        int secondCost = cost[1];
        int total;
        for (int i = 2; i < cost.length; i++) {
            if (firstCost < secondCost) {
                total = firstCost + cost[i];
            } else {
                total = secondCost + cost[i];
            }
            firstCost = secondCost;
            secondCost = total;
        }
        if (firstCost < secondCost) {
            return firstCost;
        } else {
            return secondCost;
        }
    }
}
