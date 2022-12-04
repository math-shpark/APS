import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Code1814
 */
public class Code1814 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());

        int[] arr = new int[size];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;

        for (int idx = 1; idx < size; idx++) {
            for (int j = idx; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    count++;
                } else {
                    break;
                }
            }
        }

        System.out.println(count);
    }
    
}