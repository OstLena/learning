//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.stream.IntStream;
//
//public class BinarySearch {
//    public static void main(String[] args) {
//
//        int data[] = {7, 10, 3, 60, 34, 56, 1, 4, 65};
//        int start = 0;
//        int end = data.length - 1;
//        int medium = data.length / 2;
//        int numberToFind = 3;
//
//        for (int i = 0; i < data.length; i++) {
//            for (int j = i + 1; j < data.length; j++) {
//                if (data[i] > data[j]) {
//                    int temporary = data[j];
//                    data[j] = data[i];
//                    data[i] = temporary;
//                }
//            }
//        }
//        for (int i = 0; i < data.length; i++) {
//            System.out.print(data[i] + " ");
//        }
//
//        while (start < end){
//            if (numberToFind < data[medium]){
//                end = medium;
//                medium =
//            }
//        }
//    }
//}
