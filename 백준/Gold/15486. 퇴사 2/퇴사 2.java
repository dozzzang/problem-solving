import java.util.*;
import java.io.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] t = new int[n + 1];
        int[] p = new int[n + 1];
        long[] d = new long[n + 2];

        for(int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = n; i >= 1; i--) {
            if(t[i] + i - 1> n) d[i] = d[i + 1];
            else {
                d[i] = Math.max(p[i] + d[i + t[i]], d[i+1]);
            }
        }
        System.out.print(d[1]);
    }
}