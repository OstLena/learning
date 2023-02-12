package module7;

public class PunctuationMarkCounterTest {

    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();

        //2
        System.out.println(counter.count("Hello, world!"));

        //1
        System.out.println(counter.count("This is Sparta!"));

        //1
        System.out.println(counter.count("End."));
    }
}

class PunctuationMarkCounter {

    public int count(String phrase) {
        int countResult = 0;

        for (int i = 0; i < phrase.length(); i++) {
            char ch = phrase.charAt(i);
            if (ch == '.' || ch == ',' || ch == '!' || ch == ':' || ch == ';') {
                countResult++;
            }
        }
        return countResult;
    }
}
