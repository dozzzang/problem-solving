import static java.lang.Math.*;
import java.io.*;

public class Main {

    public static int dp(int n) {
        int[] f = new int[n + 1];
        f[1] = 0;
        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + 1;

            if(i % 2 == 0)
                f[i] = min(f[i/2] + 1, f[i]);
            if(i % 3 == 0)
                f[i] = min(f[i/3] + 1,f[i]);
            }
        return f[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(dp(N));
        br.close();
    }
}