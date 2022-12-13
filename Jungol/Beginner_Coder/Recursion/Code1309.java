package Jungol.Beginner_Coder.Recursion;

import java.util.Scanner;

/**
 * Code1309
 */
public class Code1309 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        for (int i = 0; i < n - 1; i++) {
            System.out.println((n - i) + "! = " + (n - i) + " * " + (n - i - 1) + "!");
        }

        System.out.println("1! = 1");

        System.out.println(result);

        scan.close();
    }
}