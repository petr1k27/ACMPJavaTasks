//Требуется сложить два целых числа А и В.
//
//Входные данные
//В единственной строке входного файла INPUT.TXT записаны два натуральных числа через пробел. Значения чисел не превышают 10^9.
//
//Выходные данные
//В единственную строку выходного файла OUTPUT.TXT нужно вывести одно целое число — сумму чисел А и В.

package Task1;

public class Task1 {
    public int getSum(String input) {
        String[] numbers = input.split(" ");
        return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
    }
}
