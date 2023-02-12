package module5;

public class SpaceRocketLauncher {
    private int bigRocketCount;
    private int smallRocketCount;

    public void launchBigRocket() {
        if (bigRocketCount > 0) {
            bigRocketCount -= 1;
            System.out.println("Launch big rocket");
        }
    }

    public void launchSmallRocket() {
        if (smallRocketCount > 0) {
            smallRocketCount -= 1;
            System.out.println("Launch small rocket");
        }
    }

    public int getTotalPower() {
        return (smallRocketCount * 50) + (bigRocketCount * 100);
    }

    public int getBigRocketCount() {
        return bigRocketCount;
    }

    public void setBigRocketCount(int bigRocketCount) {
        if (bigRocketCount < 0 || bigRocketCount > 100) {
            return;
        }
        this.bigRocketCount = bigRocketCount;
    }

    public int getSmallRocketCount() {
        return smallRocketCount;
    }

    public void setSmallRocketCount(int smallRocketCount) {

        if (smallRocketCount < 0 || smallRocketCount > 100) {
            return;
        }
        this.smallRocketCount = smallRocketCount;
    }
}
