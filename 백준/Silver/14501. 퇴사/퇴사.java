import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] t = new int[n + 1];
        int[] p = new int[n + 1];
        int[] d = new int[n + 2];

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = n; i >= 1; i--) {
            int nextDay = i + t[i];

            if (nextDay <= n + 1) {
                d[i] = Math.max(d[i + 1], p[i] + d[nextDay]);
            } else {
                d[i] = d[i + 1];
            }
        }

        System.out.print(d[1]);
    }
}