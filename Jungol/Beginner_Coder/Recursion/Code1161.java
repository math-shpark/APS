package Jungol.Beginner_Coder.Recursion;

import java.util.Scanner;

/**
 * Code1161
 */
public class Code1161 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        hanoi(n, 1, 3, 2);

        scan.close();
    }

    private static void hanoi(int n, int start, int end, int via) {

        if (n == 0) {
            return;
        }

        hanoi(n - 1, start, via, end);
        System.out.println(n + " : " + start + " -> " + end);
        hanoi(n - 1, via, end, start);

    }
}
