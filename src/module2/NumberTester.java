package module2;

public class NumberTester {


    public boolean isEven(int number) {
        int result;
        result = number % 2;
        if (result == 0) {
            return true;
        } else {
            return false;
        }
    }

//    public boolean isOdd(int number) {
//        int result;
//        result = number % 2;
//        if (result != 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    public boolean isOdd(int number) {
        return number %2 !=0;
    }




    //Test output
    public static void main(String[] args) {
        NumberTester tester = new NumberTester();
        System.out.println(tester.isEven(10)); //Should be true
    }
}

