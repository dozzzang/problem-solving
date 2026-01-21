import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        ArrayDeque<Integer> s = new ArrayDeque<>();
        int[] arr = new int[N];
        int[] nge = new int[N];
        
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            nge[i] = -1;
        }

        for(int i = 0; i < N; i++) {
            while(!s.isEmpty() && arr[s.peek()] < arr[i]) {
                nge[s.pop()] = arr[i];
            }
            s.push(i);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            sb.append(nge[i]).append(" ");
        }
        System.out.print(sb);
    }
}