public class SquareRoot {
    public static void main(String[] args) {

        //ax2 + bx + c = 0;
        double a = 0;
        double b = 10;
        double c = 0;
//double a = 0;
//        double b = 0;
//        double c = 9999999999D;

        double desc = (b * b) - (4 * a * c);
        if (desc < 0 || (a == 0 && b == 0)) {
            System.out.println("x1=");
            System.out.println("x2=");
        } else if (a == 0) {
            double res = c == 0 ? 0.0 : (-c / b);
            System.out.println("x1=" + res);
            System.out.println("x2=" + res);
        } else {
            double x1 = ((-b + Math.sqrt(desc)) / (2 * a));
            double x2 = ((-b - Math.sqrt(desc)) / (2 * a));
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        }
    }
}
