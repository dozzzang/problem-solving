import java.util.*;
import java.io.*;

import java.lang.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[n + 1];
        int[] d = new int[n + 1];

        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        d[1] = arr[1];

        for(int i = 2; i <= n; i++)
            for(int j = i; j >= 1; j--)
                d[i] = Math.max(arr[j] + d[i - j],d[i]);


        System.out.print(d[n]);
    }
}