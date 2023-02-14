package module10;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserReader {

//    Є текстовий файл file.txt. Необхідно прочитати файл, перетворити його в список об'єктів типу User, і записати їх у новий файл user.json.

    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();
        try (FileReader fileReader = new FileReader("src/module10/file.txt");
             Scanner scanner = new Scanner(fileReader)) {
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }
            while (scanner.hasNextLine()) {
                String userName = scanner.next();
                int userAge = scanner.nextInt();

                User user = new User(userName, userAge);
                userList.add(user);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try (FileWriter fileWriter = new FileWriter("src/module10/user.json")) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(userList, fileWriter);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
