import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Code1102
 */
public class Code1102 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    int n = Integer.parseInt(br.readLine());

    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());

      String command = st.nextToken();

      switch (command) {
        case "i":
          int num = Integer.parseInt(st.nextToken());
          stack.push(num);
          break;
        case "o":
          if (stack.isEmpty()) {
            System.out.println("empty");
          } else {
            System.out.println(stack.pop());
          }
          break;
        case "c":
          System.out.println(stack.size());
          break;
      }
    }
  }
}
