package module6;

public class RectangleTest {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(75, 90);
        Rectangle r2 = new Rectangle(75, 85);
        Rectangle r3 = new Rectangle(10, 15);

        //false
        System.out.println(r1.canPlaceInto(r2));

//        //true
//        System.out.println(r1.canPlaceInto(r3));
//
//        //true
//        System.out.println(r2.canPlaceInto(r3));
//
//        //false
//        System.out.println(r3.canPlaceInto(r2));
    }
}

class Rectangle {
    private int sideA;
    private int sideB;

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public Rectangle(int a, int b) {
        this.sideA = a;
        this.sideB = b;
    }

    public boolean canPlaceInto(Rectangle anotherRect) {


        boolean isSideA1SmallerA2 = getSideA() <= anotherRect.getSideA();
        boolean isSideA1SmallerB2 = getSideA() <= anotherRect.getSideB();
        boolean isSideB1SmallerA2 = getSideB() <= anotherRect.getSideA();
        boolean isSideB1SmallerB2 = getSideB() <= anotherRect.getSideB();
        return ((isSideA1SmallerA2 && isSideB1SmallerB2) ||
                (isSideA1SmallerB2 && isSideB1SmallerA2));
    }
}
