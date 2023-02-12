package module4;

public class ArlanHelper {
    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //**
        //**
//        System.out.println(helper.drawQuad(20));
//        System.out.println(helper.drawRect(2, 3, 'X'));
//        System.out.println(helper.drawLine(5));
        System.out.println(helper.drawPattern(new char[]{'J', 'a', 'v', 'a'}, 3));
    }

    public String drawRect(int width, int height, char c) {

        int indexWight = 1;
        int indexHeight = 1;
        String line = "";
        String space = "\n";
        String result = "";
        while (indexWight <= width) {
            line += c;
            indexWight++;
        }
        line += space;
        while (indexHeight <= height) {
            result += line;
            indexHeight++;
        }
        return result;
    }

    public String drawLine(int length) {
        String resultLine = "";
        int index = 1;
        while (index <= length) {
            if (index % 2 == 0) {
                resultLine += "#";
            } else {
                resultLine += "*";
            }
            index++;
        }
        return resultLine;
    }

    public String drawPattern(char[] pattern, int repeatCount) {
        String resultLine = "";
        String line = "";
        int index = 0;
        while (index <= pattern.length - 1) {
            line += pattern[index];
            index++;
        }
        while (repeatCount > 0) {
            resultLine += line;
            repeatCount--;
        }
        return resultLine;
    }

    public String drawQuad(int n) {
        String drawQuad = "";
        String line = "";

        int index = 1;
        int indexOuter = 1;

        while (index <= n) {
            line += "*";
            index++;
        }
        line += "\n";
        while (indexOuter <= n) {
            drawQuad += line;
            indexOuter++;
        }
        return drawQuad;
    }
}
