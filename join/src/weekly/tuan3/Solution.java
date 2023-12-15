package weekly.tuan3;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'balancedSums' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static String balancedSums(List<Integer> arr) {
        int sum = 0;

        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        int tmp = 0;

        for (int j = 0; j < arr.size(); j++) {
            if (tmp == sum - tmp - arr.get(j)) {
                return "YES";
            }
            tmp += arr.get(j);
        }
        return "NO";
    }

    public static List<Integer> closestNumbers(List<Integer> arr) {
        List<Integer> tmp = new ArrayList<>();
        // Write your code here
        Collections.sort(arr);
        int min = 0;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) - arr.get(i - 1) < min) {
                tmp.clear();
                tmp.add(arr.get(i - 1));
                tmp.add(arr.get(i));
                min = arr.get(i) - arr.get(i - 1);

            } else if (arr.get(i) - arr.get(i - 1) == min) {
                tmp.add(arr.get(i - 1));
                tmp.add(arr.get(i));
            }
        }
        return tmp;


    }

    public static int pairs(int k, List<Integer> arr) {
        int cnt = 0;
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j) - arr.get(i) == k) {
                    cnt++;
                    break;
                }
            }

        }
        return cnt;

    }

    public static void minimumBribes(List<Integer> q) {
        int cnt = 0;

        for (int i = 0; i < q.size(); i++) {
            if (i + 3 < q.get(i)) {
                System.out.println("Too chaotic");
                return;
            }

            for (int j = i - 1; j >= q.get(i) - 2 && j >= 0; j--) {
                if (q.get(j) > q.get(i)) cnt++;
            }
        }
        System.out.println(cnt);


    }


}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, T).forEach(TItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                String result = Result.balancedSums(arr);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
