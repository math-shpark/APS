package Jungol.Beginner_Coder.Recursion;

import java.util.Scanner;

/**
 * Code1459
 */
public class Code1459 {

    private static int[] arr;
    private static int n;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();

        arr = new int[n + 1];
        int[] result = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            boolean isOk = search(i);
            if (isOk) {
                result[i] = 1;
                result[arr[i]] = 1;
            }
        }

        int size = 0;
        for (int i = 1; i <= n; i++) {
            if (result[i] == 1) {
                size++;
            }
        }

        System.out.println(size);

        for (int i = 1; i <= n; i++) {
            if (result[i] == 1) {
                System.out.println(i);
            }
        }

        scan.close();

    }

    private static boolean search(int idx) {
        boolean isOk = false;

        int start = idx;
        int now = arr[idx];

        for (int i = 1; i <= n; i++) {
            if (start == now) {
                isOk = true;
                break;
            }

            now = arr[now];
        }

        return isOk;
    }
}