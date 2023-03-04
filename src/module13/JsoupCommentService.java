package module13;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JsoupCommentService {

    private static final String uri = "https://jsonplaceholder.typicode.com/users/";
    private static final String uriComment = "https://jsonplaceholder.typicode.com/posts/";
    private ObjectMapper mapper = new ObjectMapper();

    public void printComments(Integer userId) throws IOException {
        String postsJson = getUserPosts(userId);

        int maxId = getMaxPostId(postsJson);
        System.out.println("Max post id: " + maxId);
        String commentsByPostId = getCommentsByPostId(maxId);

        print(userId, maxId, commentsByPostId);
    }

    private static String getUserPosts(Integer userId) throws IOException {
        Connection.Response execute = Jsoup.connect(uri + userId + "/posts")
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

    private int getMaxPostId(String responseJson) throws JsonProcessingException {
        JsonNode array = mapper.readTree(responseJson);
        List<Integer> arrayIds = new ArrayList<>();
        int maxId = 0;
        if (array.isArray()) {
            for (final JsonNode objNode : array) {
                arrayIds.add(objNode.get("id").asInt());
            }
        }
        if (!arrayIds.isEmpty()) {
            maxId = Collections.max(arrayIds);
        }
        return maxId;
    }

    private static String getCommentsByPostId(Integer postId) throws IOException {
        Connection.Response execute = Jsoup.connect(uriComment + postId + "/comments")
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

    private void print(Integer userId, int maxId, String commentsByPostId) throws JsonProcessingException {
        JsonNode array = mapper.readTree(commentsByPostId);

        if (array.isArray()) {
            List<String> bodyList = new ArrayList<>();
            for (final JsonNode objNode : array) {
                bodyList.add(objNode.get("body").asText());
            }

            try (FileWriter fileWriter = new FileWriter("src/module13/user "
                    + userId + " post " + maxId + " comments.json")) {
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                gson.toJson(bodyList, fileWriter);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
