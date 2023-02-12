package module7;

public class SensitiveDataSearcherTest {

    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
//        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
    }
}

class SensitiveDataSearcher {

//    pass, key, login, email

    public boolean isSensitiveDataPresent(String phrase) {
        String[] words = phrase.toLowerCase().split(" ");
        String[] sensitiveWords = {"pass", "key", "login", "email"};

        for (String word : words) {
            for (String sensitiveWord : sensitiveWords) {
                if (word.equals(sensitiveWord)) {
                    return true;

                }
            }
        }
        return false;
    }
}
