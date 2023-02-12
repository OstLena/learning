package module4;

public class TrurlBank {

    public int sumQuads(int n) {
        int sum = 0;
        int index = 1;
        while (n >= 1) {
            sum += (int) Math.pow(index, 2);
            n--;
            index++;
        }
        return sum;
    }

    public int countSumOfDigits(int number) {
        int sum = 0;
        int result = 0;
        int restValue = 0;
        while (number > 10) {
            result = number % 10;
            number = number / 10;
            sum += result;
        }
        sum += number;
        return sum;
    }

    public static void main(String[] args) {
        TrurlBank bank = new TrurlBank();

        //Should be 14 - 1 + 4 + 9
//        System.out.println(bank.sumQuads(3));
//        System.out.println(1 % 10);
        System.out.println(bank.countSumOfDigits(7));
    }
}
