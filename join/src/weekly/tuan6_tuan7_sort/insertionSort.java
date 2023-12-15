//package weekly.tuan6_sort;
//
//import java.util.List;
//
//class Result {
//
//
//    public static void printArray(List<Integer> arr) {
//        for (int i = 0; i < arr.size(); i++)
//            System.out.print(arr.get(i) + " ");
//        System.out.println();
//    }
//
//
//    /*
//     * Complete the 'insertionSort1' function below.
//     *
//     * The function accepts following parameters:
//     *  1. INTEGER n
//     *  2. INTEGER_ARRAY arr
//     */
//
//    public static void insertionSort1(int n, List<Integer> arr) {
//        int key = arr.get(n - 1);
//        for (int j = n - 2; j >= 0; j--) {
//            if (arr.get(j) <= key) {
//                arr.set(j + 1, key);
//                printArray(arr);
//                return;
//            } else {
//                arr.set(j+1, arr.get(j));
//                printArray(arr);
//            }
//        }
//        arr.set(0,key);
//        printArray(arr);
//    }
//
//}
//
//public class insertionSort {
//}
