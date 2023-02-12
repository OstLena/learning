package module3;

import java.util.Arrays;

public class HarekDataMaker {

    public String[] aggregateAll(String[] names, int[] ages, String[] planets) {

        String[] aggregatedNew = new String[3];
        for (int i = 0; i < 3; i++) {
            String result = aggregateSingle(names[i], String.valueOf(ages[i]), planets[i]);
            aggregatedNew[i] = result;
        }
        return aggregatedNew;
    }

    public String aggregateSingle(String name, String age, String planet) {
        return "name - " + name + ", age - " + age + ", planet - " + planet;
    }
}
