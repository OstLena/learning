package module3;

public class HarekDataMakerPhhh {

    public String aggregateSingle(String name, String age, String planet) {
        return "name - " + name + ", age - " + age + ", planet - " + planet;
    }

    public String[] aggregateAll(String[] names, int[] ages, String[] planets) {

        String[] result = new String[3];

        for (int i = 0; i < 3; i++) {
            String newResult = aggregateSingle(names[i], String.valueOf(ages[i]), planets[i]);
            result[i] = newResult;
        }
        return result;
    }
}
