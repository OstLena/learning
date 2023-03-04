package module13;

import java.io.IOException;

public class JsoupUserMain {

    public static void main(String[] args) throws IOException {
        JsoupUserService jsoupUserService = new JsoupUserService();
        jsoupUserService.createNewUser();
        jsoupUserService.updateUser();
        jsoupUserService.deleteUser();
        jsoupUserService.getAllUser();
        jsoupUserService.getUserById();
        jsoupUserService.getUserByName();

        JsoupCommentService jsoupCommentService = new JsoupCommentService();
        jsoupCommentService.printComments(1);

        JsoupUserTodoService jsoupUserTodoService = new JsoupUserTodoService();
        jsoupUserTodoService.printUserTodos(1);


    }
}
