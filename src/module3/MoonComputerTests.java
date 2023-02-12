package module3;


import java.util.*;

public class MoonComputerTests {
    public void testBasicInputOutput() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(line);
        scanner.close();
    }

    //Test output on 24, 4 standard input
    public static void main(String[] args) {
        new MoonComputerTests().testMath();
    }

    public void testMath() {
        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        int sum = value1 + value2;
        int substract = value1 - value2;
        int multiple = value1 * value2;
        int divide = value1 / value2;
        System.out.println(sum + " " + substract + " " + multiple + " " + divide);
        scanner.close();
    }

    public void testLogicalOperators(){
        Scanner scanner = new Scanner(System.in);
        boolean val1 = scanner.nextBoolean();
        boolean val2 = scanner.nextBoolean();
        boolean val3 = scanner.nextBoolean();
        System.out.println(val1 & val2 & val3);
        System.out.println(val1 | val2 | val3);
        scanner.close();
    }
}
