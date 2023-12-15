package weekly.tuan6_tuan7_sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class quicksort_p1 {
    public static List<Integer> quickSort(int[] arr) {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> equals = new ArrayList<>();
        List<Integer> res = new ArrayList<>();

        int q = arr[0];
        equals.add(q);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < q) {
                left.add(arr[i]);
            } else if (arr.equals(q)) {
                equals.add(arr[i]);
            } else {
                right.add(arr[i]);
            }

        }
        res.addAll(left);
        res.addAll(equals);
        res.addAll(right);
        return res;


        // Write your code here

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Integer[] res = quickSort(arr).toArray(new Integer[0]);
        for(int i : res){
            System.out.print(i + " ");
        }




    }

}
