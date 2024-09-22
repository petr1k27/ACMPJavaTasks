import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        getStatistics(reader.readLine(), reader.readLine());
    }

    public static void getStatistics(String numberOfDays, String days) {
        String[] arrayOfDays = days.split(" ");
        String[] evenDays = Arrays.stream(arrayOfDays)
                .mapToInt(Integer::parseInt)
                .filter(day -> day % 2 == 0)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);
        String[] oddDays = Arrays.stream(arrayOfDays)
                .mapToInt(Integer::parseInt)
                .filter(day -> day % 2 != 0)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);
        System.out.println(String.join(" ", Arrays.asList(oddDays)));
        System.out.println(String.join(" ", Arrays.asList(evenDays)));
        System.out.println(evenDays.length >= oddDays.length ? "YES" : "NO");
    }
}