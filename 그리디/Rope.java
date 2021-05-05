package algoridm;
import java.util.Arrays;
import java.util.Scanner;

public class Rope {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cnt = scanner.nextInt();
        int[] ropes = new int[cnt + 1];

        for (int i = 1; i <= cnt; i++) {
            ropes[i] = scanner.nextInt();
        }

        Arrays.sort(ropes);

        int max = ropes[cnt];

        for (int i = 1; i < cnt; i++) {
            max = Math.max(max, ropes[i] * (cnt - (i - 1)));
        }

        System.out.println(max);
    }
}