import java.util.*;
import java.io.*;
import java.lang.*;


public class Main {
    static int [] zero = new int[100001];
    static int [] one = new int[100001];

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i < T; i++) {
            int n = sc.nextInt();
            fibonacci(n);
            System.out.print(zero[n]);
            System.out.print(' ');
            System.out.println(one[n]);
        }


        }

        private static void fibonacci(int n) {
            zero[0] = 1; zero[1] = 0;
            one[0] = 0; one[1] = 1;

            if(n == 0 || n == 1) return;

            for(int i = 2; i <= n; i++) {
                zero[i] = zero[i - 2] + zero[i - 1];
                one[i] = one[i - 2] + one[i - 1];
            }

        }

}
