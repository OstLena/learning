package module4;

public class CheapStocks {

    public String getCheapStocks(String[] stocks) {
        String listedStock = "";
        for (String stock : stocks) {
            String[] splitStock = stock.split(" ");
            String name = splitStock[0];
            String price = splitStock[1];
            if (Integer.parseInt(price) < 200) {
                listedStock += name + " ";
            }
        }
        return listedStock;
    }

    public static void main(String[] args) {

        CheapStocks cheapStocks = new CheapStocks();
        cheapStocks.getCheapStocks(new String[]{"Jy 75", "obfec 98", "woy 887", "nami 210", "Roze 507", "Sy 586",
                "Lo 780", "wib 152", "Fi 531", "zyney 65", "akd 793", "liib 3", "civ 118", "Gu 483", "xyc 818"});
    }
}
