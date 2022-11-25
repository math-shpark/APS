import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Code1157
 */
public class Code1157 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = br.readLine();

        int[] countArr = new int[26];

        for (int i = 0; i < data.length(); i++) {
            char now = data.charAt(i);

            if (now >= 97) { // a ~ z
                countArr[now - 97]++;
            } else { // A ~ Z
                countArr[now - 65]++;
            }
        }

        int maxIdx = 0;
        int maxVal = countArr[0];
        boolean isDuplicated = false;
        for (int i = 1; i < 26; i++) {
            if (countArr[i] > maxVal) {
                maxIdx = i;
                maxVal = countArr[i];
                isDuplicated = false;
            } else if (countArr[i] == maxVal) {
                isDuplicated = true;
            }
        }

        if (isDuplicated) {
            System.out.println("?");
        } else {
            System.out.println((char) (maxIdx + 65));
        }

    }

}