package module7;

public class NumberJoinerTest {
    public static void main(String[] args) {
        //102030
        System.out.println(new NumberJoiner().join(new int[]{10, 20, 30}));
    }
}

class NumberJoiner {
    public String join(int[] numbers) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int number : numbers) {
            stringBuilder.append(number);
        }
        return stringBuilder.toString();
    }
}
