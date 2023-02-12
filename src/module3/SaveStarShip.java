package module3;

import java.util.Arrays;
import java.util.Scanner;

public class SaveStarShip {

    //Test output
//    String galaxyOne = "Miaru";
//    String galaxyTwo = "Milkyway";
//    String galaxyThree = "DangerBanger";
    String[] Miaru = {"Maux", "Reux", "Piax"};
    String[] Milkyway = {"Earth", "Mars", "Jupiter"};
    String[] DangerBanger = {"Fobius", "Demius"};

//    public String[] getPlanets(String galaxy) {
//        switch (galaxy) {
//            case ("Miaru"):
//                return Miaru;
//            case ("Milkyway"):
//                return Milkyway;
//            case ("DangerBanger"):
//                return DangerBanger;
//            default:
//                return new String[0];
//        }
//    }

    public String[] getPlanets(String galaxy) {
        if ("Miaru".equals(galaxy)) {
            return Miaru;
        } else if ("Milkyway".equals(galaxy)) {
            return Milkyway;
        } else if ("DangerBanger".equals(galaxy)) {
            return DangerBanger;
        } else {
            return new String[0];
        }
    }

    public String choosePlanet(long distanceToEarth) {
        if (distanceToEarth < 45677) {
            return "Earth";
        } else {
            return "Pern";
        }
    }

    public int calculateFuelPrice(String fuel, int count) {
        if ("STAR100".equals(fuel)) {
            return count * 70;
        } else if ("STAR500".equals(fuel)) {
            return count * 120;
        } else if ("STAR1000".equals(fuel)) {
            return count * 200;
        } else
            return count * 50;
    }

    public int roundSpeed(int speed) {
        if (speed % 10 < 5) {
            return speed - (speed % 10);
        } else
            return speed + (10 - (speed % 10));
    }

    public int calculateNeededFuel(int distance) {
        if (distance <= 20) {
            return 1000;
        } else
            return 1000 + (distance % 20 * 5);
    }

    public void calculateMaxPower() {

        Scanner scanner = new Scanner(System.in);
        int valueOne = scanner.nextInt();
        int valueTwo = scanner.nextInt();
        int valueThree = scanner.nextInt();
        int midResult = valueOne > valueTwo ? valueOne : valueTwo;
        int result = midResult > valueThree ? midResult : valueThree;
        if (result < 10) {
            System.out.println(result * 0.7f);
        } else if (result >= 10 && result <= 100) {
            System.out.println(result * 1.2f);
        } else {
            System.out.println(result * 2.1f);
        }
        scanner.close();
    }


    public String getMyPrizes(int ticket) {
        String result = "";

        if (ticket % 10 == 0) {
            result = "crystall";
        }
        if (ticket % 10 == 7) {
            if (result.equals("")) {
                result = "chip";
            } else {
                result = result + " chip";
            }
        }
        if (ticket > 200) {
            if (result.equals("")) {
                result = "coin";
            } else {
                result = result + " coin";
            }
        }
        return result;
    }

//    public boolean isHangarOk(int side1, int side2, int price) {
//        double result = side1 >= side2 ? (double) side1 / side2 : (double) side2 / side1;
//        if (side1 * side2 >= 1500 && price / (side1 * side2) <= 1000 && result <= 2) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    public boolean isHangarOk(int side1, int side2, int price){

        double maxSide = side1 >=side2? (double)side1 / side2 : (double)side2 /side1;
        int sqrt = side1 * side2;
        return ((sqrt >= 1500) && (maxSide <=2) && ((price/sqrt)<1000));
    }


    public int calculateDistance(int distance) {
        if (distance >= 0) {
            return distance;
        } else distance = distance * -1;
        return distance;
    }

    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

        //Should be 10
//        System.out.println(ship.calculateDistance(-10));

        //Should be [Fobius, Demius]
//        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));

        //Should be Earth
//        System.out.println(ship.choosePlanet(10));

        //Should be 700
//        System.out.println(ship.calculateFuelPrice("STAR100", 10));

        //Should be 60
//        System.out.println(ship.roundSpeed(55));

        //Should be 1005
//        System.out.println(ship.calculateNeededFuel(1001));

        //Test stdin data - 1 3 5.
        //Console ouput should be 3.5
//        ship.calculateMaxPower();

        //Should be "crystall coin"
//        System.out.println(ship.getMyPrizes(250));

        //Should be true
        System.out.println(ship.isHangarOk(140, 61, 2194780 ));
    }
}
