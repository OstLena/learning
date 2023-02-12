package module3;

public class CaptainDisputeAgain {
    public int findMin(int[] triple) {
        int res = triple[0] < triple[1] ? triple[0] : triple[1];
        int finalResult = res < triple[2] ? res : triple[2];
        return finalResult;
    }
}
