package module7;

public class DoubleSpaceCleanerTest {

    public static void main(String[] args) {
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();

        //Hello World
//        System.out.println(cleaner.clean("Hello World"));

        //Hello World
        System.out.println(cleaner.clean("       Hello              World          "));
    }
}

class DoubleSpaceCleaner {

    public String clean(String phrase) {
        StringBuilder newPhrase = new StringBuilder();
        int spaceCount = 0;
        String trimmedPhrase = phrase.trim();
        for (int i = 0; i < trimmedPhrase.length(); i++) {
            char ch = trimmedPhrase.charAt(i);
            if (ch != ' ') {
                spaceCount = 0;
                newPhrase.append(ch);
            } else {
                spaceCount++;

                if (spaceCount == 1) {
                    newPhrase.append(ch);
                }
            }
        }

        return newPhrase.toString();
    }
}
