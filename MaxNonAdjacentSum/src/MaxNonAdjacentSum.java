package dynamicProgrammingHomework;
/*
Максимальна сума без сусідніх елементів
Вибрати елементи з масиву так, щоб не було сусідніх і сума була максимальною.
 */
public class MaxNonAdjacentSum {
    public static int maxSum(int[] a) {
        if (a.length == 0) return 0;
        if (a.length == 1) return a[0];

        int[] dp = new int[a.length];
        dp[0] = a[0];
        dp[1] = Math.max(a[0], a[1]);

        for (int i = 2; i < a.length; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + a[i]);
        }

        return dp[a.length - 1];
    }

    public static void main(String[] args) {
        int[] a = {3, 2, 7, 10};
        System.out.println(maxSum(a)); // вивід: 13
    }
}