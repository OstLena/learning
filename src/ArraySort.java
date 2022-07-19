import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ArraySort {
    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};

        int length = array.length;
        for (int count = 0; count <= length; count++) {
            for (int j = 0; j < length - 1; j++) {
                int first = array[j];
                int second = array[j + 1];
                if (first > second) {
                    int temp = first;
                    array[j] = second;
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
