package module4;

public class TriangleDrawer {

    public String drawTriangle(int side) {
        String symbol = "*";
        String line = "";

        while (side > 0) {
            line += symbol.repeat(side);
            line += "\n";
            side--;
        }
        return line;
    }

    public static void main(String[] args) {
        System.out.println(new TriangleDrawer().drawTriangle(3));
//        System.out.println("*".repeat(3)); //***

    }
}
