package module5;

public class SpaceShip {
    private String name;

    private String serialNumber;

    public void printInfo(){
        System.out.println("Name is " + name + ", serial number is " + serialNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name.equals("") || name.length() > 100) {
            return;
        }
        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        if (serialNumber.length() > 8 || (serialNumber.charAt(0)!='S' && serialNumber.charAt(1)!='N')){
            return;
        }
        this.serialNumber = serialNumber;
    }

    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();

        ship.setName("Voyager");
        ship.setSerialNumber("SN506788");

        //Name is Voyager, serial number is SN504030
        ship.printInfo();
    }
}
