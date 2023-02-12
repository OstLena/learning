package module7;

import java.util.Arrays;

public class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}

class DigitExtracter {

    public int[] extract(String text) {

        int arrSize = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= '0' && ch <= '9') {
                arrSize++;
            }
        }
        int[] extracted = new int[arrSize];
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char chArray = text.charAt(i);
            if (chArray >= '0' && chArray <= '9') {
                extracted[count] = Character.getNumericValue(chArray);
                count++;
            }
        }
        return extracted;
    }
}
