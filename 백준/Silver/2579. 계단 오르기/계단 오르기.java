import static java.lang.Math.*;
import java.io.*;
public class Main {
    // i는 i번째 계단, j는 연속 n개의 계단 따라서 j는 반드시 1 또는 2여야한다.
    public static int dp(int n, int[] score) {
        int[][] f = new int[n + 1][3];
        f[1][1] = score[1];
        f[1][2] = 0;
        f[2][1] = score[2];
        f[2][2] = f[1][1] + f[2][1];
        for (int i = 3; i <= n; i++) {
            f[i][1] = max(f[i - 2][1],f[i - 2][2]) + score[i];
            f[i][2] = f[i - 1][1] + score[i];
        }
        return max(f[n][1],f[n][2]);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N+1];

        for(int i = 1; i <= N; i++)
            arr[i] = Integer.parseInt(br.readLine());

        if (N == 1) {
            System.out.println(arr[1]);
        }
        else
            System.out.println(dp(N,arr));
        br.close();
    }
}