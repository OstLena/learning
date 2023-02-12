package module3;

import java.util.*;

public class HarekCity {

    public String[] createEmptyNameArray() {
        String[] result = new String[0];
        return result;
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {

        int[] result = {age1, age2, age3, age4};
        return result;
    }

    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }

    public String firstAndLastTogether(String[] names) {
        return names[0] + " AND " + names[9] + " TOGETHER";
    }

    public void changeElectResult(String[] results) {
        if (results.length >= 2) {
            String tempResult = results[0];
            results[0] = results[results.length - 1];
            results[results.length - 1] = tempResult;
        }
    }

    public String[] changeElectResultAgain(String[] results) {
        String[] newElectionResult = new String[3];
        newElectionResult[0] = results[2];
        newElectionResult[1] = results[3];
        newElectionResult[2] = results[4];
        return newElectionResult;
    }

    public char[][] createKeyboard() {
        char[][] keyBoard = new char[4][3];
        keyBoard[0][0] = '1';
        keyBoard[0][1] = '2';
        keyBoard[0][2] = '3';

        keyBoard[1][0] = '4';
        keyBoard[1][1] = '5';
        keyBoard[1][2] = '6';

        keyBoard[2][0] = '7';
        keyBoard[2][1] = '8';
        keyBoard[2][2] = '9';

        keyBoard[3][0] = '*';
        keyBoard[3][1] = '0';
        keyBoard[3][2] = '3';
        return keyBoard;
    }

    public void printKeyboard() {
        char[][] newKeyBoard = createKeyboard();
        System.out.println(Arrays.toString(newKeyBoard[0]));
        System.out.println(Arrays.toString(newKeyBoard[1]));
        System.out.println(Arrays.toString(newKeyBoard[2]));
    }

    public String[] makeCopy(String[] names){
        System.out.println("Copied!");
        String[] copiedNames = Arrays.copyOf(names, names.length);
        return copiedNames;
    }

    public static void main(String[] args) {
        String[] names = new String[]{"mixa", "ukio", "barek", "krou", "fiha"};
        String[] toReplace = new String[]{"lopr", "boki"};
        new HarekCity().fixNames(names, toReplace);
        System.out.println(Arrays.toString(names));
    }
}
