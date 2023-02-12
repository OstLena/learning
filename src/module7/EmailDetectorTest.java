package module7;

public class EmailDetectorTest {

    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresent("No email present, but @ there"));
    }
}

class EmailDetector {


    //    xx@xx, де замість x -
    public boolean isPresent(String text) {

        boolean isEmailPresent = false;
        for (int i = 1; i < text.length() - 1; i++) {
            char ch = text.charAt(i);
            if ('@' == ch) {

                if (text.charAt(i - 1) != ' ' && text.charAt(i + 1) != ' '
                        && text.charAt(i - 2) != ' ' && text.charAt(i + 2) != ' ') {
                    return true;
                }
            }
        }
        return false;
    }
}
