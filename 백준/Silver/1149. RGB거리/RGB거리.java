import static java.lang.Math.*;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] R = new int[N + 1];
        int[] G = new int[N + 1];
        int[] B = new int[N + 1];

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            R[i + 1] = Integer.parseInt(st.nextToken());
            G[i + 1] = Integer.parseInt(st.nextToken());
            B[i + 1] = Integer.parseInt(st.nextToken());
        }
        int[][] C = new int[N + 1][3];
        C[1][0] = R[1];
        C[1][1] = G[1];
        C[1][2] = B[1];
        for(int i = 2; i <= N; i++) {
            C[i][0] = min(C[i-1][1],C[i-1][2]) + R[i];
            C[i][1] = min(C[i-1][0],C[i-1][2]) + G[i];
            C[i][2] = min(C[i-1][0],C[i-1][1]) + B[i];
        }
        int min = Arrays.stream(C[N]).min().orElse(0);
        System.out.println(min);
        br.close();
    }
}