package module7;

public class NameCounterTest {
    public static void main(String[] args) {
        //1
//        System.out.println(new NameCounter().count("Mars is great planet"));

        //2
//        System.out.println(new NameCounter().count("Moon is near Earth"));

        //0
        System.out.println(new NameCounter().count("SPACE IS GREAT"));
    }
}

class NameCounter {

    public int count(String text) {

        int countBig = 0;
        String[] words = text.split(" ");

        for (String word : words) {
            if (word.length() >= 2) {
                if ((word.charAt(0) >= 'A' && word.charAt(0) <= 'Z')) {
                    boolean isSmall = true;
                    for (int i = 1; i < word.length(); i++) {
                        if (word.charAt(i) < 'a' || word.charAt(1) > 'z') {
                            isSmall = false;
                        }
                    }
                    if (isSmall) {
                        countBig++;
                    }
                }
            }
        }
        return countBig;
    }

}
