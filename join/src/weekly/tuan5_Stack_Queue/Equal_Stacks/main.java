package weekly.tuan5_Stack_Queue.Equal_Stacks;

import java.io.*;

import java.util.*;

import java.util.stream.*;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'equalStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h1
     *  2. INTEGER_ARRAY h2
     *  3. INTEGER_ARRAY h3
     */
    static int sum(List<Integer> h) {
        int sumh = 0;
        for (int i = 0; i < h.size(); i++) {
            sumh += h.get(i);
        }
        return sumh;
    }
//    static void add(Queue<Integer> queue, List<Integer>list){
//        for(int i = 0; i < list.size(); i++){
//            queue.add(list.get(i));
//        }
//    }


    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {

        int sum1 = sum(h1);
        int sum2 = sum(h2);
        int sum3 = sum(h3);
        int min = Math.min(sum1, Math.min(sum2, sum3));
//        Queue<Integer> queue1 = new LinkedList<>();
//        Queue<Integer> queue2 = new LinkedList<>();
//        Queue<Integer> queue3 = new LinkedList<>();
//        add(queue1,h1);
//        add(queue2,h2);
//        add(queue3,h3);
        while (sum1 != sum2 || sum1 != sum3) {
            while (sum1 > min) {
                sum1-= h1.get(0);
                h1.remove(0);

            }
            min = Math.min(sum1, Math.min(sum2, sum3));
            while (sum2 > min) {
                sum2 -= h2.get(0);
                h2.remove(0);

            }
            min = Math.min(sum1, Math.min(sum2, sum3));
            while (sum3 > min) {
                sum3 -= h3.get(0);
                h3.remove(0);

            }


        }
        return Math.min(sum1, Math.min(sum2, sum3));
    }

}

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n1 = Integer.parseInt(firstMultipleInput[0]);

        int n2 = Integer.parseInt(firstMultipleInput[1]);

        int n3 = Integer.parseInt(firstMultipleInput[2]);

        List<Integer> h1 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> h2 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> h3 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.equalStacks(h1, h2, h3);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

