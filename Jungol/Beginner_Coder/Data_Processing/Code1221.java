import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Code1221
 */
public class Code1221 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < m; i++) {
            String input = st.nextToken();

            if (input.equals("+") || input.equals("*") || input.equals("/") || input.equals("-")) {
                int num2 = stack.pop();
                int num1 = stack.pop();

                switch (input) {
                    case "*":
                        stack.add(num1 * num2);
                        break;
                    case "/":
                        stack.add(num1 / num2);
                        break;
                    case "+":
                        stack.add(num1 + num2);
                        break;
                    case "-":
                        stack.add(num1 - num2);
                        break;
                }
            } else {
                stack.add(Integer.parseInt(input));
            }

        }
        
        System.out.println(stack.pop());
    }
}