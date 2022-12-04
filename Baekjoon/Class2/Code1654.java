package Baekjoon.Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Code1654
 */
public class Code1654 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] length = new int[k];
        long max = 0;
        long min = 1;
        long result = 0;

        for (int i = 0; i < k; i++) {
            length[i] = Integer.parseInt(br.readLine());
            if (max < length[i])
                max = length[i];
        }

        long mid = (max + min) / 2;
        while (max >= min) {
            long count = 0;
            for (int i = 0; i < k; i++) {
                count += length[i] / mid;
            }

            if (count >= n) {
                if (result < mid) {
                    result = mid;
                }
                min = mid + 1;
            } else {
                max = mid - 1;
            }
            mid = (max + min) / 2;
        }

        System.out.println(result);
    }
    
}