package module5;

public class Engine {

    private int power;


    public String getFuelType() {
        return "A500";
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public static void main(String[] args) {
        Engine basicEngine = new Engine();
        System.out.println(basicEngine.getFuelType()); //A500

        Engine xFuelEngine = new XFuelEngine();
        System.out.println(xFuelEngine.getFuelType()); //XFuel
    }
}

class XFuelEngine extends Engine {
    protected String serialNumber;

    public String getFuelType() {
        return "XFuel";
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}

class AdvancedXFuelEngine extends XFuelEngine {
    public void printInfo() {
        System.out.println("Serial number is " + serialNumber + ", power is " + getPower());
    }
}
