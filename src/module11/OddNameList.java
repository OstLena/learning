package module11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OddNameList {

    public static void main(String[] args) {

        String[] names = {"Lisa", "Homer", "Bart", "Marge", "Moe", "Maggie", "Milhouse", "Lenny"};

        String oddNames = getOddNames(names);
        System.out.println(oddNames);
        List<String> alphabeticSortedNames = getAlphabeticSortedNames(names);
        System.out.println(alphabeticSortedNames);

    }

    private static String getOddNames(String[] names) {
        return IntStream.range(1, names.length)
                .filter(index -> index % 2 != 0)
                .mapToObj(index -> index + ". " + names[index])
                .collect(Collectors.joining(","));
    }

    private static List<String> getAlphabeticSortedNames(String[] names) {
        return Arrays.stream(names)
                .map(name -> name.toUpperCase())
                .sorted((o1, o2) -> o2.compareTo(o1))
                .collect(Collectors.toList());
    }
}
