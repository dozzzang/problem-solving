import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] d = new int[n + 1];
        int[] a = new int[n + 1];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        d[1] = a[1];
        int max = d[1];

        for (int i = 2; i <= n; i++) {
            d[i] = Math.max(d[i - 1] + a[i], a[i]);
            max = Math.max(max, d[i]); 
        }

        System.out.print(max);
    }
}