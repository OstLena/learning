package module10;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FilePhoneReader {

    public static void main(String[] args) {


        try (InputStream fis = new FileInputStream("src/module10/phonesFile.txt");
             Scanner scanner = new Scanner(fis)) {
            while (scanner.hasNextLine()) {
                String phoneLine = scanner.nextLine();
                Pattern pattern = Pattern.compile("^((\\(\\d{3}\\))|\\d{3})[- ]\\d{3}-\\d{4}$");
                Matcher matcher = pattern.matcher(phoneLine);
                if (matcher.matches()) {
                    System.out.println(phoneLine);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
