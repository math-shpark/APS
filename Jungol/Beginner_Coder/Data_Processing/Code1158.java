import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Code1158
 */
public class Code1158 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int length = Integer.parseInt(st.nextToken());
        int[] arr = new int[length];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < length; i++) {
            int num = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (num < arr[j]) {
                    arr[j + 1] = arr[j];
                    arr[j] = num;
                } else {
                    break;
                }
            }
            
            for (int j = 0; j < length; j++) {
                System.out.print(arr[j] + " ");
            }

            System.out.println();
        }

    }
    
}