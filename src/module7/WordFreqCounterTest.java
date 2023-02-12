package module7;

public class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));
        System.out.println(freqCounter.countFreq("Hello Java Hello Java Java", "java"));

        //0
//        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}

class WordFreqCounter {

    public float countFreq(String phrase, String word) {

        String phraseLowCase = phrase.toLowerCase();
        String wordLowCase = word.toLowerCase();

        float count = 0;
        int fromIndex = 0;

        int index = phraseLowCase.indexOf(wordLowCase, fromIndex);

        while (index != -1) {
            count ++;
            fromIndex = index + 1;
            index = phraseLowCase.indexOf(wordLowCase, fromIndex);
        }
        return count/ phrase.split(" ").length;
    }
}
