package module7;

public class GooSearchResultTest {

    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());
    }
}

class GooSearchResult {

    private String url;

    public GooSearchResult(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String parseDomain() {

        int slashCounter = 0;

        StringBuilder domainResult = new StringBuilder();
        for (int i = 0; i < url.length(); i++) {

            char ch = url.charAt(i);
            if (ch == '/') {
                slashCounter++;
            } else if (slashCounter == 2) {
                domainResult.append(ch);
            }
            if (slashCounter > 2) {
                break;
            }
        }
        return domainResult.toString();
    }
}
