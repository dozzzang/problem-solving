import java.util.*;
import java.io.*;

import java.lang.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            int[][] arr = new int[3][n + 2];
            int[][] dp = new int[3][n + 2];

            for (int j = 1; j <= 2; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 1; k <= n; k++) {
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            dp[1][1] = arr[1][1];
            dp[2][1] = arr[2][1];

            if(n > 1) {
                dp[1][2] = arr[2][1] + arr[1][2];
                dp[2][2] = arr[1][1] + arr[2][2];
            }

            for(int k = 3; k <= n; k++) {
                dp[1][k] = Math.max(dp[2][k-1],dp[2][k-2]) + arr[1][k];
                dp[2][k] = Math.max(dp[1][k-1],dp[1][k-2]) + arr[2][k];
            }
            System.out.println(Math.max(dp[1][n],dp[2][n]));
        }
    }
}