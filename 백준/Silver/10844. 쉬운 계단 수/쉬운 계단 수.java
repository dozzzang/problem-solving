import java.util.*;
import java.io.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long [][] d = new long[n+1][10];
        d[1][0] = 0;
        for(int i = 1; i <= 9; i++) {
            d[1][i] = 1;
        }
        long mod = 1000000000;
        for(int i = 2; i <= n; i++) {
            for(int j = 0; j <= 9; j++) {
                if(j == 0) d[i][j] = d[i - 1][1] % mod;
                else if(j == 9) d[i][j] = d[i - 1][8] % mod;
                else d[i][j] = (d[i - 1][j - 1] + d[i - 1][j + 1]) % mod;
            }
        }
        long sum = 0;
        for(int i = 0; i <= 9; i++) {
            sum = (sum + d[n][i]) % mod;
        }
        System.out.print(sum);
    }
}