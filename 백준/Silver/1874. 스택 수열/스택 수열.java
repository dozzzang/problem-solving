import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());

       int n = Integer.parseInt(st.nextToken());
       int[] arr = new int[n];

       for(int i = 0; i < n; i++){
           st = new StringTokenizer(br.readLine());
           arr[i] = Integer.parseInt(st.nextToken());
       }
        Stack<Integer> stack = new Stack();
       StringBuffer sb = new StringBuffer();
       int num = 1;
       boolean result = true;
       for(int i = 0; i < arr.length; i++) {
           int cur = arr[i];
           if (cur >= num) {
               while (cur >= num) {
                   stack.push(num);
                   num++;
                   sb.append("+\n");
               }
               stack.pop();
               sb.append("-\n");
           } else {
               int sn = stack.pop();
               if (sn > cur) {
                   System.out.println("NO");
                   result = false;
                   break;
               }
               else {
                   sb.append("-\n");
               }

           }
       }
        if (result) {
            System.out.println(sb.toString());
        }
    }
}