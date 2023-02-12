package module7;

public class BigOrSmallTest {

    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}

class BigOrSmall {

    public String calculate(String text) {
        int smallCount = 0;
        int bigCount = 0;
        String result = null;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                bigCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            }
        }
        if (smallCount > bigCount) {
            result = "Small";
        } else if (smallCount < bigCount) {
            result = "Big";
        } else if (smallCount == bigCount) {
            result = "Same";
        }
        return result;
    }
}

