package module6;

public class RectangleAreaTest {
    public static void main(String[] args) {
        int[] coords = {2, 2, 12, 12};

        //Expect 100
        System.out.println(new RectangleArea(coords).getArea());
    }
}

class RectangleArea {
    private int xPointOne;
    private int yPointOne;
    private int xPointTwo;
    private int yPointTwo;

    public RectangleArea(int[] coords) {
        xPointOne = coords[0];
        yPointOne = coords[1];
        xPointTwo = coords[2];
        yPointTwo = coords[3];
    }

    public int getArea() {
        int result = (xPointTwo - xPointOne) * (yPointTwo - yPointOne);
        if (result < 0) {
            result *= -1;
        }
        return result;
    }
}
