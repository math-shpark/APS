package Jungol.Beginner_Coder.Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Code1175
 */
public class Code1175 {
    private static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        for (int i = 1; i <= 6; i++) {
            arr[0] = i;
            stack(arr, 1, i);
        }

    }

    private static void stack(int[] arr, int count, int sum) {
        // end option
        if (count == n) {
            if (sum == m) {
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
            return;
        } else if (sum >= m) {
            return;
        }

        for (int i = 1; i <= 6; i++) {
            arr[count] = i;
            stack(arr, count + 1, sum + i);
        }
    }
}