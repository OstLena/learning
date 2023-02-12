package module7;

import java.util.Arrays;

public class WordSplitterTest {

    public static void main(String[] args) {
        WordSplitter wordSplitter = new WordSplitter();

        String[] words = wordSplitter.split("Hello      world");

        //[hello, world]
        System.out.println(Arrays.toString(words));
    }
}


class WordSplitter {

    public String[] split(String phrase) {
        String[] newArray = phrase.split(" +");
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray[i].toLowerCase();
        }
        return newArray;
    }
}