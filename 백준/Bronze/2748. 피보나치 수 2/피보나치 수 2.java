import java.util.*;
import java.io.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long[] d = new long[n+1];

        d[0] = 0; d[1] = 1;

        for(int i = 2; i <= n; i++)
            d[i] = d[i -1] + d[i - 2];

        System.out.print(d[n]);
    }
}