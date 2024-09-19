import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int result = getSum(reader.readLine());
        System.out.println(result);
    }

    public static int getSum(String input) {
        int N = Integer.parseInt(input);
        return (N > 0 ? ((1 + N) * N) / 2 : N < 0 ? -(((1 + Math.abs(N)) * Math.abs(N) / 2) - 1) : 1);
    }
}
