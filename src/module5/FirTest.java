package module5;

public class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNum();
        FirTest firTest = new FirTest();

        //Should be 10
//        System.out.println(firTest.test(firNum, 10));
        System.out.println(new FirNumFactorial().calc(4));
    }
}

class FirNum {
    public int calc(int n) {
        return n;
    }
}

class FirNumSum extends FirNum {

    @Override
    public int calc(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

class FirNumFactorial extends FirNum {
    @Override
    public int calc(int n) {
        int result = 1;
        if (n == 0) {
            return 1;
        } else {
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
        }

        return result;
    }
}

class FirNumMultiplyOdd extends FirNum {
    @Override
    public int calc(int n) {

        int result = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                result *= i;
            }
        }
        return result;
    }
}

class FirNumFizzBuzz extends FirNum {
    @Override
    public int calc(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 ^ i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

class FirNumBasis extends FirNum {
    @Override
    public int calc(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum / 2;
    }
}