package module7;

public class WordCombineTest {

    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}

class WordCombine {

    public boolean canCombine(String sourceWord, String targetWord) {
        String source = sourceWord.toLowerCase();
        String target = targetWord.toLowerCase();
        for (int i = 0; i < target.length(); i++) {
            boolean result = false;
            for (int j = 0; j < source.length(); j++) {
                if (source.charAt(j) == target.charAt(i)) {
                    result = true;
                    break;
                }
            }
            if (!result) {
                return false;
            }
        }
        return true;
    }
}
