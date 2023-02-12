package module7;

public class PalindromeDetectorTest {
    public static void main(String[] args) {
        //false
        System.out.println(new PalindromeDetector().isPalindrome("Java"));

        //true
        System.out.println(new PalindromeDetector().isPalindrome("Noon"));
    }
}

class PalindromeDetector {
    public boolean isPalindrome(String word) {
        return word.equalsIgnoreCase(reverse(word));
    }

    private String reverse(String word) {

        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = word.toCharArray();
        for (char c : chars) {
            stringBuilder.append(c);
        }
        return stringBuilder.reverse().toString();
    }
}
