import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long result = sqr(reader.readLine());
        System.out.println(result);
    }

    public static long sqr(String number) {
        if (number.length()== 1 || number.equals("5")) {
            return 25;
        } else {
            int subNumber = Integer.parseInt(number.substring(0, number.length() - 1));
            return Long.parseLong(subNumber * (subNumber + 1) + "25");
        }
    }
}
