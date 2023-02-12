package module7;

public class SummaryCreatorTest {

    public static void main(String[] args) {
        SummaryCreator summaryCreator = new SummaryCreator();

        //Mars
        String shortPhrase = "Mars";
        System.out.println(summaryCreator.create(shortPhrase));

        //Java is very po...
        String longPhrase = "Java is very popular language";
        System.out.println(summaryCreator.create(longPhrase));
    }
}

class SummaryCreator {

    public String create(String text) {

        if (text.length() <= 15) {
            return text;
        }
        String newText = text.substring(0, 15);
        char ch = text.charAt(15);
        if (ch != ' ') {
            newText = newText.concat("...");
        }
        return newText;
    }
}
