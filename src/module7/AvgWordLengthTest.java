package module7;

public class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}

class AvgWordLength {

    public double count(String phrase) {
        String[] words = phrase.split(" ");
        double wordSize = 0;
        double wordCount = 0;

        for (String word : words) {
            wordSize += word.length();
            wordCount++;
        }
        double avgWordSize = wordSize / wordCount;

        return avgWordSize;
    }
}
