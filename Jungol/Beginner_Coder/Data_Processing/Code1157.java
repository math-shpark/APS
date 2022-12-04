import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Code1157
 */
public class Code1157 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(st.nextToken());

        int[] arr = new int[size];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        } // data input

        for (int i = 1; i < size; i++) {
            for (int idx = 0; idx < size - i; idx++) {
                if (arr[idx] > arr[idx + 1]) {
                    int temp = arr[idx];
                    arr[idx] = arr[idx + 1];
                    arr[idx + 1] = temp;
                }
            }

            for (int j = 0; j < size; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
    
}