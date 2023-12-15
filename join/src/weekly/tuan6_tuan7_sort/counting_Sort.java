package weekly.tuan6_tuan7_sort;

import java.util.Scanner;

public class counting_Sort {
    public static int[] countingSort(int[] arr) {
       int[] countArr = new int[100];
        for(int i = 0; i < arr.length; i++){
            countArr[arr[i]]++;


        }
        return countArr;

        // Write your code here

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];


        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        int[] res = countingSort(ar);
        for (int i : res){
            System.out.print(i + " ");

    }
}
}
