package module4;

public class ATM {

    public int countBanknotes(int sum) {
        int count = 0;
//        500, 200, 100, 50, 20, 10, 5, 2 и 1    ...... 576......
        if (sum >= 500) {
            count += sum / 500;
            sum = sum % 500;
        }
        if (sum >= 200) {
            count += sum / 200;
            sum = sum % 200;
        }
        if (sum >= 100) {
            count += sum / 100;
            sum = sum % 100;
        }
        if (sum >= 50) {
            count += sum / 50;
            sum = sum % 50;
        }
        if (sum >= 20) {
            count += sum / 20;
            sum = sum % 20;
        }
        if (sum >= 10) {
            count += sum / 10;
            sum = sum % 10;
        }
        if (sum >= 5) {
            count += sum / 5;
            sum = sum % 5;
        }
        if (sum >= 2) {
            count += sum / 2;
            sum = sum % 2;
        }
        if (sum == 1) {
            count += 1;
        }

        return count;
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        System.out.println(atm.countBanknotes(578));
    }
}
