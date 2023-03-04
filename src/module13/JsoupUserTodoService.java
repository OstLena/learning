package module13;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;

public class JsoupUserTodoService {


    private static final String uri = "https://jsonplaceholder.typicode.com/users/";
    ObjectMapper mapper = new ObjectMapper();

    public void printUserTodos(Integer userId) throws IOException {
        String userTodos = getUserTodos(userId);

        JsonNode array = mapper.readTree(userTodos);

        if (array.isArray()) {
            for (final JsonNode objNode : array) {
                if (!objNode.get("completed").asBoolean()) {
                    System.out.println(objNode.get("title").asText());
                }
            }
        }
    }

    private static String getUserTodos(Integer userId) throws IOException {
        Connection.Response execute = Jsoup.connect(uri + userId + "/todos")
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .followRedirects(false)
                .ignoreContentType(true)
                .method(Connection.Method.GET)
                .execute();

        int statusCode = execute.statusCode();
        System.out.println("get statusCode = " + statusCode);

        return execute.body();
    }
}
