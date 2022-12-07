import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Code2858
 */
public class Code2858 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String data = br.readLine();

    int count = 0;
    int remain = 0;

    for (int i = 0; i < data.length(); i++) {
      char now = data.charAt(i);
      char compare;

      switch (now) {
        case '(':
          compare = data.charAt(i + 1);
          if (compare == ')') {
            count += remain;
          } else {
            remain++;
          }
          break;
        case ')':
          compare = data.charAt(i - 1);
          if (compare == ')') {
            count++;
            remain--;
          }
          break;
      }
    }

    System.out.println(count);
  }
}
