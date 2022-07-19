public class PineTree {
    public static void main(String[] args) {
        int height = 3;
        int length = 5;

        for (int i = 0; i < height; i++) {
            int left = length / 2 - i;
            int right = length / 2 + i;
            for (int j = 0; j <= length; j++) {
                if (j >= left && j <= right) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
