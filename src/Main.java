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
        String[] numbers = input.split(" ");
        return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
    }
}
