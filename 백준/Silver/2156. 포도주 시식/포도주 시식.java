import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n + 1];
        for (int i = 1; i <= n; i++) A[i] = sc.nextInt();

        int[] dp = new int[n + 1];
        dp[1] = A[1];
        if (n >= 2) {
            dp[2] = A[1] + A[2];
        }

        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 1], 
                    Math.max(dp[i - 2] + A[i], dp[i - 3] + A[i - 1] + A[i]));
        }

        System.out.println(dp[n]);
    }
}