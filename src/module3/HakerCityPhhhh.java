package module3;

import java.util.Arrays;

public class HakerCityPhhhh {

    public String[] createEmptyNameArray() {
        String[] result = new String[0];
        return result;
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        return new int[]{age1, age2, age3, age4};
    }

    public void fixNames(String[] names, String[] toReplace) {
        int j = 0;
        for (int i = 0; i < 5; i++) {
            if (i % 2 != 0) {
                names[i] = toReplace[j];
                j++;
            }
        }
    }

    public void changeElectResult(String[] results) {
        String first = results[0];
        String last = results[results.length - 1];
        results[0] = last;
        results[results.length - 1] = first;
    }

    public String[] changeElectResultAgain(String[] results) {
        String newResults[] = new String[3];
        int j = 2;
        for (int i = 0; i < 3; i++) {
            newResults[i] = results[j];
        }
        j++;
        return newResults;
    }

    public String[] makeCopy(String[] names){
        System.out.println("Copied!");
        String [] newNames = Arrays.copyOf(names, names.length);
        return newNames;
    }

     public static void main(String[] args) {
        String[] names = new String[]{"mixa", "ukio", "barek", "krou", "fiha"};
        String[] toReplace = new String[]{"lopr", "boki"};
        new HarekCity().fixNames(names, toReplace);
        System.out.println(Arrays.toString(names));
    }
}
