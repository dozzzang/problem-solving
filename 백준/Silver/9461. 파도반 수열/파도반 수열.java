import java.util.*;
import java.io.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());

        long[] d = new long[101];

        d[1] = 1;
        d[2] = 1;
        d[3] = 1;
        int start = 4;

        for(int i = 1; i <= t; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            if(d[n] != 0) System.out.println(d[n]);
            else {
                for(int j = start; j <= n; j++) {
                    d[j] = d[j - 2] + d[j - 3];
                }
                start = n;
                System.out.println(d[n]);
            }
        }
    }
}