package module4;

import java.util.Arrays;

public class UberShop {
    public void printPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i] + " jup.");
        }
    }

    public void multiplyPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < 1000) {
                prices[i] *= 2;
            } else if (prices[i] >= 1000) {
                prices[i] *= 1.5f;
            }
        }
    }

    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks) {
        int first = showcaseStocks.length;
        int second = warehouseStocks.length;
        String[] newStock = new String[first + second];

        for (int i = 0; i <= showcaseStocks.length - 1; i++) {
            int index = 0;
            for (String showcaseStock : showcaseStocks) {
                newStock[index] = String.valueOf(showcaseStock);
                index++;
            }
            for (String warehouseStock : warehouseStocks) {
                newStock[index] = warehouseStock;
                index++;
            }
        }
        return newStock;
    }

    public int getPricesSum(int[] prices, int minPrice, int maxPrice) {
        int sum = 0;
        for (int price : prices) {
            if (price >= minPrice && price <= maxPrice) {
                sum += price;
            }
        }
        return sum;
    }

    public int[] findMinMaxPrices(int[] prices) {
        Arrays.sort(prices);
        if (prices.length == 0) {
            return prices;
        } else if (prices[0] == prices[prices.length - 1]) {
            return new int[]{prices[0]};
        } else
            return new int[]{prices[0], prices[prices.length - 1]};
    }

    public int getMinPriceCount(int[] prices) {
        int count = 1;
        if (prices.length == 0) {
            return 0;
        }
        Arrays.sort(prices);

        if (prices[0] == prices[prices.length - 1]) {
            return prices.length;
        }
        for (int i = 0; i < prices.length - 1; i++) {

            if (prices[0] == prices[i + 1]) {
                count++;
            } else break;
        }
        return count;
    }

    public int[] leavePrice9(int[] prices) {
        int count = 0;
        int j = 0;

        for (int price : prices) {
            if (price % 10 == 9) {
                count++;
            }
        }
        int[] newleavePrice9 = new int[count];
        for (int i = 0; i <= prices.length - 1; i++) {
            if (prices[i] % 10 == 9) {
                newleavePrice9[j] = prices[i];
                j++;
            }
        }

        return newleavePrice9;
    }

    public int[] removePrice(int[] prices, int toRemove) {

        int count = 0;
        int j = 0;
        for (int price : prices) {
            if (price == toRemove) {
                count++;
            }
        }
        int[] newPrices = new int[prices.length - count];
        for (int i = 0; i <= prices.length - 1; i++) {
            if (prices[i] != toRemove) {
                newPrices[j] = prices[i];
                j++;
            }
        }
        return newPrices;
    }

    //Test output
    public static void main(String[] args) {
//        UberShop shop = new UberShop();

        //Should be 100 jup. 23.5 jup. 400 jup. - one price per line
//        float[] prices = new float[]{100f, 23.5f, 400f};
//        shop.printPrices(prices);
//
//        int[] pricess = new int[]{12, 9, 11, 12, 11, 10, 10, 9, 9, 12, 11, 9};
//        System.out.println(shop.getMinPriceCount(pricess)); //Should be 2
//
//        int[] prices = new int[]{9, 4, 9, 4, 4, 4, 2, 4, 3, 3};
//        int toRemove = 4;
//        System.out.println(Arrays.toString(shop.removePrice(prices, toRemove)));

//        int[] prices = new int[]{39, 67, 39, 54, 89, 77, 79, 50, 39, 22};
//        System.out.println(Arrays.toString(shop.leavePrice9(prices)));

        UberShop shop = new UberShop();

        //Final result should be ["gun", "firebow", "firegun"]
        String[] showcaseStocks = new String[]{"gun", "firebow"};
        String[] warehouseStocks = new String[]{"firegun"};
        System.out.println(Arrays.toString(shop.mergeStocks(showcaseStocks, warehouseStocks)));
    }
}

