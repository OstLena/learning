package module11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ShuffleElementMain {

    public static void main(String[] args) {

        Stream<String> firstStream = Stream.of("A", "B", "C", "D", "E");
        Stream<String> secondStream = Stream.of("W", "X", "Y", "Z");
        Stream<String> zip = zip(firstStream, secondStream);
        List<String> shuffledResult = zip.collect(Collectors.toList());
        System.out.println(shuffledResult);
    }

    private static <T> Stream<T> zip(Stream<T> firstStream, Stream<T> secondStream) {
        List<T> result = new ArrayList<>();
        Iterator<T> firstIterator = firstStream.iterator();
        Iterator<T> secondIterator = secondStream.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            result.add(firstIterator.next());
            result.add(secondIterator.next());
        }
        return result.stream();
    }
}

