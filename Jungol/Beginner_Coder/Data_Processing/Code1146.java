import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Code1146
 */
public class Code1146 {

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

        for (int i = 0; i < length - 1; i++) {
            int min = arr[i];
            int minIdx = i;

            for (int j = i + 1; j < length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIdx = j;
                }
            }

            if (minIdx != i) {
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }

            for (int j = 0; j < length; j++) {
                System.out.print(arr[j] + " ");
            }

            System.out.println();
        }

    }
}