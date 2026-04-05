import java.util.*;
import java.io.*;

import java.lang.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int[] dp = new int[n + 1];

        dp[1] = 1;
        if(n >= 2) {
            dp[2] = 2;

            for (int i = 3; i <= n; i++) {
                dp[i] = (dp[i - 1] + dp[i - 2]) % 15746;
            }
        }
        System.out.print(dp[n]);
    }
}