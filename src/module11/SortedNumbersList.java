package module11;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortedNumbersList {

//    ["1, 2, 0", "4, 5"]

//    Необхідно отримати з масиву всі числа, і вивести їх у відсортованому вигляді через кому ,, наприклад:
//
//            "0, 1, 2, 4, 5"

    public static void main(String[] args) {
        String[] numbers = {"1, 2, 0", "4, 5"};

        String resultedNumbers = getExtractedSortedNumbersFromArray(numbers);
        System.out.println(resultedNumbers);
    }

    private static String getExtractedSortedNumbersFromArray(String[] numbers) {
        return Arrays.stream(numbers)
                .map(str -> str.split(", "))
                .flatMap(Arrays::stream)
                .map(str ->Integer.parseInt(str))
                .sorted()
                .map(i -> i.toString())
                .collect(Collectors.joining(", "));
    }
}
