package module5;

public class Stars {

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        String name = "";
        int[] starts = new int[]{1000, 100, 10, 1};
        char[] symbols = new char[]{'X', 'Y', 'Z', '*'};

        for (int i = 0; i < starts.length; i++) {
            int result = count / starts[i];
            for (int j = 0; j < result; j++) {
                name += symbols[i];
            }
            count -= result * starts[i];
        }
        return name;
    }

    public static void main(String[] args) {
        Stars stars = new Stars();
        stars.setCount(153);
        System.out.println(stars);
        System.out.println(stars.getCount());
    }


}
