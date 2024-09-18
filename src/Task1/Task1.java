package Task1;

public class Task1 {
    public int getSum(String input) {
        String[] numbers = input.split(" ");
        return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
    }
}
