package module7;

public class WordDeleterTest {

    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.remove("Hello Java", new String[]{"Java"}));

        //This Sparta
        System.out.println(wordDeleter.remove("This is Sparta", new String[]{"is"}));
    }
}

class WordDeleter {

    public String remove(String phrase, String[] words) {

        StringBuilder result = new StringBuilder();
        String[] phrases = phrase.split(" ");


        for (String element : phrases) {

            boolean isNeedToReplace = false;
            for (String word : words) {
                if (word.equals(element)) {
                    isNeedToReplace = true;
                }
            }
            if (!isNeedToReplace) {
                if (result.length() == 0) {
                    result.append(element);
                } else {
                    result.append(" " + element);
                }
            }
        }
        return result.toString();
    }
}


