package module6;

public class DistanceTest {

    public static void main(String[] args) {
        //Expect 14
        System.out.println(new Distance(10, 10, 20, 20).getDistance());

        //Expect 23
        System.out.println(new Distance(10, 10, 27, 25).getDistance());
    }

}

class Distance {

    private int startX;
    private int startY;
    private int endX;
    private int endY;

    public int getStartX() {
        return startX;
    }

    public int getStartY() {
        return startY;
    }

    public int getEndX() {
        return endX;
    }

    public int getEndY() {
        return endY;
    }

    public Distance(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public int getDistance() {
        int xPoint = getEndX() - getStartX();
        int yPoint = getEndY() - getStartY();
        double powXPoint = Math.pow(xPoint, 2);
        double powYPoint = Math.pow(yPoint, 2);
        return (int)Math.round(Math.sqrt(powXPoint + powYPoint));

    }
}
