public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world");
        int valPost = 10;
        int valPre = 10;
        int resultPost= valPost++%5;
        int resultPre= ++valPre%5;
        System.out.println(valPost);
        System.out.println(resultPost);

        System.out.println(valPre);
        System.out.println(resultPre);

    }
}
