package module7;

public class DigitTextTest {

    public static void main(String[] args) {
        //true
        System.out.println(new DigitText().detect("23 50"));

        //false
        System.out.println(new DigitText().detect("Year 1990"));
    }
}

class DigitText {

    public boolean detect(String text) {

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if ((ch < '0' || ch > '9') && ch != ' ') {
                return false;
            }
        }
        return true;
    }
}
