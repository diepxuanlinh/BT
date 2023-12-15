package weekly.tuan6_tuan7_sort;

import java.io.*;

import java.util.*;

import java.util.stream.*;

import static java.util.stream.Collectors.toList;

import static java.util.stream.Collectors.joining;

class Result {

    /*
     * Complete the 'insertionSort2' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void print( List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }

    public static void insertionSort2(int n, List<Integer> arr) {
        // Write your code here
        for (int i = 0; i < n - 1; i++) {
            int j = i + 1;
            while (j > 0) {
                if (arr.get(j) < arr.get(j-1)) {
                    int tmp = arr.get(j);
                    arr.set(j,arr.get(j-1));
                    arr.set(j-1,tmp);
                    j--;
                } else break;
            }
            print(arr);
        }
    }
}

public class insertionSort2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.insertionSort2(n, arr);

        bufferedReader.close();
    }
}



