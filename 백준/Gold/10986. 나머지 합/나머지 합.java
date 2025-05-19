import java.io.IOException;

import java.util.Scanner;
// BOJ 10986
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] S = new long[N];
        long[] C = new long[M];
        long ans = 0;
        S[0] = sc.nextInt();
        for (int i = 1; i < N; i++)
            S[i] = S[i - 1] + sc.nextInt();
        for (int i = 0; i < N; i++) {
            int rem = (int) (S[i] % M);
            if (rem == 0) ans++;
            C[rem]++;
        }
        for (int i = 0; i < M; i++) {
            if (C[i] > 1)
                ans += (C[i] * (C[i] - 1) / 2); // Combination
        }
        System.out.println(ans);
    }
}

