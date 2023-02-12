package module3;

public class QuadraticEquationSolver {
//        public double[] solve(int a, int b, int c) {
//        double discriminant = Math.pow(b, 2) - (4 * a * c);
//
//        if (discriminant < 0) {
//            return new double[0];
//        } else if (discriminant == 0) {
//            double valueOne = (-b + Math.sqrt(discriminant)) / (2 * a);
//            return new double[]{valueOne};
//        } else {
//            double valueOne = (-b + Math.sqrt(discriminant)) / (2 * a);
//            double valueTwo = (-b - Math.sqrt(discriminant)) / (2 * a);
//            return new double[]{valueOne, valueTwo};
//        }
//    }
    public double[] solve(int a, int b, int c) {

        double discriminant = Math.pow(b, 2) - (4 * a * c);
        double core1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double core2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        if (discriminant < 0) {
            return new double[0];
        } else if (discriminant == 0) {
            return new double[]{core1};
        } else {
            return new double[]{core1, core2};
        }
    }

    public static void main(String[] args) {
        QuadraticEquationSolver equationSolver = new QuadraticEquationSolver();
        equationSolver.solve(8, -80, 192);
    }
}
