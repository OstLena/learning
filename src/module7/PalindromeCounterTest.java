package module7;

public class PalindromeCounterTest {

    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
//        System.out.println(counter.count("No palindromes"));
    }
}

class PalindromeCounter {
    public int count(String phrase) {

        int result = 0;

        String[] words = phrase.toLowerCase().split(" ");

        for (String word : words) {
            int start = 0;
            int end = word.length() - 1;
            boolean isPalindrome = true;
            while (start < end) {
                char charIndexStart = word.charAt(start);
                char charIndexEnd = word.charAt(end);
                if (charIndexStart != charIndexEnd) {
                    isPalindrome = false;
                    break;

                } else {
                    start++;
                    end--;
                }
            }
            if (isPalindrome) {
                result++;
            }
        }
        return result;
    }
}
