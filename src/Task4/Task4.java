package Task4;

// Статистика
//
// Вася не любит английский язык, но каждый раз старается получить хотя бы четверку за четверть, чтобы оставаться ударником.
// В текущей четверти Вася заметил следующую закономерность: по нечетным дням месяца он получал тройки, а по четным – четверки.
// Так же он помнит, в какие дни он получал эти оценки.
// Поэтому он выписал на бумажке все эти дни для того, чтобы оценить, сколько у него троек и сколько четверок.
// Помогите Васе это сделать, расположив четные и нечетные числа в разных строчках.
// Вася может рассчитывать на оценку 4, если четверок не меньше, чем троек.
//
//     Входные данные
// В первой строке входного файла INPUT.TXT записано единственное число N – количество элементов целочисленного массива (1 ≤ N ≤ 100).
// Вторая строка содержит N чисел, представляющих заданный массив. Каждый элемент массива – натуральное число от 1 до 31.
// Все элементы массива разделены пробелом.
//
//     Выходные данные
// В первую строку выходного файла OUTPUT.TXT нужно вывести числа, которые соответствуют дням месяцев, в которые Вася получил тройки,
// а во второй строке соответственно расположить числа месяца, в которые Вася получил четверки. В третьей строке нужно вывести «YES»,
// если Вася может рассчитывать на четверку и «NO» в противном случае. В каждой строчке числа следует выводить в том же порядке,
// в котором они идут во входных данных. При выводе числа отделяются пробелом.

import java.util.Arrays;

public class Task4 {
    public void getStatistics(String numberOfDays, String days) {
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
