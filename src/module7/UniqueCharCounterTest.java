package module7;

public class UniqueCharCounterTest {

    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}

class UniqueCharCounter {

    public int count(String phrase) {
        if (phrase.length() == 0) {
            return 0;
        }
        int result = 1;

        for (int i = 0; i < phrase.length() - 1; i++) {
            char charI = phrase.charAt(i);

            boolean isUnique = true;
            for (int j = i + 1; j < phrase.length(); j++) {
                char charJ = phrase.charAt(j);
                if (charI == charJ) {
                    isUnique = false;
                }
            }
            if (isUnique) {
                result++;
            }
        }
        return result;
    }
}
