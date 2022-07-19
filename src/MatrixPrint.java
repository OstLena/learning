public class MatrixPrint {
    public static void main(String[] args) {
        int size = 5;
        int[][] matrix = new int[size][size];
        int iter = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i == size - 1 - j) {
                    System.out.print(" * ");
                } else {
                    if (iter < 10) {
                        System.out.print(" " + iter + " ");
                    } else {
                        System.out.print(iter + " ");
                    }
                }
                iter++;
            }
            System.out.println();
        }


    }
}