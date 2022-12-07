import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * Code1697
 */
public class Code1697 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> que = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            String command = st.nextToken();

            switch (command) {
                case "i":
                    int num = Integer.parseInt(st.nextToken());
                    que.add(num);
                    break;
                case "o":
                    if (que.isEmpty()) {
                        System.out.println("empty");
                    } else {
                        System.out.println(que.poll());
                    }
                    break;
                case "c":
                    System.out.println(que.size());
                    break;
            }
        }
    }
}