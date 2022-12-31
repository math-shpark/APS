package Jungol.Beginner_Coder.Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Code1169
 */
public class Code1169 {

    private static int n, m;
    private static boolean[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        for (int i = 1; i <= 6; i++) {
            arr[0] = i;

            if (m == 3) {
                check = new boolean[6];
                check[i - 1] = true;
                stack(arr, 1);
                check[i - 1] = false;
            } else {
                stack(arr, 1);
            }
        }

    }

    // recursion
    private static void stack(int[] arr, int count) {
        // end option
        if (count == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.println();
            return;
        }

        // recursion
        if (m == 1) {
            for (int i = 1; i <= 6; i++) {
                arr[count] = i;
                stack(arr, count + 1);
            }
        } else if (m == 2) {
            for (int i = arr[count - 1]; i <= 6; i++) {
                arr[count] = i;
                stack(arr, count + 1);
            }
        } else {
            for (int i = 1; i <= 6; i++) {
                if (check[i - 1]) {
                    continue;
                }

                arr[count] = i;
                check[i - 1] = true;
                stack(arr, count + 1);
                check[i - 1] = false;
            }
        }

    }
}