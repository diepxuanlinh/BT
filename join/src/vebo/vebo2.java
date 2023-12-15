package vebo;


import java.util.PriorityQueue;
import java.util.Scanner;


public class vebo2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n, k;
        n = sc.nextLong();
        k = sc.nextLong();
        PriorityQueue<Long> priorityQueue = new PriorityQueue<>();
        long sum = 0;

        for (int i = 1; i <= n; i++) {

            long tmp = sc.nextInt();
            if (i <= k) {
                priorityQueue.add(tmp);
                sum += tmp;

            } else {
                if (tmp > priorityQueue.peek()) {
                    long remove = priorityQueue.poll();
                    priorityQueue.add(tmp);
                    sum += tmp - remove;
                }

            }
            System.out.print(sum + " ");

            // System.out.println(tmp);


        }


    }
}
