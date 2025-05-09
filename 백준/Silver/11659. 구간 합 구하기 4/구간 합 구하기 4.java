import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int N = sc.nextInt();
       int M = sc.nextInt();
       int S[] = new int[N + 1];
       for(int i = 1; i <= N; i++)
           S[i] += S[i - 1] + sc.nextInt();
       while(M != 0) {
           M--;
           int i = sc.nextInt();
           int j = sc.nextInt();
           System.out.println(S[j] - S[i - 1]);
       }



    }
}