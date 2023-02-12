package module7;

public class MathDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("2+2=4"));

        //false
        System.out.println(new MathDetector().isMath("1992 is great year"));

        //false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));
    }
}

//    у тексті є хоча б один символ =;
//        у тексті є хоча б один математичний оператор +, -, *, /;
//        у тексті є мінімум 2 цифри.

class MathDetector {

    public boolean isMath(String text) {
        boolean isHasEaqual = false;
        int mathOperator = 0;
        int digitCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == '=') {
                isHasEaqual = true;
            }
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                mathOperator++;
            }

            if (ch >= '0' && ch <= '9') {
                digitCount++;
            }
        }
        if ((isHasEaqual) && (mathOperator >= 1) && (digitCount >= 2)) {
            return true;
        }
        return false;
    }
}

