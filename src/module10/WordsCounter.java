package module10;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

public class WordsCounter {

    public static void main(String[] args) {

        Map<String, Integer> wordsMap = new HashMap<>();
        try (InputStream fis = new FileInputStream("src/module10/words.txt");
             Scanner scanner = new Scanner(fis)) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (!wordsMap.containsKey(word)) {
                    wordsMap.put(word, 1);
                } else {
                    wordsMap.put(word, wordsMap.get(word) + 1);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Comparator<String> comparator = (o1, o2) -> wordsMap.get(o1).compareTo(wordsMap.get(o2)) > 0 ? 1 : -1;
        Map<String, Integer> result = new TreeMap<>(comparator.reversed());
        result.putAll(wordsMap);

        result.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });
    }
}

