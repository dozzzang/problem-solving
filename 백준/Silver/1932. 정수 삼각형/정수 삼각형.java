import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n + 1][n + 1];
        int[][] D = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= i; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        D[1][1] = arr[1][1];
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    D[i][j] = D[i - 1][1] + arr[i][j];
                } else if (j == i) {
                    D[i][j] = D[i - 1][j - 1] + arr[i][j];
                } else {
                    D[i][j] = Math.max(D[i - 1][j - 1], D[i - 1][j]) + arr[i][j];
                }
            }
        }

        int max = 0;
        for (int i = 1; i <= n; i++) {
            max = Math.max(max, D[n][i]);
        }
        
        System.out.print(max);
    }
}