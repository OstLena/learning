package module13;


import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsoupUserService {

    private static final String uri = "https://jsonplaceholder.typicode.com/users";

    public void createNewUser() throws IOException {
        String createUserRequest = new String(Files.readAllBytes(Paths.get("src/module13/newUser.json")));

        Connection.Response execute = Jsoup.connect(uri)
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .followRedirects(false)
                .ignoreContentType(true)
                .method(Connection.Method.POST)
                .requestBody(createUserRequest)
                .execute();

        int statusCode = execute.statusCode();
        System.out.println("create statusCode = " + statusCode);

        String responseJson = execute.body();
        System.out.println("create responseJson = " + responseJson);
    }

    public void updateUser() throws IOException {
        String updateUserRequest = new String(Files.readAllBytes(Paths.get("src/module13/updateUser.json")));

        Connection.Response execute = Jsoup.connect(uri + "/1")
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .followRedirects(false)
                .ignoreContentType(true)
                .method(Connection.Method.PUT)
                .requestBody(updateUserRequest)
                .execute();

        int statusCode = execute.statusCode();
        System.out.println("update statusCode = " + statusCode);

        String responseJson = execute.body();
        System.out.println("update responseJson = " + responseJson);
    }

    public void deleteUser() throws IOException {

        Connection.Response execute = Jsoup.connect(uri + "/2")
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .followRedirects(false)
                .ignoreContentType(true)
                .method(Connection.Method.DELETE)
                .execute();

        int statusCode = execute.statusCode();
        System.out.println("delete statusCode = " + statusCode);

        String responseJson = execute.body();
        System.out.println("delete responseJson = " + responseJson);
    }

    public void getAllUser() throws IOException {

        Connection.Response execute = Jsoup.connect(uri)
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .followRedirects(false)
                .ignoreContentType(true)
                .method(Connection.Method.GET)
                .execute();

        int statusCode = execute.statusCode();
        System.out.println("get statusCode = " + statusCode);

        String responseJson = execute.body();
        System.out.println("get responseJson = " + responseJson);
    }

    public void getUserById() throws IOException {

        Connection.Response execute = Jsoup.connect(uri + "/3")
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .followRedirects(false)
                .ignoreContentType(true)
                .method(Connection.Method.GET)
                .execute();

        int statusCode = execute.statusCode();
        System.out.println("getById statusCode = " + statusCode);

        String responseJson = execute.body();
        System.out.println("getById responseJson = " + responseJson);
    }

    public void getUserByName() throws IOException {

        Connection.Response execute = Jsoup.connect(uri + "?username=Kamren")
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .followRedirects(false)
                .ignoreContentType(true)
                .method(Connection.Method.GET)
                .execute();

        int statusCode = execute.statusCode();
        System.out.println("getUserByName statusCode = " + statusCode);

        String responseJson = execute.body();
        System.out.println("getUserByName responseJson = " + responseJson);
    }


}
